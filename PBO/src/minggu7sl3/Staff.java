package minggu7sl3;
import javax.swing.JOptionPane;
public class Staff extends Karyawan {

   public Staff(){
       
   }
    
    public Staff(String nama, String nip, double gaji, String golongan) {
        super(nama, nip, gaji, golongan);
    }
    
     

    public void input() {
        super.nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        super.nip = JOptionPane.showInputDialog("Masukkan NIP : ");
        String strGaji = JOptionPane.showInputDialog("Masukkan Gaji : ");;
        super.gaji = Integer.parseInt(strGaji);
        super.golongan = JOptionPane.showInputDialog("Masukkan golongan : ");
    }

    public void cetak() {
        JOptionPane.showMessageDialog(null,
                "<<STAFF>>"
                +"\nNama : "+getNama()
                + "\nNIP : "+getNip()
                + "\nGolongan : "+getGolongan()
                + "\nGaji : "+getGaji()
        );

    }

}
