package PboP2;

import PboP2.Hewan;
import PboP2.Manusia;
import PboP2.PesawatTelepon;


public class mainP2 {

public static void main (String[]args){
  Hewan h = new Hewan();
  Manusia m = new Manusia();
  PesawatTelepon pt = new PesawatTelepon();
 
 
 System.out.println("firdi mengganggu "+m.bermain("kucing")+ " yang sedang makan "+h.makan("ikan"));
 System.out.println();
 System.out.println("kucing mencuri "+h.makan("ikan")+" saat firdi memasak "+m.memasak("ikan"));
 System.out.println();
 System.out.println("firdi melakukan telepon ke "+pt.melakukan_panggilan("kantornya"));
 
 
 
}

}
