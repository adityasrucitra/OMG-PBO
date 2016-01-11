package minggu8sn3;

public class NewMain {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan();
        sedan1.jalankanKendaraan();
        sedan1.matikanMesin();
        System.out.println(sedan1.getInfo());;
        System.out.println("==============================");

        PesawatTerbang pesawatTerbang1 = new PesawatTerbang();
        pesawatTerbang1.jalankanKendaraan();
        pesawatTerbang1.matikanMesin();
        System.out.println(pesawatTerbang1.getInfo());;
        System.out.println("==============================");
        
        Kendaraan kendaraan1 = new Sedan();

        Kendaraan kendaraan2 = new PesawatTerbang();
        
        
    }

}
