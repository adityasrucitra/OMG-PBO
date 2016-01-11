package responsiKM3;
/**
 *
 * @author adityas
 */
public abstract class Konsumen {

    String nama;
    String alamat;
    String telepon;
    String email;
    String tipe;
    double bayar;

    public abstract String getNama();

    public abstract String getAlamat();

    public abstract String getTelepon();

    public abstract String getEmail();

    public abstract String getTipe();

    public abstract double getBayar();
}
