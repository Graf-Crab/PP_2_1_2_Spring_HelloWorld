import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    //16.45 start
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");



        ApplicationContext catApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat catsBean =
                (Cat) catApplicationContext.getBean("cats");
        Cat catsBean1 =
                (Cat) catApplicationContext.getBean("cats");

        System.out.println(bean == bean1);
        System.out.println(catsBean == catsBean1);

    }
}