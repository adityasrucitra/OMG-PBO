/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8km3;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class Dosen extends Person implements if_Dosen {

    String nip ;
    String nama;
    String alamat;
    String telepon;
    String mataKuliah;
    String jurusan;
    String fakultas;

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;

    }

    public String getTelepon() {
        return telepon;
    }

    public String getnip() {
        return nip;
    }

    public String getjurusan() {
        return jurusan;
    }

    public String getfalkultas() {
        return fakultas;
    }

    public void mengejar() {
        System.out.println("nip " + nip + "  mengajar pbo");
    }

    public void membimbingSkripsi() {
        System.out.println("nip " + nip + " membimbing skripsi");
    }

    public void input() {
        nip = JOptionPane.showInputDialog("NIP : ");
        nama = JOptionPane.showInputDialog("Nama : ");
        alamat = JOptionPane.showInputDialog("Alamat : ");
        telepon = JOptionPane.showInputDialog("Telepon : ");
        mataKuliah = JOptionPane.showInputDialog("Mata Kuliah : ");
        jurusan = JOptionPane.showInputDialog("Jurusan : "); 
        fakultas = JOptionPane.showInputDialog("Fakultas : ");
    }
    
    public void output(){
        JOptionPane.showMessageDialog(null, 
                    "Nama : "+nama
                    +"Alamat : "+alamat
                    +"NIP : "+nip
                    +"Telepon : "+telepon
                    +"Mata Kuliah : "+mataKuliah
                    +"Jurusan : "+jurusan
                    +"Fakultas : "+fakultas
                );
    }

}
