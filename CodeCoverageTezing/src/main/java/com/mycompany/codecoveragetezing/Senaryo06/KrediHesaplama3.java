 package com.mycompany.codecoveragetezing.Senaryo06;

public class KrediHesaplama3 {
    
    FaizOran faizOran;
    
    public double faizHesapla(double anaPara){ 
        return anaPara/100*faizOran.aylikOran();     
    }
}
