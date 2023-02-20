package org.brutusin.instrumentation.logging;
 
public class KrediHesaplama2 {  
    public static HesaplamaKayit hesaplamaKayit;
    
    public static double faizHesapla(double anaPara, double oran){ 
        if (oran<1.0){
            oran = 1.0;
        } 
        hesaplamaKayit.hesaplamayiKaydet(anaPara, oran); 
        return anaPara/100*oran;        
    }
    
}
