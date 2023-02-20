 
package com.mycompany.codecoveragetezing.Senaryo03;

import org.junit.Test;
import static org.junit.Assert.*;
 
public class KrediHesaplama2Test { 
    
	KrediHesaplama2 _KrediHesaplama2 = new KrediHesaplama2();
	
	@Test 
        public void faizHesaplaTest() {  
            _KrediHesaplama2.hesaplamaKayit = new HesaplamaKayit();
            double hesaplananFaiz = _KrediHesaplama2.faizHesapla(954.0,0.815); 
            assertEquals(9.54, hesaplananFaiz, 0.0); 
        }  
}
