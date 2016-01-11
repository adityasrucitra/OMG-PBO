/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiJM1;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class OfficeBoy extends Karyawan implements InterfaceInputOutput, InterfaceLembur, InterfaceBonus {

    double gajiBonus;
    int jamBonus;

    public OfficeBoy(double gajiPokok) {
        super(gajiPokok);
    }   

    @Override
    public String getNama() {
        return this.nama;
    }

    @Override
    public String getAlamat() {
        return this.alamat;
    }

    @Override
    public String getTelepon() {
        return this.telepon;
    }

    @Override
    public String getJabatan() {
        return this.jabatan;
    }

    @Override
    public double getGajiPokok() {
        return this.gajiPokok;
    }

    @Override
    public int getJamLembur() {
        return this.jamLembur;
    }

    @Override
    public double getGajiTotal() {
        return this.gajiTotal;
    }

    @Override
    public void input() {
        nama = JOptionPane.showInputDialog("Nama : ");
        alamat = JOptionPane.showInputDialog("Alamat : ");
        telepon = JOptionPane.showInputDialog("Telepon : ");
        String strJamLembur = JOptionPane.showInputDialog("Jam Lembur : ");
        this.jamLembur = Integer.parseInt(strJamLembur);
        String strJamBonus = JOptionPane.showInputDialog("Jam Kerja Lepas : ");
        this.jamBonus = Integer.parseInt(strJamBonus);
        setGajiLembur(jamLembur);
        setBonus(jamBonus);
        jabatan = "Office Boy";

        gajiTotal = gajiPokok + getGajiLembur() + getBonus();
    }

    @Override
    public void output() {
        JOptionPane.showMessageDialog(null,
                "Nama : " + getNama()
                + "\nAlamat : " + getAlamat()
                + "\nTelepon : " + getTelepon()
                + "\nJabatan : " + getJabatan()
                + "\nGaji Pokok : " + getGajiPokok()
                + "\nJam Lembur : " + getJamLembur()
                + "\nJam Kerja Lepas : " + getJamBonus()
                + "\nGaji Lembur : " + getGajiLembur()
                + "\nGaji Kerja Lepas : " + getBonus()
                + "\nGaji Total : " + getGajiTotal()
        );
    }

    @Override
    public void setGajiLembur(int jamLembur) {
        this.gajiLembur = jamLembur * 15000;
    }

    @Override
    public double getGajiLembur() {
        return this.gajiLembur;
    }

    @Override
    public void setBonus(int jamBonus) {
        gajiBonus = jamBonus * 10000;
    }

    @Override
    public double getBonus() {
        return this.gajiBonus;
    }

    public double getJamBonus() {
        return this.jamBonus;
    }
}
