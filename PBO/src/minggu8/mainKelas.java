package minggu8;

public class mainKelas {

    public static void main(String[] args) {
        // TODO code application logic here
        Sedan sedan1 = new Sedan();
        sedan1.setNoPol("AB 1234 CD");
        System.out.println(sedan1.getInfo());
        System.out.println("\nNomor Polisi Sedan" + sedan1.noPol);

        MiniBus miniBus1 = new MiniBus();
        miniBus1.setNoPol("AB 5678 EF");
        System.out.println(miniBus1.getInfo());;
        System.out.println("\nNomor Polisi Sedan" + miniBus1.noPol);

    }

}
