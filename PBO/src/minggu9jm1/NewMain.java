/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9jm1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author adityas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
//        Mahasiswa mhs=new Mahasiswa();
//        mhs.input();
//        mhs.output();
//        
        FileInputStream fis=new FileInputStream(new File("StoredObject"));
        ObjectInputStream ois=new ObjectInputStream(fis);
        
//        FileOutputStream fos=new FileOutputStream(new File("StoredObject"));
//        ObjectOutputStream ous=new ObjectOutputStream(fos);
//        ous.writeObject(mhs);
//        
        Mahasiswa mhs=(Mahasiswa) ois.readObject();
        mhs.output();
    }
    
}
