public class Baum implements BinaryTreeInterface {

    Knoten wurzel;

    @Override
    public void add(Knoten k) {
        if (this.wurzel == null) {
            wurzel = k;
        } else {
            addKnoten(k, wurzel);
        }
    }

    @Override
    public void addKnoten(Knoten k, Knoten p) {
        Knoten links = p.getLinks();
        Knoten rechts = p.getRechts();

        if (links != null && links.getInhalt() < k.getInhalt()) {
            if (pruefeBlatt(links)) {
                links.setLinkenKnoten(k);
            } else {
                addKnoten(k, links);
            }
        } else if(rechts != null){
            if (pruefeBlatt(rechts)) {
                rechts.setRechtenKnoten(k);
            } else {
                addKnoten(k, rechts);
            }
        }
    }

    @Override
    public boolean pruefeBlatt(Knoten k) {
        return k.getBlatt();
    }

    public void preOrder(){
        preOrder(wurzel);
    }

    @Override
    public void preOrder(Knoten k) {
        System.out.println(k.getInhalt());
        if (k.getLinks() != null)
            preOrder(k.getLinks());
        if (k.getRechts() != null)
            preOrder(k.getRechts());
    }


}
