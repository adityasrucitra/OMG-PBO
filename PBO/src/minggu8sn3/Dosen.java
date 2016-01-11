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
public class Dosen extends Person implements if_DOSEN{
    String nip;
    
    public Dosen(){        
    }
    
    public Dosen(String nama, String alamat, String telepon, String nip){
        super(nama, alamat, telepon);
        this.nip=nip;
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

    
    public void mengajar() {
        JOptionPane.showMessageDialog(null, "Dosen "+nama+" sedang mengajar");
    }
    
    public void membimbingSkripsi() {
        JOptionPane.showMessageDialog(null, "Dosen "+nama+" sedang membimbing skripsi");
    }
    
     public void input(){
        nip = JOptionPane.showInputDialog("NIP :");
        nama = JOptionPane.showInputDialog("Nama :");
        alamat = JOptionPane.showInputDialog("Alamat :");
        telepon = JOptionPane.showInputDialog("Telepon :");
    }
    
    public void output(){
        JOptionPane.showMessageDialog(null, 
                "NIP : "+nip
                +"\nNama : "+nama
                +"\nAlamat : "+alamat
                +"\nTelepon : "+telepon
        );
        mengajar();
        membimbingSkripsi();
    }
    
}
