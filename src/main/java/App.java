import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() + " Hashcode : " + bean);
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage() + " Hashcode : " + bean2);
        System.out.println(bean == bean2);
        Cat bean3 = (Cat) applicationContext.getBean("Cat");
        System.out.println(bean3.getMessage() + " Hashcode : " + bean3);
        Cat bean4 = (Cat) applicationContext.getBean("Cat");
        System.out.println(bean4.getMessage() + " Hashcode : " + bean4);
        System.out.println(bean3 == bean4);
    }
}