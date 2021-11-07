package no.skatteetaten.opiz.models.implementation;

import no.skatteetaten.opiz.models.Coach;
import no.skatteetaten.opiz.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class LazyCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public LazyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Get up and, ehm... fuck y'all, ain't nobody got time for that!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return "LazyCoach:\n"
                + ">> Daily Workout: '" + this.getDailyWorkout() + "'\n"
                + ">> Daily Fortune: '" + fortuneService.getFortune() + "'\n"
                + ">> Email: '" + email + "'\n"
                + ">> Team: '" + team + '\'';
    }
}
