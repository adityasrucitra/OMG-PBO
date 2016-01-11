package minggu8sl3;

import javax.swing.JOptionPane;

public class Persegi extends BangunDatar implements Input, Output {

    float sisi;

    public void setLuas() {
        luas = sisi*sisi;
    }

    public float getLuas() {
        return luas;
    }
    
     public void masukkanData(){
        String x=JOptionPane.showInputDialog("Masukkan sisi : ");
        sisi=Float.parseFloat(x);       
        setLuas();
    }
    
    public void cetakData(){
        JOptionPane.showMessageDialog(null, 
                "Sisi = "+sisi               
                +"\nLuas = "+luas
                );
    }

}
