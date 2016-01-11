package minggu7sl3;
public class BangunDatar {
    protected double keliling;
    protected double luas=100;
    
         
    public double getKeliling(){
        return keliling;
    }    
    public double getLuas(){
        return luas;
    } 
    
    public String cetak(){
       return "Method cetak yang pertama dipanggil dari induk"; 
    }
    
    public String cetak(String awalan){
       return "Method cetak yang kedua dipanggil dari induk";
    }
    
}
