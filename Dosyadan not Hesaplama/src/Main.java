
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void notHesapla(String []parcalar,String dosyaismi){
         FileWriter fw;
        try {
            fw = new FileWriter(dosyaismi,true);
            BufferedWriter bw = new BufferedWriter(fw);
         
        double ortalama =(Integer.parseInt(parcalar[1])*0.2)+(Integer.parseInt(parcalar[2])*0.2)+(Integer.parseInt(parcalar[3])*0.6);
        
        if(ortalama>80 && ortalama<100){
            bw.write(parcalar[0]+",AA\n");
        }
        else if(ortalama>65 && ortalama<80){
            bw.write(parcalar[0]+",BA\n");
        }
        else if(ortalama>50 && ortalama<65){
            bw.write(parcalar[0]+",CC\n");
        }
        else{
            bw.write(parcalar[0]+",kaldiniz!!\n");
        }
        
        
        
        
        bw.close();
        
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
                 
    }
    public static void dosyaOku(String dosyaismi){
        try {
            FileReader fr = new FileReader("dosya.txt");
            BufferedReader br = new BufferedReader(fr);
            
           
            
            String line = br.readLine();
            
            while(line!=null){
                String []parcalar =line.split(",");
                
                notHesapla(parcalar,dosyaismi);
                line= br.readLine();
            } 
            
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        
        dosyaOku("harfnotlari.txt");
    }
}
