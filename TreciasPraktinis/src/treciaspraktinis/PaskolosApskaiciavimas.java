/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treciaspraktinis;

/**
 *
 * @author justi_000
 */
public class PaskolosApskaiciavimas {
    int vaikai;
    int pajamos;
    int skolos;
    int suma;
    int laikas;
    int islaikymas;
    String kreditas;
    float palukanos;
    float imoka;
    double kaina;
    int men;
    float grazintina;
    boolean busto = false;
    boolean vartojimo = false;
    boolean ok = false;

    public void imoka(){
        imoka = suma / laikas * (1+palukanos);
        if ((pajamos-skolos-vaikai*islaikymas) * 0.4 < imoka ){
            imoka = 0;
            }
        return;
        }
    public void sutartis(){
        if (kreditas.equals("busto")){
            kaina = suma * 0.13;
            if (kaina < 144.81){
                kaina = 144.81;
            }
        }
        else{
            kaina = suma * 0.1;
            if (kaina < 28.96){
                kaina = 28.96;
            }
        }
        return;
    }
    public void grazinti(){
        grazintina = imoka * laikas - imoka * men;
    }
    public void check(){
        if (kreditas.equals("busto")){
            busto = true;
        }
        else if (kreditas.equals("vartojimo")){
            vartojimo = true;
        }
        }
    public void checkVaikai(){
        if (vaikai > 0 && vaikai < 10){
            ok = true;
        }
        else{
            ok = false;
        }
    }
    public void checkPajamos(){
        if ((busto = true && pajamos >= 0 && pajamos <= 30000) || (vartojimo = true && pajamos >= 0 && pajamos <= 10000)){
            ok = true;
        }
        else{
            ok = false;
        }
    }
    public void checkSkolos(){
        if ((busto = true && skolos >= 0 && skolos <= 15000) || (vartojimo = true && skolos >= 0 && skolos <= 5000)){
            ok = true;
        }
        else{
            ok = false;
        }
    }
    public void checkSuma(){
        if ((busto = true && suma >= 0) || (vartojimo = true && suma >= 300 && suma <= 26000)){
            ok = true;
        }
        else{
            ok = false;
        }
    }
    public void checkLaikas(){
        if ((busto = true && laikas/12 >= 0 && laikas/12 <= 40) || (vartojimo = true && laikas/12 >= 0 && laikas/12 <= 5)){
            ok = true;
        }
        else{
            ok = false;
        }
    }
}
