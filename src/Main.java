package src;

public class Main {

    public static void main (String[] args){

        uzol uzol1 = new uzol("1");
        uzol uzol2 = new uzol("2");
        uzol uzol3 = new uzol("3");
        uzol uzol4 = new uzol("4");
        uzol uzol5 = new uzol("5");
        uzol uzol6 = new uzol("6");
        uzol uzol7 = new uzol("7");
        uzol uzol8 = new uzol("8");

        uzol1.addConnection(uzol2,4);
        uzol1.addConnection(uzol6,6);
        uzol1.addConnection(uzol7,16);

        uzol2.addConnection(uzol2,1);
        uzol2.addConnection(uzol1,4);

        uzol3.addConnection(uzol2,24);
        uzol3.addConnection(uzol6,23);
        uzol3.addConnection(uzol5,18);
        uzol3.addConnection(uzol4,9);

        uzol4.addConnection(uzol3,9);
        uzol4.addConnection(uzol5,11);
        uzol4.addConnection(uzol8,7);

        uzol5.addConnection(uzol8,14);
        uzol5.addConnection(uzol7,10);
        uzol5.addConnection(uzol4,11);
        uzol5.addConnection(uzol3,18);
        uzol5.addConnection(uzol6,5);

        uzol6.addConnection(uzol3,5);
        uzol6.addConnection(uzol5,5);
        uzol6.addConnection(uzol7,5);
        uzol6.addConnection(uzol1,6);

        uzol7.addConnection(uzol1,16);
        uzol7.addConnection(uzol1,8);
        uzol7.addConnection(uzol1,10);
        uzol7.addConnection(uzol1,21);

        uzol8.addConnection(uzol4,7);
        uzol8.addConnection(uzol5,14);
        uzol8.addConnection(uzol7,21);

        graf g = new graf();
        g.setUzol("1",uzol1);
        g.setUzol("2",uzol2);
        g.setUzol("3",uzol3);
        g.setUzol("4",uzol4);
        g.setUzol("5",uzol5);
        g.setUzol("6",uzol6);
        g.setUzol("7",uzol7);
        g.setUzol("8",uzol8);

        cesta c = new cesta(g,"1");
        c.addUzol("6");
        c.addUzol("5");
        c.addUzol("4");
        c.addUzol("3");
System.out.println(c.getCena());
System.out.println(c.getCesta());
    }
}
