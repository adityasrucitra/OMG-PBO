package minggu7sl3;

public class MainKelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Staff staff = new Staff();
        Dosen dosen = new Dosen();
        staff.input();
        dosen.input();
        staff.cetak();
        dosen.cetak();
    }
}
