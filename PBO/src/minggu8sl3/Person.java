
package minggu8sl3;


public abstract class Person {
    String nama;
    String alamat;
    String telepon;
    
    public Person(){
        
    }
    
    public Person(String a, String b, String c){
        nama=a;
        alamat=b;
        telepon=c;                
    }
    
    public abstract String getNama();

    public abstract String getAlamat() ;

    public abstract String getTelepon() ; 
    
    public void testMethod(){
         
    }
            
}
