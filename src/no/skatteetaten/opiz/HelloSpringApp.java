package no.skatteetaten.opiz;


import no.skatteetaten.opiz.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {


    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve SoccerCoach bean from spring container
        Coach myCoach = context.getBean("cricketCoach", Coach.class);

        // call methods on the bean
        System.out.println(myCoach.getDailyWorkout());

        // let's call our new method for fortune
        System.out.println(myCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
