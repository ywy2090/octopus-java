package sharding.sphere.demo.service;

import java.util.List;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sharding.sphere.demo.entity.User;
import sharding.sphere.demo.mapper.UserMapper;

@Component
public class ShardingSphereService implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(ShardingSphereService.class);

    @Autowired UserMapper userMapper;

    @Autowired private SqlSessionFactory sqlSessionFactory;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String userName = "王章11";
        String phoneNumber = "15002982093";
        String idNumber = "142829199504222023";

        User user = new User();
        user.setUserName(userName);
        user.setPhoneNumber(phoneNumber);
        user.setIdNumber(idNumber);

        int insert = userMapper.insertUser(user);
        System.out.println("插入成功: " + insert);

        List<User> userList = userMapper.findUser("user_name", userName);
        System.out.println("findUser查询返回: " + userList);

        List<User> userList1 = userMapper.findUserByRange("id_number", idNumber, idNumber);
        System.out.println("findUserByRange查询返回: " + userList1);

        List<User> userList2 = userMapper.findUserByLike("user_name", "王%");
        System.out.println("findUserByLike查询返回: " + userList2);

        int deleteRet = userMapper.deleteUser("user_name", userName);
        System.out.println("deleteUser返回: " + deleteRet);
    }
}
