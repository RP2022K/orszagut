
package orszagut;

public class Robogo extends Jarmu implements KisGepjarmu {
    private int maxSebesseg;

    public Robogo(String rendszam, int aktSebesseg, int maxSebesseg) {
        super(aktSebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }
    
    public boolean gyorshajtottE(int sebesseg){
        if (this.sebesseg > sebesseg) return true;
        return false;
    }
    
    public boolean haladhatItt(int sebesseg){
        if (this.maxSebesseg > sebesseg) return false;
        return true;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }
    
    
}
