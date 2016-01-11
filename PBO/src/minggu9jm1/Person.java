
package minggu9jm1;

import java.io.Serializable;

public abstract class Person implements Serializable {
    String nama;
    String alamat;
    String telepon;

    public Person() {
    }   
    
    public Person(String nama, String alamat, String telepon){
        this.nama=nama;
        this.alamat=alamat;
        this.telepon=telepon;
    }
    
    public abstract String getNama();    
    public abstract String getAlamat();    
    public abstract String getTelepon();
}
