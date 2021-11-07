package no.skatteetaten.opiz.models.implementation;

import no.skatteetaten.opiz.models.Coach;
import no.skatteetaten.opiz.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "SwimCoach:\n"
                + ">> Daily Workout: '" + this.getDailyWorkout() + "'\n"
                + ">> Daily Fortune: '" + fortuneService.getFortune() + "'\n"
                + ">> Email: '" + email + "'\n"
                + ">> Team: '" + team + '\'';
    }
}
