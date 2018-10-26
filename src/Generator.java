import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Models.Names;
import Models.Person;

/**
 * Created by ash2015 on 10/26/18.
 */

public class Generator {

    List<String> mnames = null;
    List<String> fnames = new ArrayList<>();
    List<String> snames = new ArrayList<>();

    Generator() {

        Names names = new Names();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = null;

        try {
            json = fileToString("json/mnames.json");
            names = gson.fromJson(json, Names.class);
            mnames = names.getData();

            json = fileToString("json/fnames.json");
            names = gson.fromJson(json, Names.class);
            fnames = names.getData();

            json = fileToString("json/snames.json");
            names = gson.fromJson(json, Names.class);
            snames = names.getData();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String fileToString(String filename) throws Exception {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }


    public Person generateMan() {
        Person man = new Person();

        return null;
    }
}

