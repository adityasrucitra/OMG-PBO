
package minggu8km3;

public class SegiTiga extends BangunDatar {
    float alas;
    float tinggi;
    
    
    
    public float getKeliling(){
        return keliling;
    }
    
    public float getLuas(){
        return luas;
    }
    
    public void setKeliling(){
        keliling=(float) (alas+tinggi+(Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi, 2))));
    }
    
    public void setLuas(){
        luas=alas*tinggi/2;
    }
}
