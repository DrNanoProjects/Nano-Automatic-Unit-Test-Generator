 
package com.mycompany.codecoveragetezing.Senaryo06;
 
import static org.mockito.Mockito.when; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner; 
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class KrediHesaplama3Test{ 

	@InjectMocks
	KrediHesaplama3 _KrediHesaplama3;
	@Mock
	FaizOran faizOran;
			
	@Test 
        public void faizHesaplaTest() {  
		when(faizOran.aylikOran()).thenReturn(1.20);  
		double hesaplananFaiz = _KrediHesaplama3.faizHesapla(100.0); 
		assertEquals(1.20, hesaplananFaiz, 0.001); 
             
    } 
	
 
} 
