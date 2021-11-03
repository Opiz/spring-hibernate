package no.skatteetaten.opiz;


import no.skatteetaten.opiz.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {


    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve SoccerCoach bean from spring container
        Coach soccerCoach = context.getBean("soccerCoach", Coach.class);

        // call methods on the bean
        System.out.println(soccerCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
