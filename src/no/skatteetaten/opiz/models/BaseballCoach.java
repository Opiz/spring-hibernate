package no.skatteetaten.opiz.models;

import no.skatteetaten.opiz.service.FortuneService;


public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;


    // define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneService to get a fortune

        return fortuneService.getFortune();
    }
}
