/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penktaspraktinis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author justi_000
 */
public class PenktasPraktinis {
                    double palukanos= 0.0;
		 double Paskola= 0.0;
		 int laikotarpis = 0;
		 double MonthPmt= 0.0;
		 double R = 0.0;
		 double F = 0.0;
		 double Total= 0.0;
		 double Pajamos = 0.0;
		 double Pelnas = 0.0;
		 double vaikuislaidos =0.0;
		 double isiskolinimai=0.0;
		 int vaikukiekis= 0; 
    public static void main(String args[]) throws IOException
{
	InputStreamReader in= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(in);
	int choice;
	System.out.println("Iveskite viena is dveju");
	System.out.println("1-busto kreditas | 2-vartotojo kreditas");
	choice=Integer.parseInt(br.readLine());
	System.out.println("Jusu ivestas pasirinkimas:" + choice);
	
		 Scanner klaviatura = new Scanner(System.in);
		 
		 
		 
	
	switch(choice){
	case 1:  
            BustoKreditas bustoKreditas = new BustoKreditas(klaviatura);
            break; 
        case 2:
            VartojimoKreditas vartojimoKreditas = new VartojimoKreditas(klaviatura);
            break;
	}}
    
}
