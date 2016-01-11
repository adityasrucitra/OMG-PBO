/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsiJM1;

import javax.swing.JOptionPane;

/**
 *
 * @author adityas
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean status = true;
        int choose;
        
        while (status) {
//            Manager manager = new Manager(3000000);
//            manager.input();
//            manager.output();

            OfficeBoy officeBoy = new OfficeBoy(1500000);
            officeBoy.input();
            officeBoy.output();
            
            choose = JOptionPane.showConfirmDialog(null, "Coba Lagi ?","Pilih",JOptionPane.YES_NO_OPTION);
            if(choose==1){
                status=false;
            }
        }

    }

}
