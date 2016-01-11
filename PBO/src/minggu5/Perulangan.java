/*
 *  Adityas Rucitra Pradipta <adityasrucitra@gmail.com>
 *  +6285292862417
 *  Copyright 2015
 */
package minggu5;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author adityas
 */
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] yyy=new int[12];
        
        List<Integer> xxx=new ArrayList<>();
        xxx.add(1);
        xxx.add(2);
        xxx.add(3);
        xxx.add(4);
        xxx.add(5);
        xxx.add(6);
        
        for(int y:xxx){
            System.out.println(y);
        }
        
           System.out.println("------------------------------------");
        
           
        for(int y=0;y<10;y++){
            System.out.println(y);
        }
    }
    
}
