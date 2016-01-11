/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8sn3;

/**
 *
 * @author adityas
 */
public abstract class Person {

    String nama;
    String alamat;
    String telepon;

    public Person() {

    }

    public Person(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public abstract String getNama();

    public abstract String getAlamat();

    public abstract String getTelepon();

}
