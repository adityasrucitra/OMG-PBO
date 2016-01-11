/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8sn3;

/**
 *
 * @author adityas
 */
public class KelasUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.input();
        mhs1.output();

        Dosen dosen1 = new Dosen();
        dosen1.input();
        dosen1.output();
    }
}
