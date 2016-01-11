package minggu7;

public class BangunDatar {
    protected float keliling=70;
    protected float luas=100;

   
    public float getKeliling(){
        return keliling;
    }
    
    public float getLuas(){
        return luas;
    }
    
    public void cetak(){
       System.out.println("Nilai Keliling Pada Kelas Bangun Datar= "+keliling);
       System.out.println("Nilai Luas Pada Kelas Bangun Datar= "+luas);
        
    }
}
