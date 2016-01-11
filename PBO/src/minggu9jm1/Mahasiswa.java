package minggu9jm1;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Mahasiswa extends Person implements if_Mahasiswa, InputOutput, Serializable{

    String nim;
    String jurusan;
    String fakultas;
    int semester;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String jurusan, String fakultas, int semester, String nama,
            String alamat, String telepon) {

        super(nama, alamat, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.semester = semester;
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

    @Override
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }
    
    @Override
    public void daftarKrs(){
        System.out.println(nama+"Sedang daftar KRS");
    }
    
    @Override
    public void cetakKrs(){
        System.out.println(nama+"Sedang mencetak KRS");
    }
    
    public void input(){
        nama = JOptionPane.showInputDialog("Nama :");
        alamat = JOptionPane.showInputDialog("Alamat : ");
        telepon = JOptionPane.showInputDialog("Telepon : ");        
        
        nim = JOptionPane.showInputDialog("NIM : ");
        jurusan = JOptionPane.showInputDialog("Jurusan : ");
        fakultas = JOptionPane.showInputDialog("Fakultas : ");
        String strSemester = JOptionPane.showInputDialog("Semester : ");
        semester = Integer.parseInt(strSemester);
    }
    
    public void output(){
        JOptionPane.showMessageDialog(null, 
                "Nama : "+nama
                +"\nAlamat : "+alamat
                +"\nTelepon : "+telepon
                +"\nNIM : "+nim
                +"\nJurusan : "+jurusan
                +"\nFakultas : "+fakultas
                +"\nsemester : "+semester
        );
    }

}
