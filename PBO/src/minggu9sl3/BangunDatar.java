package minggu9sl3;

public abstract class BangunDatar {

    protected double luas;
    protected double keliling;

    public BangunDatar() {

    }

    public BangunDatar(double l, double k) {
        luas = l;
        keliling = k;
    }
    
    public void cetak(){
        System.out.println("metok cetak dipanggil dari kelas BangunDatar");
    }
    
    public abstract double getLuas();
    
    public abstract double getKeliling();

}
