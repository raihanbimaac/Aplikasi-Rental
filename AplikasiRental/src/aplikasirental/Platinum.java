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
public class Platinum extends Gold {
    int bonusPulsa;
    
    Platinum() {
        hargaRental = 45000;
        point = 10;
        diskon = 3;
        cashback = 10000;
    }
    
    protected int getBonus(int lamaSewa) {
        
        bonusPulsa = lamaSewa * 5000;
        return bonusPulsa;
    }    
}
