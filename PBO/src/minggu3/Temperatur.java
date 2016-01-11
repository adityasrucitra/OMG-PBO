package minggu3;

/**
 *
 * @author adityas
 */
public class Temperatur {

    private double fahrenheit;
    private double rheamur;
    private double kelvin;
    
    private String nama;
    
    public void isiNama(String nm){
        nama=nm;
    }
    
    public String getNama(){
        return nama;
    }
    
    
    public static void main(String [] args){
        Temperatur tmp=new Temperatur();
        String nama; 
    }
    
    
    
    
    
    
    
    
    
    
    
    

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double celcius) {
        fahrenheit=(9/5.0* celcius)+32; 
    }
    
    public double getRheamur() {
        return rheamur;
    }

    public void setRheamur(double celcius) {
        rheamur=4/5.0*celcius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double celcius) {
        kelvin = celcius+273;
    }

}
