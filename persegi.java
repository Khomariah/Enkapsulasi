package enkapsulasi2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class persegi {
    private int panjang;
    private int lebar;
    
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang= panjang;
    }
    public persegi(){
        int P = 0;
        int l = 0;
    }
    public int luas(int p,int l) {
        return p*l;
    }
    public int getLuas() {
        return luas(panjang,lebar);
    }
}
