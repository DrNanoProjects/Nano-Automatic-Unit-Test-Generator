package com.mycompany.codecoveragetezing.Senaryo01;
 
import org.junit.Test;
import static org.junit.Assert.*;


public class KrediHesaplamaTest {
    
   KrediHesaplama _KrediHesaplama = new KrediHesaplama();
		
	@Test
        public void faizHesaplamaTest() {  
          
            assertEquals(0.8, _KrediHesaplama.faizHesaplama(100.0,0.80),0.0);
        } 
}
