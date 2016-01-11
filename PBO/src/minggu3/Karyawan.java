
package minggu3;

import javax.swing.JOptionPane;

public class Karyawan {
    private String nama;
    private String alamat;
    
   public void inputData(){
       nama=JOptionPane.showInputDialog("Masukkan nama :");
   }
   
   public void outputData(){
       JOptionPane.showMessageDialog(null,"Nama="+nama+"\n");
   }
////////////////////////////////////////////////////////////////////   
////////////////////////////////////////////////////////////////////
   public void setNama(String x){
       nama=x;
   }
   
   public String getNama(){
       return this.nama;
   }
   
    
    
}
