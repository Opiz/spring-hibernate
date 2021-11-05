package no.skatteetaten.opiz;

import no.skatteetaten.opiz.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoApp {

    public static void main(String[] args) {

        // retrieve spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        Coach couchCoach = context.getBean("couchCoach", Coach.class);

        // call a method on the bean
        System.out.printf("Daily Workout: %s%n", coach.getDailyWorkout());

        System.out.printf("Daily Workout: %s%n", couchCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
