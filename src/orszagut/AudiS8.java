
package orszagut;

public class AudiS8 extends Jarmu{
    private boolean lezerblokkolo;

    public AudiS8(String rendszam, int aktSebesseg, boolean lezerblokkolo) {
        super(aktSebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }
    
    public boolean gyorshajtottE(int sebesseg){
        if (this.sebesseg > sebesseg && !this.lezerblokkolo)
        return true;
        return false;
    }
    
    public boolean vanLezerblokkolo(){
        return lezerblokkolo;
    }

    public void setLezerblokkolo(boolean lezerblokkolo) {
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public String toString() {
        return "Audi: " + super.toString();
    }
    
}
