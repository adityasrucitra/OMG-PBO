/*
 *  Adityas Rucitra Pradipta <adityasrucitra@gmail.com>
 *  +6285292862417
 *  Copyright 2015
 */
package minggu3;

/**
 *
 * @author adityas
 */
public class ObjectFactory {
    String nama;    
   
    
    public static Object getObject(String nama){
        if(nama.equals("obj1")){
            return new Mahasiswa();
        }else return new Karyawan();        
    }
    
}
