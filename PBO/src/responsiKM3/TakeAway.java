package responsiKM3;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class TakeAway extends Konsumen implements InputOutput, Diskon {
    public double diskon;    

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
        return telepon;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTipe() {
        return tipe;
    }

    @Override
    public double getBayar() {
        return bayar;
    }

    @Override
    public void input() {
        nama = JOptionPane.showInputDialog("Nama : ");
        alamat = JOptionPane.showInputDialog("Alamat : ");
        telepon = JOptionPane.showInputDialog("Telepon : ");
        email = JOptionPane.showInputDialog("Email : ");
        tipe = "Take Away";
        String strBayar = JOptionPane.showInputDialog("Bayar : ");
        bayar = Double.parseDouble(strBayar);
        if(bayar<=0){
            JOptionPane.showMessageDialog(null, "Bayar tidak boleh 0, Ulangi lagi!");
            input();
        }
        setDiskon(bayar);
    }

    @Override
    public void output() {
        JOptionPane.showMessageDialog(null, 
                "Nama : "+getNama()
                +"\nALamat : "+getAlamat()
                +"\nTelepon : "+getTelepon()
                +"\nEmail : "+getEmail()
                +"\nTipe : "+getTipe()
                +"\nDiskon rate : "+getDiskon()
                +"\nHarga Diskon : "+getBayar()*getDiskon()
                +"\nTotal Bayar : "+(getBayar()-(getBayar()*getDiskon()))
        );
    }

    @Override
    public void setDiskon(double bayar) {        
        if(bayar>=0 && bayar<30000 ){
            diskon = 0.0;
        }
        else if(bayar>=30000 && bayar<60000){
            diskon = 3/100D;
        }else if (bayar>=60000 && bayar<100000){
            diskon = 6/100D;
        } else diskon = 10/100D;
    }

    @Override
    public double getDiskon() {
        return diskon;
    }
    
}
