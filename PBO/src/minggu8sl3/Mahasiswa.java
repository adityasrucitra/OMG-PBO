
package minggu8sl3;

import javax.swing.JOptionPane;


public class Mahasiswa extends Person implements if_Mahasiswa, InputOutput {
    String nim;
    String jurusan;
    String fakultas;
    int semester;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String a, String b, String c, int d, String e, String f, String g){
        super(e,f,g);
        nim=a;
        jurusan=b;
        fakultas=c;
        semester=d;
    }

    public String getNim() {
        return nim;        
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public int getSemester() {
        return semester;
    }

    
    public String getNama() {
       return nama;
    }

    
    public String getAlamat() {
       return alamat;
    }

    
    public String getTelepon() {
        return telepon;
    }
    
    public void daftarKrs(){
        
    }
    
    public void cetakKrs(){
        
    }
    
    public void input(){
        nama= JOptionPane.showInputDialog("Masukkan nama : ");
        alamat =  JOptionPane.showInputDialog("Masukkan Alamat : ");
        telepon = JOptionPane.showInputDialog("Masukkan telepon : ");
        
        String x=JOptionPane.showInputDialog("Masukkan semester : ");
        semester=Integer.parseInt(x);
    }

    public void cetak(){
        System.out.println("nama = "+nama);
    }
    
}
