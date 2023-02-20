package org.brutusin.instrumentation.logging;

public class KrediHesaplama3 {
    
    public static FaizOran faizOran;
    
    public static double faizHesapla(double anaPara){ 
        return anaPara/100*faizOran.aylikOran();     
    }
}
