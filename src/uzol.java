package src;

import java.util.HashMap;
import java.util.Map;

public class uzol {

    private String name;



    private Map<uzol,Integer> susedia = new HashMap<>();

    public uzol(String n){
        setName(n);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<uzol, Integer> getSusedia() {
        return susedia;
    }

    public void setSusedia(Map<uzol, Integer> susedia) {
        this.susedia = susedia;
    }

    public void addConnection(uzol u,Integer i){
        susedia.put(u,i);
    }

}
