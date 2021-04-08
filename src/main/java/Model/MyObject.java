package Model;

import java.io.Serializable;

public class MyObject implements Serializable {

    public String Host;
    public String Port;
    public String ProductName;
    public String ContextName;
    public String ViewName;
    public String LineActionNoMPD;
    public String LineActionStaticMPD;
    public String LineActionDynamicMPD;

    public MyObject(String host, String port, String productName, String contextName, String viewName, String lineActionNoMPD, String lineActionStaticMPD, String lineActionDynamicMPD) {
        Host = host;
        Port = port;
        ProductName = productName;
        ContextName = contextName;
        ViewName = viewName;
        LineActionNoMPD = lineActionNoMPD;
        LineActionStaticMPD = lineActionStaticMPD;
        LineActionDynamicMPD = lineActionDynamicMPD;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "Host='" + Host + '\'' +
                ", Port='" + Port + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", ContextName='" + ContextName + '\'' +
                ", ViewName='" + ViewName + '\'' +
                ", LineActionNoMPD='" + LineActionNoMPD + '\'' +
                ", LineActionStaticMPD='" + LineActionStaticMPD + '\'' +
                ", LineActionDynamicMPD='" + LineActionDynamicMPD + '\'' +
                '}';
    }
}
