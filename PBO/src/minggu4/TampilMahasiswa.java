/*
 *  Adityas Rucitra Pradipta <adityasrucitra@gmail.com>
 *  +6285292862417
 *  Copyright 2015
 */
package minggu4;

/**
 *
 * @author adityas
 */
public class TampilMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs=new Mahasiswa();
        mhs.setNama("Yolly");
        mhs.setUmur(23);
        mhs.setJurusan("Informatika");
              
        
        Mahasiswa mhs2= mhs.getAll();
        System.out.println(mhs2.getNama());
        System.out.println(mhs2.getUmur());
        System.out.println(mhs2.getJurusan());
        
        
        
        
    }
    
}
