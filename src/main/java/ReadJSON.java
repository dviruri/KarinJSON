import Model.MyList;
import Model.MyObject;

public class ReadJSON {

    public static void main(String[] args) {
        System.out.println("Running...");

        MyList list = new MyList();
        list.Deserialize("C:\\temp\\myJSON.json");

        for (MyObject obj : list.Objects) {

            System.out.println(obj.toString());
        }

    }
}
