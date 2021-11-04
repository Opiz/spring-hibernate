package no.skatteetaten.opiz;

import no.skatteetaten.opiz.models.Coach;
import no.skatteetaten.opiz.models.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanScopeDemoApp {


    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach trackCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they point to the same address in memory
        boolean result = (trackCoach == alphaCoach);
        System.out.printf("%nIs Equal: %s%n", result);


        // print out their address
        System.out.printf("%nMemory location: %s%n", System.identityHashCode(trackCoach));

        System.out.printf("%nMemory location: %s%n", System.identityHashCode(alphaCoach));

        // close context
        context.close();
    }
}
