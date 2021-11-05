package no.skatteetaten.opiz.services.implementation;

import no.skatteetaten.opiz.services.FortuneService;
import org.springframework.stereotype.Component;


@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
