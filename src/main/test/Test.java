import com.wonders.controller.AccountServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    @org.junit.Test
    public void test() {
        AccountServlet bean = ac.getBean(AccountServlet.class);
        bean.test();
    }
}
