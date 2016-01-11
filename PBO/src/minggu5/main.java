/*
 *  Adityas Rucitra Pradipta <adityasrucitra@gmail.com>
 *  +6285292862417
 *  Copyright 2015
 */
package minggu5;


import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hitung ht=new Hitung();
        
        String strMasukan=JOptionPane.showInputDialog(null,"Masukkan angka :");
        double masukan=Double.parseDouble(strMasukan);
        
        ht.setPositifNegatif(masukan);
        ht.setAkar(masukan);
        ht.setGanjilGenap(masukan);
        ht.setKuadrat(masukan);
        
        System.out.println("angka = "+masukan);
        System.out.println("akar = "+ht.getAkar());
        System.out.println("Ganjil/genap = "+ht.getGanjilGenap());
        System.out.println("Kuadrat = "+ht.getKuadrat());
        System.out.println("positif/negatif = "+ht.getPositifNegatif());
        
    }
    
}
