/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanenkapsulasi;

/**
 *
 * @author acer
 */
public class LatihanEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Nilai n = new Nilai();
         n. setNilaipraktek(100);
         n. setNilaiteori(80);
         
         System.out.println("Nilai_praktek: "+ n.getNilaipraktek());
         System.out.println("Nilai_teori: "  + n.getNilaiteori());
         System.out.println("Nilai_akhir: "   +n.getNa());
        
    }
    
}
