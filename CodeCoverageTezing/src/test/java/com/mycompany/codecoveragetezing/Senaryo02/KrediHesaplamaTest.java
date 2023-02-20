 
package com.mycompany.codecoveragetezing.Senaryo02;

import org.junit.Test;
import static org.junit.Assert.*;
 
public class KrediHesaplamaTest {
     
    @Test() 
    public void KrediHesaplama_faizHesaplamaBirAlti_ifge12Line_IfTest () { 		
	 KrediHesaplama deneme = new KrediHesaplama();
	 assertEquals(9.73, deneme.faizHesaplamaBirAlti(973.0,0.89), 0.0); 
    }
}
