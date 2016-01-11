
package minggu7sl3;

public class Karyawan {
    protected String nama;
    protected String nip;
    protected double gaji;
    protected String golongan;

    public Karyawan(){
        
    }
    
    public Karyawan(String nama, String nip, double gaji, String golongan) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
        this.golongan = golongan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
    
    
    
    
}
