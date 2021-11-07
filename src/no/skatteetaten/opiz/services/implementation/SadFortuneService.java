package no.skatteetaten.opiz.services.implementation;

import no.skatteetaten.opiz.services.FortuneService;


public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day!";
    }
}
