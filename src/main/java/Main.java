import com.wonders.beans.Person;
import com.wonders.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person p = (Person) ac.getBean("person");
        Student s = (Student) ac.getBean("student");
        Student s2 = (Student) ac.getBean("student2");
        Object car2 = ac.getBean("car2");
        Object car3 = ac.getBean("car3");

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getCar());
        System.out.println(p.getCarList());
        System.out.println(p.toString());

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGrade());
        System.out.println(s.toString());

        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getGrade());
        System.out.println(s2.toString());

        System.out.println(car2);
        System.out.println(car3);

    }
}
