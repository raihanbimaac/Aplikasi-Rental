/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasirental;

/**
 *
 * @author TOSHIBA
 */
public class Silver {
    // atribut
    protected int hargaRental, point, diskon, hargaSementara, jumlahDiskon, totalHarga;
    
    Silver() {
        this.hargaRental = 25000;
        this.point = 1;
        this.diskon = 1;
    }    
    protected int jumlahHarga(int lamaSewa) {
        
        hargaSementara = lamaSewa * hargaRental;
        jumlahDiskon = (hargaSementara * diskon) / 100;
        totalHarga = hargaSementara - jumlahDiskon;
        
        return totalHarga;
    }    
    protected int getPoint(int lamaSewa) {        
        int totalPoint = lamaSewa * point;
        return totalPoint;
    }    
}
