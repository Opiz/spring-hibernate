package no.skatteetaten.opiz;

import no.skatteetaten.opiz.models.Coach;
import no.skatteetaten.opiz.services.implementation.FileFortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class AnnotationDemoApp {

    public static void main(String[] args) throws IOException {

        // retrieve spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        //System.out.println(coach.toString());

        // close the context
        context.close();
    }
}
