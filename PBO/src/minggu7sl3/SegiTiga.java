
package minggu7sl3;

public class SegiTiga extends BangunDatar {

 
   
   //method cetak() dikelas induk, di-override disini
   public String cetak(){
       System.out.println(super.luas);
       super.getKeliling();
       return "Method Cetak yang pertama dipanggil dari kelas anak";
       
   }
    
    
}
