/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antraspraktinis;
import static java.lang.Math.sqrt;

/**
 *
 * @author justi_000
 */

public class AntrasPraktinis {
class Rectangle {
int ilgis = 5;
int plotis = 2;
int x, y;

int plotas(int ilgis, int plotis){
int p;
p = ilgis * plotis;
return p;
}

int perimetras(int ilgis, int plotis){
int pe;
pe = (2*ilgis)+(2*plotis);
return pe;
}

double istrizaine(double ilgis, double plotis){
double ist;
ist = sqrt((ilgis*ilgis)+(plotis*plotis));
return ist;
}

int kampai(int x, int y){
int a,a1,b,b1,c,c1,d,d1;
a=x;
a1=y;
b=a+ilgis;
b1=a1;
c=b;
c1=b1-plotis;
d=c-plotis;
d1=c1;
return 0;
}

int istrizaineskoo(int x, int y){
int a,a1,c,c1,koox,kooy;
a=x; // 8
a1=y; // 0
c=a+ilgis; // 13
c1=a1-plotis; // -2
koox=(c1+c)/2;
kooy=(a+a1)/2;
return 0;
}
public void PrintShape(){
   System.out.println("Plotas:"+plotas(ilgis, plotis));
   System.out.println("Perimetras:"+perimetras(ilgis, plotis));
   System.out.println("Istrizaine:"+istrizaine(ilgis, plotis));
   System.out.println("Kampai:"+kampai(x, y));
   System.out.println("IstrizainesKoo:"+istrizaineskoo(x, y));
}
}
 

public static void main(String[] args) {

    AntrasPraktinis antrasPraktinis = new AntrasPraktinis();
    
    
  

}
public void apskaiciuotiPlota(){
    
}
}

