
package minggu7;

public class Mahasiswa {
    protected String nama;
    protected String jurusan;

    public String getNama() {
        return "nama"+nama+"dipanggil dari kelas induk";
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    
    
    
    
}
