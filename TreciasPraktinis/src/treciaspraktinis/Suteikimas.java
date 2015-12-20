/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treciaspraktinis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author justi_000
 */
public class Suteikimas {
     Suteikimas(PaskolosApskaiciavimas paskola,Scanner input){
        System.out.println("Koks kreditas domina ( [busto] [vartojimo] ): ");
        paskola.kreditas = input.nextLine();
        paskola.check();
        while (paskola.busto == false && paskola.vartojimo == false) {
            System.out.println("Neteisingai ivestas kreditas. \nDar karta iveskite koks kreditas domina ( [busto] [vartojimo] ): ");
            paskola.kreditas = input.nextLine();
            paskola.check();
        }
        if (paskola.busto == true) {
            File palukanos = new File("busto_palukanos.txt");
            try {
                FileReader fread = new FileReader(palukanos);
                BufferedReader bread = new BufferedReader((fread));
                paskola.palukanos = Integer.parseInt(bread.readLine());
            } catch (FileNotFoundException e) {
                System.out.println("Failas nerastas: " + palukanos.toString());
            } catch (IOException e) {
                System.out.println("Negalima nuskaityti failo: " + palukanos.toString());
            }
        } else {
            File palukanos = new File("vartojimo_palukanos.txt");
            try {
                FileReader fread = new FileReader(palukanos);
                BufferedReader bread = new BufferedReader((fread));
                paskola.palukanos = Integer.parseInt(bread.readLine());
            } catch (FileNotFoundException e) {
                System.out.println("Failas nerastas: " + palukanos.toString());
            } catch (IOException e) {
                System.out.println("Negalima nuskaityti failo: " + palukanos.toString());
            }
        }
        System.out.println("Kiek vaiku seimoje: ");
        paskola.vaikai = input.nextInt();
        paskola.checkVaikai();
        while (paskola.ok = false) {
            System.out.println("Neteisingas vaiku skaicius (Turi buti nuo 0 iki 10");
            System.out.println("Kiek vaiku seimoje: ");
            paskola.vaikai = input.nextInt();
            paskola.checkVaikai();
        }
        System.out.println("Kokios seimos pajamos (€/m?n): ");
        paskola.pajamos = input.nextInt();
        paskola.checkPajamos();
        if (paskola.busto = true) {
            while (paskola.ok == false) {
                System.out.println(paskola.pajamos);
                System.out.println("Seimos pajamos negali buti maziau nulio ar daugiau 30000 euru \nKokios seimos pajamos (€/m?n): ");
                paskola.pajamos = input.nextInt();
                paskola.checkPajamos();
            }
        }
        else {
            while (paskola.ok == false) {
                System.out.println("Seimos pajamos negali buti maziau nulio ar daugiau 10000 euru \nKokios seimos pajamos (€/m?n): ");
                paskola.pajamos = input.nextInt();
                paskola.checkPajamos();
            }
        }
        System.out.println("Finansiniai isipareigojimai(skolos) (€/m?n): ");
        paskola.skolos = input.nextInt();
        paskola.checkSkolos();
        if (paskola.busto = true) {
            while (paskola.ok == false) {
                System.out.println(paskola.skolos);
                System.out.println("Seimos skolos negali buti maziau nulio ar daugiau 15000 euru \nKokios seimos skolos (€/m?n): ");
                paskola.skolos = input.nextInt();
                paskola.checkSkolos();
            }
        }
        else {
            while (paskola.ok == false) {
                System.out.println("Seimos skolos negali buti maziau nulio ar daugiau 5000 euru \nKokios seimos skolos (€/m?n): ");
                paskola.skolos = input.nextInt();
                paskola.checkSkolos();
            }
        }
        System.out.println("Kokia paskolos suma: ");
        paskola.suma = input.nextInt();
        paskola.checkSuma();
        if (paskola.busto = true) {
            while (paskola.ok == false) {
                System.out.println(paskola.skolos);
                System.out.println("Paskolos suma negali buti maziau nulio \nKokia paskolos suma: ");
                paskola.suma = input.nextInt();
                paskola.checkSuma();
            }
        }
        else {
            while (paskola.ok == false) {
                System.out.println("Paskolos suma negali buti maziau 300 euri ar daugiau 26000 euru \nKokia paskolos suma: ");
                paskola.suma = input.nextInt();
                paskola.checkSuma();
            }
        }
        System.out.println("Koks paskolos laikotarpis (menesiu): ");
        paskola.laikas = input.nextInt();
        paskola.checkLaikas();
        if (paskola.busto = true) {
            while (paskola.ok == false) {
                System.out.println(paskola.skolos);
                System.out.println("Paskolos laikotarpis negali buti daugiau 40 metu \nKoks paskolos laikotarpis:  ");
                paskola.suma = input.nextInt();
                paskola.checkLaikas();
            }
        }
        else {
            while (paskola.ok == false) {
                System.out.println("Paskolos laikotarpis negali buti maziau 0 euri ar daugiau 5 metu \nKoks paskolos laikotarpis: ");
                paskola.suma = input.nextInt();
                paskola.checkLaikas();
            }
        }
        paskola.imoka();
        System.out.println(paskola.imoka);
        if (paskola.imoka != 0) {
            System.out.println("Bankas gali suteikti paskola");
            File islaikymas = new File("islaikymas.txt");
            try {
                FileReader fread = new FileReader(islaikymas);
                BufferedReader bread = new BufferedReader((fread));
                paskola.islaikymas = Integer.parseInt(bread.readLine());
            } catch (FileNotFoundException e) {
                System.out.println("Failas nerastas: " + islaikymas.toString());
            } catch (IOException e) {
                System.out.println("Negalima nuskaityti failo: " + islaikymas.toString());
            }
            paskola.sutartis();
            System.out.println("Menesio imoka kaina: " + paskola.imoka);
            System.out.println("Sutarties sudarimo kaina: " + paskola.kaina);
            System.out.println("Iveskite menesio numeri kuriame noretume grazinti kredita: ");
            paskola.men = Integer.parseInt(input.nextLine());
        }
        else {
            System.out.println("Bankas negali suteikti paskola");
        }
    }

    
}
