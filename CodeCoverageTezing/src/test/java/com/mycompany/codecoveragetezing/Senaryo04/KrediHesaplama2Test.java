 
package com.mycompany.codecoveragetezing.Senaryo04;

import org.junit.Test;
import static org.junit.Assert.*;
 import org.mockito.Mockito;

public class KrediHesaplama2Test {
    
 KrediHesaplama2 _KrediHesaplama2 = new KrediHesaplama2();
	
	@Test  
    public void faizHesaplaTest() {  
		_KrediHesaplama2.hesaplamaKayit = Mockito.mock(HesaplamaKayit.class);
		double hesaplananFaiz = _KrediHesaplama2.faizHesapla(63.0,0.796); 
		assertEquals(0.63, hesaplananFaiz, 0.0); 
    } 
    
}
