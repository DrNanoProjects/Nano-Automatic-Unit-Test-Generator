package org.brutusin.instrumentation.logging;

public class DenemeKrediHesaplama {
  
    public static double faizHesaplama(double anaPara, double oran){
        return anaPara/100*oran;  
    } 
    
    public static double faizHesaplamaBirAlti(double anaPara, double oran){ 
        if (oran<1.0)
          oran = 1.0;
        return anaPara/100*oran; 
    } 
    
    public static int findSum(int numItems) {
        int total = 0;
        for (int i = 0; i < numItems; i++) {
            total = total + i;
        }
        return total;
    }  
    
     public static double faizHesaplamaIF(double anaPara, double oran) {
        if (oran > 7.0 && oran < 9.0) {
            oran = 5.0;
        } else if (oran >= 3.0 && oran <= 6.0) {
            oran = 3.75;
        } else if (oran > 1.6 && oran <= 2.95) {
            oran = 1.75;
        } else {
            oran = 2.0;
        }
        return anaPara / 100 * oran;
    }
     
   //     public static double faiz_Hesaplama(Hesap hesap){
//        return (Double)hesap.getanaPara() /100* (Double)hesap.getOran();  
//    } 
    
    
//    public static double yazdir(double anaPara, double oran){ 
//        //HesaplamaKayit hkayit = new HesaplamaKayit();
//        hkayit.hesaplamayiKaydet(anaPara, oran);
//        return anaPara/100*oran;  
//    }  
//

    
}
