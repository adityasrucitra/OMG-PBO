package minggu8;

public class Sedan extends Kendaraan implements ModelGerakDarat, Lighting {

    public String getInfo() {
        return "method get info dipanggil dari kelas Sedan";
    }

    public void setNoPol(String x) {
        noPol = x;
    }

    public void maju() {
        System.out.println("Sedan jalan maju");
    }

    public void mundur() {
        System.out.println("Sedan jalan mundur");
    }

    public void belokKiri() {
        System.out.println("Sedan belok kiri");
    }

    public void belokKanan() {
        System.out.println("Sedan belok kanan");
    }

    public void lampuMenyala() {
        System.out.println("Sedan menyalakan lampu");
    }

    public void lampuMati() {
        System.out.println("Sedan mematikan lampu");
    }
}
