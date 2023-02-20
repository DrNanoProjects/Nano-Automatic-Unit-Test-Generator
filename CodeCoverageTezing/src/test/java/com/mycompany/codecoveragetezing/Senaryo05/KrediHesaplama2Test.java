package com.mycompany.codecoveragetezing.Senaryo05;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner; 
import static org.junit.Assert.assertEquals; 

@RunWith(MockitoJUnitRunner.class)
public class KrediHesaplama2Test {
    
   @InjectMocks
	KrediHesaplama2 _KrediHesaplama2;
	@Mock
	HesaplamaKayit hesaplamaKayit;
			
	@Test
        public void faizHesaplaTest() {  
            double hesaplananFaiz = _KrediHesaplama2.faizHesapla(762.0,0.487); 
            assertEquals(7.62, hesaplananFaiz,0.0); 
        }  
}
