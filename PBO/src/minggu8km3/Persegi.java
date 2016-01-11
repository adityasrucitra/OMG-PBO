
package minggu8km3;

import javax.swing.JOptionPane;

public class Persegi extends BangunDatar implements InterfaceInput, InterfaceOutput{
    public float sisi;
    
    public float getKeliling(){
        return keliling;
    }
    
    public float getLuas(){
        return luas;
    }
    
    public void setKeliling(){
        keliling=4*sisi;
    }
    
    public void setLuas(){
        luas=sisi*sisi;
    }    
    //////////////////
    public void input(){
        String x=JOptionPane.showInputDialog("Masukkan sisi persegi : ");
        sisi=Float.parseFloat(x);
    }
    
    public void output(){
        JOptionPane.showMessageDialog(null,
                "Sisi persegi = "+sisi
                +"\nLuas Persegi ="+luas
        );         
    }
    //////////////////
}
