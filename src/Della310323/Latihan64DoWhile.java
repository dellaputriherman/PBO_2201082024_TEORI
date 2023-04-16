/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Della310323;

import java.util.Scanner;
/**
 *
 * @author windows
 */
public class Latihan64DoWhile {
        public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("masukkan angka : ");
    int angka = input.nextInt();
    System.out.println("masukkan pangkat : ");
    int pangkat = input.nextInt();

    int i = 1;
    int h = 1;

    do {
    h = h*angka;
    i++ ;
    }while(i<pangkat);
    System.out.println(angka +" ^ " + pangkat + " = " +h);
   }
}
    

