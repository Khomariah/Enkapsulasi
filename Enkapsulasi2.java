/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulasi2;

/**
 *
 * @author acer
 */
public class Enkapsulasi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persegi p = new persegi();
        p.setPanjang(7);
        p.setLebar(6);
        
        System.out.println("Panjang:"+ p.getPanjang());
        System.out.println("Lebar:"+ p.getLebar());
        System.out.println("Luas persegi:"+ p.getLuas());

    }
    
}
