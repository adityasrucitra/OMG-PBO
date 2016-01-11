package minggu3;

public class TampilMahasiswa {

    public static void main(String[] args) {
        // TODO code application logic here
      Mahasiswa mhs=new Mahasiswa();
        mhs.setNama("Yolly");
        mhs.setUmur(24);
        System.out.println(mhs.getNama());
        System.out.println(mhs.getUmur());     
        mhs.setNama("Deki");
    }
    
}
