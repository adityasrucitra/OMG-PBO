package minggu7sl3;

import javax.swing.JOptionPane;

public class Dosen extends Karyawan {
    private String mataKuliah;
    
 public Dosen(){
     
 }
    
    public Dosen(String nama, String nip, double gaji, String golongan) {
        super(nama, nip, gaji, golongan);        
    }
    
    public void input() {
        super.nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        super.nip = JOptionPane.showInputDialog("Masukkan NIP : ");
        String strGaji = JOptionPane.showInputDialog("Masukkan Gaji : ");;
        super.gaji = Integer.parseInt(strGaji);
        super.golongan = JOptionPane.showInputDialog("Masukkan golongan : ");
        this.mataKuliah = JOptionPane.showInputDialog("Masukkan mata kuliah : ");
    }

    public void cetak() {
        JOptionPane.showMessageDialog(null,
                "<<DOSEN>>"
                +"\nNama : "+getNama()
                + "\nNIP : "+getNip()
                + "\nGolongan : "+getGolongan()
                + "\nGaji : "+getGaji()
                + "\nMata kuliah : "+this.mataKuliah
        );

    }
    
}
