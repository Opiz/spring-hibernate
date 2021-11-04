package no.skatteetaten.opiz;


import no.skatteetaten.opiz.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {

    public static void main(String[] args) {

        // create a spring container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("practiceActivity-applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("soccerCoach", Coach.class);

        Coach secondCoach = context.getBean("soccerCoach", Coach.class);

        // Verify that the beans are same object
        boolean result = (coach == secondCoach);

        System.out.printf("Result: %s%n", result);

        // close the context
        context.close();
    }
}
