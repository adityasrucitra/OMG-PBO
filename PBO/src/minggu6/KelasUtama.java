package minggu6;

import javax.swing.JOptionPane;

public class KelasUtama {

    public static void main(String[] args) {
             String xx=JOptionPane.showInputDialog("Masukkan nama");
             
             Mahasiswa mhs1=new Mahasiswa(xx);
             
             mhs1.cetak();
             
             
        
    }    
}
