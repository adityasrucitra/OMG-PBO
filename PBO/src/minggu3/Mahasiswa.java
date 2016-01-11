package minggu3;
public class Mahasiswa {
    private String nama; 
    private int umur;
    private String nim;
    private String jurusan;
    private String fakultas;
    private String email;
    private String telepon;
    
    public void setNama(String nm){
        nama=nm;
    }
    
    public String getNama(){
        return nama;
    }
    
    
    public void setUmur(int umr){
        umur=umr;
    }
    
    public int getUmur(){
        return umur;
    }   
}
