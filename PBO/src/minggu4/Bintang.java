/*
 *  Adityas Rucitra Pradipta <adityasrucitra@gmail.com>
 *  +6285292862417
 *  Copyright 2015
 */
package minggu4;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class Bintang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strA=JOptionPane.showInputDialog(null,"Masukkan angka :");
        int a=Integer.parseInt(strA);
        
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
    
}
