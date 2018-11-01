
package feladat_6;

import java.util.Scanner;


public class Feladat_6 {

    
    public static void main(String[] args) {
        
        int pont;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Kérem adja meg az elért pontszámót: ");
       
        pont= input.nextInt();
        if(pont<=42){
            System.out.println("Elégtelen!");
        }else if(pont <=43 || pont<=57){
            System.out.println("Elégséges!");
        }else if(pont<=58 || pont<=72){
            System.out.println("Közepes!");
        }else if(pont<=73 || pont<=87){
            System.out.println("Jó!");
        }else if(pont<=88 || pont<=100){
            System.out.println("Jeles!");
        }else{
            System.out.println("Hiba!!!");
        }
    }
    
}
