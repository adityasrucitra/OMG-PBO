package minggu9sl3;

import javax.swing.JOptionPane;

public class Persegi extends BangunDatar implements Proses, InputOutput {

    public double sisi;

    public Persegi() {
            cetak();
    }

    public Persegi(double s, double l, double k) {
        super(l, k);
        sisi = s;
    }
    
    public void testCetak(){
        cetak();
    }

    public double getLuas() {
        return luas;
    }

    
    public double getKeliling() {
        return keliling;
    }

    public void hitungLuas() {
        luas=sisi*sisi; 
    }

    public void hitungKeliling() {
        keliling=4*sisi;
    }
    
    public void input(){
        String x=JOptionPane.showInputDialog("Masukkan sisi : ");
        sisi= Float.parseFloat(x);
    }
    
    public void output(){
        JOptionPane.showMessageDialog(null,
                "Sisi = "+sisi
                +"\nkeliling = "+keliling 
                +"\nluas = "+luas
        );
    }
}
