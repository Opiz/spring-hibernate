package no.skatteetaten.opiz;

import no.skatteetaten.opiz.models.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class SetterDemoApp {


    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve CricketCoach bean from spring container
        CricketCoach myCoach = context.getBean("cricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        System.out.println(myCoach.getEmailAdress());

        System.out.println(myCoach.getTeam());

        System.out.println(Arrays.toString(myCoach.getDailyFortunes()));

        // close the context
        context.close();
    }
}
