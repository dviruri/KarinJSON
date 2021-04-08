package Model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MyList {

    public ArrayList<MyObject> Objects;

    public MyList()
    {
        Objects = new ArrayList<>();
    }

    public void AddObject(String host, String port, String productName, String contextName, String viewName, String lineActionNoMPD, String lineActionStaticMPD, String lineActionDynamicMPD)
    {
        MyObject obj = new MyObject(host, port, productName, contextName, viewName, lineActionNoMPD, lineActionStaticMPD, lineActionDynamicMPD);
        Objects.add(obj);
    }

    public void Serialize(String fileName)
    {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(Objects);
            Files.writeString(Path.of(fileName),json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Deserialize(String fileName)
    {
        try {
            Gson gson = new Gson();
            String json = Files.readString(Path.of(fileName));
            Type userListType = new TypeToken<ArrayList<MyObject>>(){}.getType();

            Objects = gson.fromJson(json, userListType);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
