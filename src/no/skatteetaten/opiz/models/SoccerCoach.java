package no.skatteetaten.opiz.models;


public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice shots with goalkeeper";
    }
}
