import com.wzh.mapper.UserMapper;
import com.wzh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.getAllUsers()) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void test01() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        context.getBean("")
    }
}
