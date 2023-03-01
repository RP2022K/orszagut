
package orszagut;

import java.io.*;
import java.util.*;

public class Orszagut {

    public static ArrayList<Jarmu> lista = new ArrayList<Jarmu>();
    
    public static void jarmuvekJonnek(String path) throws IOException{
        
        BufferedReader br = new BufferedReader(new FileReader(path));
        
        String sor = br.readLine();
        while(sor!=null){
            System.out.println(sor);
            String[] szavak = sor.split(";");
            if (szavak[0].equals("robogo")){
               Robogo r = new Robogo(szavak[1], Integer.parseInt(szavak[2]), Integer.parseInt(szavak[3]));
               lista.add(r);
            }else if(szavak[0].equals("audi")){
               AudiS8 a = new AudiS8(szavak[1], Integer.parseInt(szavak[2]), Boolean.parseBoolean(szavak[3]));
               lista.add(a);
            }else{
               System.out.println("Hibás sor");
            }
            sor= br.readLine();
        }//end while
        br.close();
    }
    
    public static void kiketMertunkBe() throws IOException {
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("buntetes.txt"));
        
        for(Object o: lista){
            if(o instanceof Robogo){
                bw.write(o.toString() +((( Robogo ) o ).haladhatItt(90)?" haladhat itt\n":" nem haladhat itt\n"));
            }else if(o instanceof AudiS8){
                bw.write(o.toString() +(((AudiS8) o ).gyorshajtottE(90)?" gyorsan hajtott\n":" nem hajtott gyorsan\n"));
                }
        }
        
        bw.close();
    }
    
    public static void main(String[] args){
        try{
        jarmuvekJonnek(args[0]);
        kiketMertunkBe();
        }catch(Exception e){
            System.out.println("Valami hiba történt!");
        }
    }
    
}
