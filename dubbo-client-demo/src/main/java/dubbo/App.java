package dubbo;

import dubbo.service.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
        ac.start();
        MemberService service = (MemberService) ac.getBean("memberService");
        String info = service.sayHello("wangbin");
        System.out.println(info);
    }
}
