package my.first.java.demo.command;

import java.util.List;
import my.first.java.demo.entity.User;
import my.first.java.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

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
