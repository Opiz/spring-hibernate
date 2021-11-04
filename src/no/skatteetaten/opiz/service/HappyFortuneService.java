package no.skatteetaten.opiz.service;


public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

    @Override
    public String[] getFortunes() {
        return new String[0];
    }
}
