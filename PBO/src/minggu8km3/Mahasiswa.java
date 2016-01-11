/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8km3;

/**
 *
 * @author adityas
 */
public class Mahasiswa extends Person implements if_Mahasiswa{
    String nim="141050001";
    String nama="cupp";
    String alamat="aukkk";
    String telpon="09999999999";
    String jurusan="informatika";
    String fakultas;
    int semester;

    @Override
    public String getNama() {
    return nama;    
    }

    @Override
    public String getAlamat() {
    return alamat;    
    }

    @Override
    public String getTelepon() {
    return telpon;    
    }

    @Override
    public void mendaftarKrs() {
    System.out.println("nama mahasiswa  "+nama+"nim  "+nim+" Telah mendaftar krs");
    }

    @Override
    public void mencetakKrs() {
   System.out.println("nim "+nim+" telah mencatak Krs");
    }
}
