/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6;
class pasangdadu {
    private int dadu1; 
    private int dadu2; 
      pasangdadu() {
        // Kocok dadu dengan menggunakan bilangan acak antara 1 dan 6
      dadu1 = (int)(Math.random()*6) + 1;
      dadu2 = (int)(Math.random()*6) + 1; 
          System.out.println("Hallow");
      }
     
    public void cetak()
    {  System.out.println("isi dadu 1 = "+dadu1);
        System.out.println("isi dadu 2 = "+dadu2);
    }
    
 public void kocok() {
        // Kocok dadu dengan menggunakan bilangan acak antara 1 dan 6
        dadu1 = (int)(Math.random()*6) + 1;
        dadu2 = (int)(Math.random()*6) + 1;
    }
}

public class latihan {

    public static void main(String[] args) {
        
        pasangdadu dadu = new pasangdadu();
        dadu.kocok();
        dadu.cetak(); 
        
       
    
    }
    
}
