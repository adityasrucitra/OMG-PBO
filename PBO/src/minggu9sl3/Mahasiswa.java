
package minggu9sl3;

import javax.swing.JOptionPane;

public class Mahasiswa extends Person implements if_Mahasiswa{
    String nim;
    String jurusan;
    String fakultas;
    int semester;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String nim, String jurusan, String fakultas, int semester
            , String nama, String alamat, String telepon){
        super(nama, alamat, telepon);
        this.nim=nim;
        this.jurusan=jurusan;
        this.fakultas=fakultas;
        this.semester=semester;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    public String getFakultas(){
        return fakultas;
    }
    
    public int getSemester(){
        return semester;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public void cetakKrs(){
        System.out.println(nama+" Sedang mendaftar KRS");
    }
    
    public void daftarKrs(){
        System.out.println(nama+" Sedang mencetak KRS");
    }
    
    public void input(){
        nama=JOptionPane.showInputDialog("Masukkan nama : ");
        alamat=JOptionPane.showInputDialog("Masukkan alamat : ");
        telepon=JOptionPane.showInputDialog("Masukkan telepon : ");
        nim=JOptionPane.showInputDialog("Masukkan NIM : ");
        jurusan=JOptionPane.showInputDialog("Masukkan jurusan : ");
        fakultas=JOptionPane.showInputDialog("Masukkan fakultas : ");
        String x=JOptionPane.showInputDialog("Masukkan semester : ");
        semester= Integer.parseInt(x);
    }
    
    public void output(){
        JOptionPane.showMessageDialog(null,
                "Nama : "+nama
                +"\nalamat : "+alamat
                +"\ntelepon : "+telepon
                +"\nNIM : "+nim
                +"\nJurusan : "+jurusan
                +"\nFakultas : "+fakultas
                +"\nSemester : "+semester
        
        );
    }
}
