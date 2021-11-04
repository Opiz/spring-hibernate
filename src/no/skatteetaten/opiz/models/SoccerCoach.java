package no.skatteetaten.opiz.models;

import no.skatteetaten.opiz.service.FortuneService;


public class SoccerCoach implements Coach {

    private FortuneService fortuneService;



    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Practice shots with goalkeeper";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
