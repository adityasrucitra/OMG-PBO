/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8sn3;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class Mahasiswa extends Person implements if_MAHASISWA {
    String nim;
    
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String nama, String alamat, String telepon, String nim){
        super(nama, alamat, telepon);
        this.nim=nim;
    }
    
    public String getNama() {
        return nama;
    }

    
    public String getAlamat() {
        return alamat;
    }

    @Override
    public String getTelepon() {
        return telepon;
    }

    
    public void daftarKrs() {
        JOptionPane.showMessageDialog(null, "Mahasiswa "+nama+" sedang mendaftak KRS");
    }

    
    public void cetakKrs() {
        JOptionPane.showMessageDialog(null, "Mahasiswa "+nama+" sedang mencetak KRS");
    }
    
    public void input(){
        nim = JOptionPane.showInputDialog("NIM :");
        nama = JOptionPane.showInputDialog("Nama :");
        alamat = JOptionPane.showInputDialog("Alamat :");
        telepon = JOptionPane.showInputDialog("Telepon :");
    }
    
    public void output(){
        JOptionPane.showMessageDialog(null, 
                "NIM : "+nim
                +"\nNama : "+nama
                +"\nAlamat : "+alamat
                +"\nTelepon : "+telepon
        );
        daftarKrs();
        cetakKrs();
    }
}
