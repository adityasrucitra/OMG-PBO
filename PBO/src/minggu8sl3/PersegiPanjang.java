
package minggu8sl3;

import javax.swing.JOptionPane;

public class PersegiPanjang extends BangunDatar implements Input, Output  {
    float p;
    float l;
    double x;
        
    public void setLuas(){
        luas=p*l;
    }
    
    public float getLuas(){
        return luas;
    }
    
    public void masukkanData(){
        String x=JOptionPane.showInputDialog("Masukkan panjang : ");
        p=Float.parseFloat(x);
        String y=JOptionPane.showInputDialog("Masukkan lebar : ");
        l=Float.parseFloat(y);
        setLuas();
    }
    
    public void cetakData(){
        JOptionPane.showMessageDialog(null, 
                "Panjang = "+p
                +"\nLebar = "+l
                +"\nLuas = "+luas
                );
    }
    
  
}
