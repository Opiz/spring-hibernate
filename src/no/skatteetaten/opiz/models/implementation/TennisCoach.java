package no.skatteetaten.opiz.models.implementation;

import no.skatteetaten.opiz.models.Coach;
import no.skatteetaten.opiz.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

    // Field Injection
    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    // Additional fields using Value Injection
    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // Constructor Injection
//    @Autowired
//    public TennisCoach(
//            @Qualifier("randomFortuneService") FortuneService fortuneService)
//    {
//        //System.out.println(">> TennisCoach: inside all-args constructor");
//        this.fortuneService = fortuneService;
//    }

    // GETTER and SETTER methods:

    // Setter Injection
    // @Autowired
//    @Qualifier("randomFortuneService")
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    // OVERRIDE methods:

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "TennisCoach:\n"
                + ">> Daily Workout: '" + this.getDailyWorkout() + "'\n"
                + ">> Daily Workout: '" + fortuneService.getFortune() + "'\n"
                + ">> Email: '" + email + "'\n"
                + ">> Team: '" + team + '\'';
    }
}
