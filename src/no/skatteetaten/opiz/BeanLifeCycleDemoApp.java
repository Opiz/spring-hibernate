package no.skatteetaten.opiz;

import no.skatteetaten.opiz.models.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLifeCycleDemoApp {


    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach trackCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(trackCoach.getDailyWorkout());

        // close context
        context.close();
    }
}
