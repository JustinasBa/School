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


public class TreciasPraktinis {

    public static void main(String[] args) {
        String kreditas;
        PaskolosApskaiciavimas paskola = new PaskolosApskaiciavimas();
        Scanner input = new Scanner(System.in);
        Suteikimas suteikimas = new Suteikimas(paskola, input);
   
        
    }}



