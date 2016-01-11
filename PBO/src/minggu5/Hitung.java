package minggu5;
public class Hitung {
    private double kuadrat;
    private double akar;
    private String ganjilGenap;
    private String positifNegatif;

    public double getKuadrat() {
        return kuadrat;
    }

    public void setKuadrat(double kuadrat) {
        this.kuadrat = kuadrat*kuadrat;
    }

//    public String getAkar() {
//        if(this.akar>0){
//            return String.valueOf(this.akar);
//        } else return "Imaginer";
//        
//    }
     public String getAkar() {
        if(this.akar>0){
            return String.valueOf(this.akar);
        } else return "Imaginer";
       
    }

    public void setAkar(double akar) {
        this.akar=Math.sqrt(akar);
    }

    public String getGanjilGenap() {
        return ganjilGenap;
    }

    public void setGanjilGenap(double angka) {
        if(angka%2==0){
            this.ganjilGenap = "Genap";
        }else this.ganjilGenap="Ganjil";
        
    }

    public String getPositifNegatif() {
        return positifNegatif;
    }

    public void setPositifNegatif(double angka) {
        if(angka>0){
            this.positifNegatif = "Positif";
        } else this.positifNegatif = "Negatif";
        
    }
    
    
    
}
