package org.brutusin.instrumentation.logging;

public class KrediHesaplama {
    
    public static double faizHesaplamaBirAlti(double anaPara, double oran){ 
        if (oran<1.0)
          oran = 1.0;
        return anaPara/100*oran; 
    } 
    
}
