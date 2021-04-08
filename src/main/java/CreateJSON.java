import Model.MyList;

import java.util.logging.Logger;

public class CreateJSON {

    public static void main(String[] args) {
        System.out.println("Running...");

        MyList list = new MyList();
        list.AddObject(
                "SJSC",
                "7171",
                "MVMVS",
                "CUYSYS",
                "JCPU",
                "Create a new channel",
                "Edit channel name",
                "Start a channel");
        list.AddObject(
                "SJSD",
                "7178",
                "MVMVS",
                "CUYSYS",
                "JCPU",
                "Create a new channel",
                "Edit channel name",
                "Start a channel");
        list.AddObject(
                "SJSG",
                "3489",
                "MVMVS",
                "CUYSYS",
                "JCPU",
                "Create a new channel",
                "Edit channel name",
                "Start a channel");
        list.AddObject(
                "ESAG",
                "7899",
                "MVMVS",
                "CUYSYS",
                "JCPU",
                "Create a new channel",
                "Edit channel name",
                "Start a channel");


        list.Serialize("C:\\temp\\myJSON.json");
    }



}
