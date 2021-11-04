package no.skatteetaten.opiz.models;


import no.skatteetaten.opiz.service.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
        System.out.println("TrackCoach: inside no-arg constructor");
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanUpStuffYoYo() {
        System.out.println("TrackCoach: inside method doMyCleanUpStuffYoYo");

    }
}
