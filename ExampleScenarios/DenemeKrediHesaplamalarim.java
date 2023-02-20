package org.brutusin.instrumentation.logging;

public class DenemeKrediHesaplamalarim {
  
    public static double faizHes(double anaPara, double oran){
        return anaPara/100*oran;  
    } 
    
    public static double faizHesBirAlti(double anaPara, double oran){ 
        if (oran<1.0)
          oran = 1.0;
        return anaPara/100*oran; 
    } 
    
    public static int faizFindSum(int numItems) {
        int total = 0;
        for (int i = 0; i < numItems; i++) {
            total = total + i;
        }
        return total;
    }  
    
     public static double faizHesIF(double anaPara, double oran) {
        if (oran > 7.0 && oran < 9.0) {
            oran = 5.0;
        } else if (oran > 1.6 && oran <= 2.95) {
            oran = 1.75;
        } else {
            oran = 2.0;
        }
        return anaPara / 100 * oran;
    } 
}
