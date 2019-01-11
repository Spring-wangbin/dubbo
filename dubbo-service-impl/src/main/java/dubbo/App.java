package dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-server.xml");
        ac.start();
        System.out.println("会员服务启动。。。");
        System.in.read();
    }
}
