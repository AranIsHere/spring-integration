import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @Author Aran
 * @Date 2020/10/6 下午10:22
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        UserService userService = (UserService)context.getBean("userService");
        String result = userService.getUser("Aran");
        System.out.println(result);
    }
}
