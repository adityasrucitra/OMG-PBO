package responsiKM3;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class OnSite extends Konsumen implements InputOutput, Bonus {
    String bonus;
    
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
        if (bayar <= 0) {
            JOptionPane.showMessageDialog(null, "Bayar tidak boleh 0, Ulangi lagi!");
            input();
        }
        setBonus(bayar);
    }

    @Override
    public void output() {
        JOptionPane.showMessageDialog(null, 
                "Nama : "+getNama()
                +"\nALamat : "+getAlamat()
                +"\nTelepon : "+getTelepon()
                +"\nEmail : "+getEmail()
                +"\nTipe : "+getTipe()                
                +"\nTotal Bayar : "+getBayar()
                +"\nBonus : "+getBonus()
        );
    }

    @Override
    public void setBonus(double bayar) {
        if(bayar>=0 && bayar<30000 ){
            bonus = "Teh kotak";
        }
        else if(bayar>=30000 && bayar<60000){
            bonus = "Fruit koktail";
        }else if (bayar>=60000 && bayar<100000){
            bonus = "Zuppa soup";
        } else bonus = "Free voucher makan paket hemat berdua";
    }

    @Override
    public String getBonus() {
        return bonus;
    }

}
