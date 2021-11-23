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
public class Gold extends Silver {
    int cashback;
    
    Gold() {
        hargaRental = 30000;
        point = 5;
        diskon = 2;
        cashback = 5000;
    }    
}
