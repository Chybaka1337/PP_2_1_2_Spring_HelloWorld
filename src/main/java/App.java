import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw1 = context.getBean(HelloWorld.class);
        HelloWorld hw2 = context.getBean(HelloWorld.class);
        System.out.println(hw1 == hw2);
        Cat cat1 = context.getBean(Cat.class);
        Cat cat2 = context.getBean(Cat.class);
        System.out.println(cat1 == cat2);
    }
}