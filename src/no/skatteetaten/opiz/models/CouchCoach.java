package no.skatteetaten.opiz.models;

import org.springframework.stereotype.Component;


@Component
public class CouchCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Sit in couch all day and eat ice cream. Just Do It!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
