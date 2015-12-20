/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketvirtaspraktinis;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author justi_000
 */
public class KetvirtasPraktinis {
   
 Scanner in = new Scanner(System.in);
 int m;
 float b;
 float t,t1;
 float v;

 public static void main(String[] args) {
     
 Scanner keyboard = new Scanner(System.in);
 char move;
 String newLine = System.getProperty("line.separator");
 KetvirtasPraktinis ch = new KetvirtasPraktinis();
 //int x;
 do{
 System.out.println("1. Busto kreditas" + newLine + "2. Vartojimo kreditas");
 System.out.println("3. Uzbaigti");
 move = keyboard.next().charAt(0);
 switch (move){
 case '1' :
 ch.busto();
 break;
 case '2' :
 ch.vartojimo();
 }
 }while(move != '3');

 } 

    private void vartojimo() {
         BustoKreditas busto = new BustoKreditas();
    }

    private void busto() {
       VartojimoKreditas vartojimoKreditas = new VartojimoKreditas();
    }
    
}
