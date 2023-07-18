import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat catsBean =
                (Cat) applicationContext.getBean("cats");
        Cat catsBean1 =
                (Cat) applicationContext.getBean("cats");

        System.out.println(bean == bean1);
        System.out.println(catsBean == catsBean1);

    }
}