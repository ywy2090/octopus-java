package sharding.sphere.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sharding.sphere.demo.entity.User;
import sharding.sphere.demo.mapper.UserMapper;

@Component
public class ShardingSphereService implements ApplicationRunner {

    @Autowired UserMapper userMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //
        // 1. 生成数据源
        // org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory#createDataSource
        // 2. 配置规则
        // org.apache.shardingsphere.core.rule.ShardingRule#createEncryptRule
        // 3. 加载规则
        // org.apache.shardingsphere.encrypt.rule.EncryptRule#initEncryptors

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
    }
}
