package minggu8sn3;

public class PesawatTerbang extends Kendaraan implements ModelGerakUdara, Lighting {
    
    public void jalankanKendaraan(){
        System.out.println("putar kunci, nyalakan mesin jet, pesawat tinggal landas, pesawat terbang");
    }
    
    public void matikanMesin(){
        System.out.println("mesin pesawat terbang dimatikan");
    }
    
    public String getInfo(){
        return info;
    }
    
    public String getRute(){
        return "";
    }

    
    public void terbang() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void mendarat() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void manuver() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void lampuMenyala() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void lampuMati() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
