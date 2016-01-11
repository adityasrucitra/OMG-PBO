/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiJM1;

/**
 *
 * @author adityas
 */
public abstract class Karyawan {

    protected String nama;
    protected String alamat;
    protected String telepon;
    protected String jabatan;
    protected double gajiPokok;
    protected int jamLembur;
    protected double gajiLembur;
    protected double gajiTotal;

    public Karyawan(double gajiPokok){
        this.gajiPokok=gajiPokok;
    }

    public abstract String getNama();

    public abstract String getAlamat();

    public abstract String getTelepon();

    public abstract String getJabatan();

    public abstract double getGajiPokok();

    public abstract int getJamLembur();
    
    public abstract double getGajiTotal();

}
