/*
 *  Adityas Rucitra Pradipta <adityasrucitra@gmail.com>
 *  +6285292862417
 *  Copyright 2015
 */
package minggu3;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class HitungTemperatur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Temperatur tmp=new Temperatur();
        String strCalcius=JOptionPane.showInputDialog("masukan celcius");
        double celcius=Double.parseDouble(strCalcius);
        tmp.setRheamur(celcius);
        tmp.setKelvin(celcius);
        tmp.setFahrenheit(celcius);
        System.out.println("Hasil Reamur    : "+tmp.getRheamur());
        System.out.println("Hasil Kalvin    : "+tmp.getKelvin());
        System.out.println("Hasil Farenhait : "+tmp.getFahrenheit());
        
     
    }
    
}
