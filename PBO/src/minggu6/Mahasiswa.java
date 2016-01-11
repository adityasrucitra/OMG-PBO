package minggu6;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private int umur;
    ///////////////////////
    private String email;
    private String fakultas;
    private int semester;
    private String jenisKelamin;
    private String alamat;

    /////////////////////////
    public Mahasiswa(String nama){
        this.nama=nama;
    }
    
    public void cetak(){
        System.out.println("nama saya "+ nama);
        
    }
    
    public void cetak(String x){
        
    }
    
    public void cetak(String x, String y){
        
    }
    
    
    public Mahasiswa(String a, String b, int c, String d, String e, int f, String g, String h) {
        nama = a;
        jurusan = b;
        umur = c;
        email = d;
        fakultas = e;
        semester = f;
        jenisKelamin = g;
        alamat = h;

    }
    
    
    
    

    public String getNama() {
        return nama;
    }

    public String getNama(String awalan) {
        return awalan + nama;
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

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
