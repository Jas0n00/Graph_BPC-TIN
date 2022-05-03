package src;

import java.util.LinkedList;

public class cesta {

    private int cena;
    graf g;
    private LinkedList<uzol> cesta = new LinkedList<>();


    public LinkedList<String> getCesta() {
        LinkedList<String> uzly_m = new LinkedList<>();
        for(int x = 0; x < cesta.size();x++ ) {
            uzly_m.add(cesta.get(x).getName());
        }
        return uzly_m;
    }

    public void setCesta(LinkedList<uzol> cesta) {
        this.cesta = cesta;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
public cesta(graf g, String start){
        this.g = g;
        uzol u = g.getUzly().get(start);
        cesta.addFirst(u);
}
   public void addUzol(String name){
       uzol u = g.getUzly().get(name);
       cena+=u.getSusedia().get(cesta.getLast());
       cesta.addLast(u);
   }
}
