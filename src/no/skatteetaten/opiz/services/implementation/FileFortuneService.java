package no.skatteetaten.opiz.services.implementation;

import static no.skatteetaten.opiz.util.ResourceFileReader.readResourceFile;

import no.skatteetaten.opiz.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;


@Component
public class FileFortuneService implements FortuneService {

    @Value("classpath:resource/fortunes.txt")
    private Resource resource;

    // create a random number generator
    private Random random = new Random();

    private List<String> data;


    // define my init method
    @PostConstruct
    public void doStartupStuff() {
        System.out.println(">> FileFortuneService: inside of doStartupStuff()");

        try {
            if (data == null)
                data = readResourceFile(resource);
        }
        catch (Exception e) {
            e.getMessage();
        }
    }


    @Override
    public String getFortune() {

        if (data == null) return "";

        // pick a random string from array
        int index = random.nextInt(data.size());

        return data.get(index);
    }
}
