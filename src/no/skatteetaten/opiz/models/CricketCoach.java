package no.skatteetaten.opiz.models;


import no.skatteetaten.opiz.service.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAdress;
    private String team;
    
    
    // create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - FortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAdress = emailAdress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Crick som crackets";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String[] getDailyFortunes() {
        return fortuneService.getFortunes();
    }
}
