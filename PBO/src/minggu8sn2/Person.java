
package minggu8sn2;

public abstract class Person {
    public String nama;
    public String alamat;
    public String telepon;
    
    public Person(){
        
    }
    
    public Person(String nm, String al, String tlp){
        nama=nm;
        alamat=al;
        telepon=tlp;
    }
    
    public abstract String getNama();
    
    public abstract String getAlamat();
    
    public abstract String getTelepon();
    
}
