package no.skatteetaten.opiz.service;


public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

    @Override
    public String[] getFortunes() {
        return new String[]{
                "'Your parents died, but they're rich...'",
                "'You're fat, but you live at least in a poor country'",
                "'You have diabetes, but luckily you don't gain weight'"
        };
    }
}
