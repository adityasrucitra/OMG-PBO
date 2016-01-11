
package minggu7;

public class MahasiswaBaru extends Mahasiswa{
    
   
    @Override
    public String getNama(){
        return "nama"+nama+"dipanggil dari kelas anak";
       // return super.getNama();
    }
   
    
}
