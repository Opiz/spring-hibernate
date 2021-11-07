package no.skatteetaten.opiz.util;

import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ResourceFileReader {

    public static List<String> readResourceFile(Resource resource) {

        List<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new FileReader(resource.getFile()))) {

            String line;
            while ((line = reader.readLine()) != null)
                data.add(line);
        }
        catch (Exception e) {
            e.getMessage();
        }

        return data;
    }
}
