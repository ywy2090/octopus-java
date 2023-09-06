package sharding.sphere.demo.service;

import java.io.StringWriter;
import java.util.List;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.sql.parser.SQLStatementParser;
import com.alibaba.druid.util.JdbcConstants;
import org.apache.ibatis.session.SqlSessionFactory;
import org.bouncycastle.util.encoders.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sharding.sphere.demo.entity.BinaryUser;
import sharding.sphere.demo.entity.User;
import sharding.sphere.demo.mapper.BinaryUserMapper;
import sharding.sphere.demo.mapper.UserMapper;
import sharding.sphere.demo.utils.AESUtil;

@Component
public class ShardingSphereService implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(ShardingSphereService.class);

    @Autowired UserMapper userMapper;

    @Autowired
    BinaryUserMapper binaryUserMapper;

    @Autowired private SqlSessionFactory sqlSessionFactory;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String sql = "select * from t where id=1 and name=ming group by uid limit 1,200 order by ctime";

        SQLExpr expr = SQLUtils.toSQLExpr(sql, JdbcConstants.MYSQL);

        // 新建 MySQL Parser
        SQLStatementParser parser = new MySqlStatementParser(sql);

        // 使用Parser解析生成AST，这里SQLStatement就是AST
        SQLStatement sqlStatement = parser.parseStatement();

        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        sqlStatement.accept(visitor);

        System.out.println("getTables:" + visitor.getTables());
        System.out.println("getParameters:" + visitor.getParameters());
        System.out.println("getOrderByColumns:" + visitor.getOrderByColumns());
        System.out.println("getGroupByColumns:" + visitor.getGroupByColumns());
        System.out.println("---------------------------------------------------------------------------");

        /*
        // 使用select访问者进行select的关键信息打印
        SelectPrintVisitor selectPrintVisitor = new SelectPrintVisitor();
        sqlStatement.accept(selectPrintVisitor);

        System.out.println("---------------------------------------------------------------------------");
        // 最终sql输出
        StringWriter out = new StringWriter();
        TableNameVisitor outputVisitor = new TableNameVisitor(out);
        sqlStatement.accept(outputVisitor);
        System.out.println(out.toString());
        */

        String key = "1733714727177796557";

        String userName = "王章11";
        String phoneNumber = "15002982093";
        String idNumber = "142829199504222023";

        BinaryUser user = new BinaryUser();
        user.setUserName(userName);
        user.setPhoneNumber(phoneNumber);
        user.setIdNumber(idNumber);
        user.setBinaryUserName(AESUtil.encrypt(userName, key));
        user.setBinaryPhoneNumber(AESUtil.encrypt(phoneNumber, key));
        user.setBinaryIdNumber(AESUtil.encrypt(idNumber, key));

        System.out.println("en user name: " + Hex.toHexString(user.getBinaryUserName()));
        System.out.println("en phone number: " + Hex.toHexString(user.getBinaryPhoneNumber()));
        System.out.println("en id number: " + Hex.toHexString(user.getBinaryIdNumber()));

        int insert = binaryUserMapper.insertUser(user);
        System.out.println("插入成功: " + insert);

        List<User> userList = binaryUserMapper.findUser("user_name", userName);
        System.out.println("findUser查询返回: " + userList);

        List<User> userList1 = binaryUserMapper.findUserByRange("id_number", idNumber, idNumber);
        System.out.println("findUserByRange查询返回: " + userList1);

        List<User> userList2 = binaryUserMapper.findUserByLike("user_name", "王%");
        System.out.println("findUserByLike查询返回: " + userList2);

        List<User> userList3 = binaryUserMapper.findUserByLike("encrypted_user_name", "王%");
        System.out.println("findUserByLike查询返回: " + userList2);

        // int deleteRet = userMapper.deleteUser("user_name", userName);
        // System.out.println("deleteUser返回: " + deleteRet);
    }
}
