/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketvirtaspraktinis;

import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author justi_000
 */
public class BustoKreditas extends KetvirtasPraktinis{
  BustoKreditas(){
 System.out.println("Iveskite vaiku skaiciu nuo 0-10");
 int x = in.nextInt();
 System.out.println("Seimos pajamos nuo 0 iki 30000eur");
 int y = in.nextInt();
 System.out.println("Seimos finansiniai isipareigojimai nuo 0 iki 15000eur");
 int z = in.nextInt();
 System.out.println("Paskola neribojama");
 int c = in.nextInt();
 System.out.println("Laikotarpis 50 metÅ³ - pastato amÅ¾ius, bet ne daugiau 40 metÅ³");
 int l = in.nextInt();
 System.out.println("--------------------------------------------------------------");
 System.out.println(" Kredito skaiciuokle ");
 System.out.println("--------------------------------------------------------------");
 System.out.println("Menesine imoka : ");
 m = c / (l*12);
 System.out.println(m);
 System.out.println("Bendra grazintine suma : ");
 b = (c+(c*13f/100f));
 System.out.println(b);
 System.out.println("--------------------------------------------------------------");
 System.out.println(" Sutarties sudarimo apskaiciavimai ");
 System.out.println("--------------------------------------------------------------");
 t=(200*x);
 t1=(m+(m*40f/100f));
 //System.out.println("Menesine imoka 40%");
 //System.out.println(t1);
 if(y<=t){
 System.out.println("Kreditas nesuteikiamas");

 }else{
 if(t1>((y-t)-z)){
 System.out.println("Kreditas nesuteikiamas");
 }else{
 System.out.println("Kreditas suteikiamas");
 }
 }
 System.out.println("--------------------------------------------------------------");
 System.out.println(" Kredito grazinimo laikotarpis ");
 System.out.println("--------------------------------------------------------------");
 v=b/m;
 System.out.println("Kredito grazinimas menesiais");
 System.out.println(v);
 System.out.println("Kredito grazinimas metais");
 System.out.println(round(v/12,2));
 System.out.println(" ");
 }
}
