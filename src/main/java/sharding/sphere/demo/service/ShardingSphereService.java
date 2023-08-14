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

        String userName = "王章11";
        String phoneNumber = "15002982093";
        String idNumber = "142729199504222023";

        User user = new User();
        user.setUserName(userName);
        user.setPhoneNumber(phoneNumber);
        user.setIdNumber(idNumber);

        int insert = userMapper.insertUser(user);
        System.out.println("插入成功: " + insert);

        List<User> user1 = userMapper.findUser("user_name", userName);

        List<User> idNumber1 = userMapper.findUserByRange("id_number", idNumber);
        System.out.println(idNumber1);

        System.out.println("查询返回: " + user1);
    }
}
