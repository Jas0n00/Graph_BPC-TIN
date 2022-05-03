package src;

import java.util.HashMap;
import java.util.Map;

public class graf {

    public Map<String, uzol> getUzly() {
        return uzly;
    }

    public void setUzol(String n, uzol u) {
        uzly.put(n,u);
    }

    private Map <String,uzol> uzly = new HashMap<>();


}
