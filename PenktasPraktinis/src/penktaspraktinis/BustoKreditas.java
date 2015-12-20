/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penktaspraktinis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author justi_000
 */
public class BustoKreditas extends PenktasPraktinis{

    public BustoKreditas(Scanner klaviatura) throws IOException {
        System.out.println("Iveskite seimos pajamas: ");
		 Pajamos = klaviatura.nextDouble();
		 System.out.println("Jusu seimos pajamos: " + Pajamos);
		 
		 System.out.println("Seimos finansiniai isipareigojimai (isiskolinimai):");
		 isiskolinimai = klaviatura.nextDouble();
		 System.out.println("Palukanos bus: " + isiskolinimai);
		 if(isiskolinimai > 15000 || isiskolinimai <0)
			 throw new FileNotFoundException("Paskola jums nebus suteikiama del palukanu");
		     
		 
		 System.out.println("Iveskite vaiku skaiciu: ");
		 vaikukiekis = klaviatura.nextInt();
		 System.out.println("Vaiku yra: " + vaikukiekis);
		 if(vaikukiekis > 10 || vaikukiekis <0){
			 throw new FileNotFoundException("Blogai ivedete vaiku skaiciu");
		 
		 }
		 
		 System.out.println("Iveskite islaidos skirti vaikams: ");
		 vaikuislaidos = klaviatura.nextInt();
		 System.out.println("Vaikui skirti  islaidos: " + vaikuislaidos);
		 
		 System.out.println("Busto kredito paskola: ");
		 Paskola = klaviatura.nextDouble();
		 System.out.println("Jus norite pasiskolinti: " + Paskola);
		 
		 System.out.println("Iveskite palukanos per menesi pvz.: 3,3");
		 palukanos = klaviatura.nextDouble();
		 System.out.println("Jusu palukanos: " + palukanos);
		 
		 System.out.println("Iveskite ant kiek menesiu imsite paskola");
		 laikotarpis= klaviatura.nextInt();
		 System.out.println("Jus ivedete " +laikotarpis);
		 if (laikotarpis > 960)
			 throw new FileNotFoundException("Paskola tokiam ilgam laikotarpiui nesuteikiama");
		 else{
			 System.out.println("   ");
            if(Paskola>=0.4* Pajamos*(isiskolinimai-(vaikukiekis*vaikuislaidos)))
            	throw new FileNotFoundException("Paskola nesuteikiama!");
            else if (Paskola<0.4* Pajamos*(isiskolinimai-(vaikukiekis*vaikuislaidos)))
            	System.out.println("Paskola suteikiama!");
            
            
            if(0.0013*Paskola > 144.81)
            	System.out.println("Kredito sutarties sudarymo mokestis bus: " +0.0013*Paskola);
            else if (0.0013*Paskola <= 144.81)
            	System.out.println("Kredito sutarties sudarymo mokestis bus: " +144.81);
            
            
			System.out.println("");
		    R = palukanos/1200;
		    F = Math.pow(1+R, laikotarpis);
		    MonthPmt = Paskola * (R*F/(-1 + F));
		    System.out.printf("Jusu menesinis mokestis bus: %.2f",MonthPmt);
		    System.out.println("   ");
		    
		    Pelnas= Pajamos -  MonthPmt - (vaikuislaidos * vaikukiekis)- isiskolinimai;
		 System.out.printf("Seimos pajamos atskaicius mokescius:  %.2f",Pelnas);
		 System.out.println("   ");
		 if(Pelnas > 30000 || Pelnas <0)
			 throw new FileNotFoundException("Paskola jums nebus suteikiama");
		
		     else
		    	 System.out.println("");
		 
		 
		 
		 
		    Total = MonthPmt * laikotarpis;
		    System.out.println("   ");
		    System.out.printf("Total amount to pay: %.2f",Total);
		    System.out.println("   ");
		 System.out.println("Good Bye");}
    }

    
    
    
}
