public class Knoten {

    private Knoten links;
    private Knoten rechts;
    private int inhalt;
    private boolean blatt;

    public Knoten(int inhalt){
        this.inhalt = inhalt;
    }

    public void setLinkenKnoten(Knoten k){
        this.links = k;
        this.blatt = false;
    }

    public void setRechtenKnoten(Knoten k){
        this.rechts = k;
        this.blatt = false;
    }

    public int getInhalt(){
        return this.inhalt;
    }

    public Knoten getLinks(){
        return links;
    }

    public Knoten getRechts(){
        return rechts;
    }

    public boolean getBlatt(){
        return this.blatt;
    }
}
