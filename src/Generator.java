import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import Models.Names;
import Models.Person;

/**
 * Created by ash2015 on 10/26/18.
 */

public class Generator {

    private List<String> mnames = null;
    private List<String> fnames = new ArrayList<>();
    private List<String> snames = new ArrayList<>();

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

    public static String getId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    private String getMaleName() {
        int r = new Random().nextInt(mnames.size());
        return mnames.get(r);
    }
    private String getFemaleName() {
        int r = new Random().nextInt(fnames.size());
        return fnames.get(r);
    }
    private String getSirName() {
        int r = new Random().nextInt(snames.size());
        return snames.get(r);
    }

    private static String fileToString(String filename) throws Exception {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }


    public Person generateMan() {
        //Person man = new Person(getId());

        return null;
    }
}

