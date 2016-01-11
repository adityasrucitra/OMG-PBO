
package minggu3;
class Mobil{

  private String warna;
int tahunProduksi;

void isiwarna(String color)
{
    warna=color;
    System.out.println("Warna mobil "+warna);
}

 String tampilWarna()
{
    System.out.println("hallo");
    return warna;
    
}  
    
}
public class ketiga {

    public static void main(String[] args) {
  Mobil mob=new Mobil();
  mob.isiwarna("Hijau");
  
  Mobil mob2=new Mobil();
  mob2.isiwarna("Merah");
   
        System.out.println("Mobilku berwarna "+mob.tampilWarna());
        System.out.println("Mobilku yang ke dua berwarna "+mob2.tampilWarna());
          
  
    }
    
}
