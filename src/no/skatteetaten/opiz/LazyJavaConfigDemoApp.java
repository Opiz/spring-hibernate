package no.skatteetaten.opiz;

import no.skatteetaten.opiz.config.LazyConfig;
import no.skatteetaten.opiz.config.SportConfig;
import no.skatteetaten.opiz.models.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LazyJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LazyConfig.class);

        // get the bean from spring container
        Coach coach = context.getBean("lazyCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.toString());

        // close the context
        context.close();
    }
}
