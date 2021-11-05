package no.skatteetaten.opiz;

import no.skatteetaten.opiz.config.SportConfig;
import no.skatteetaten.opiz.models.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class JavaConfigDemoApp {

    public static void main(String[] args) throws IOException {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.toString());

        // close the context
        context.close();
    }
}
