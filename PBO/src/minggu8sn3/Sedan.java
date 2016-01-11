
package minggu8sn3;

public class Sedan extends Kendaraan implements ModelGerakDarat, Lighting {
    
    public void jalankanKendaraan(){
        System.out.println("putar kunci, mesin menyala, mobil berjalan di jalan raya");
    }
    
    public  void matikanMesin(){
        System.out.println("mesin mobil dimatikan");
    }
    public String getInfo(){
        return info;
    }
    
    public String getRute(){
        return "";
    }
    
    public void maju(){
        
    }
    
    public void mundur(){
        
    }
    
    public void belokKanan(){
        
    }
    
    public void belokKiri(){
        
    }
    
    public void lampuMenyala(){
        
    }
    
    public void lampuMati(){
        
    }
}
