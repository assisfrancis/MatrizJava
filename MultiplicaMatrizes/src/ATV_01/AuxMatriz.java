/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV_01;   // Estudo de matrizes

import java.util.Scanner;
/**
 *
 * @author kim
 */
public class AuxMatriz {
   
        static Scanner scan = new Scanner(System.in);
        static    int lma =2;
        static   int cma =2 ;
        static   int [][] matrizA = new int[lma][cma];
        static int lmb =2;
        static int cmb =2 ;
        static    int [][] matrizB = new int[lmb][cmb];
        static     int [][]matrizC = new int[lma][cmb]; 
        
public void TamanhoDasMatrizes(){
    System.out.println("Quanta linha e quantas colunas terá a matriz A: ");
    System.out.println("Digite o número de linhas da Matriz A");
    int numLin = scan.nextInt();
    System.out.println("Digite o número de colunas da Matriz A");
    int numCol = scan.nextInt();
}    
    
public static void preencherMatriz(){
    for(int i=0;i<lma;i++){
        for(int j=0;j<cma;j++){
            System.out.println("Digite valor da matriz A:");
            matrizA[i][j] = scan.nextInt();
          }
        }
    for(int i=0;i<lmb;i++){
        for(int j=0;j<cmb;j++){
            System.out.println("Digite valor da matriz B:");
            matrizB[i][j] = scan.nextInt();
            }
        }
    }
public void imprimirMatriz(){
     System.out.println("Imprimi a matriz A");
    for(int i=0;i<lma;i++){
        for(int j=0;j<cma;j++){
             System.out.println(matrizA[i][j] +" ");
            }
        } 
    System.out.println("Imprime a matriz B");
    for(int i=0;i<lmb;i++){
        for(int j=0;j<cmb;j++){
             System.out.println(matrizB[i][j] +" ");
            }
        }
        System.out.println("********************************************");
    }
public void multiplicarMatrizes(){
     System.out.println("verifica se é possível fazer a multiplicação");
      if(matrizA[0].length == matrizB.length){            
            for(int i = 0;i<lma; i++){
                for(int j=0; j< cmb; j++){
                    for(int k=0;k<lmb; k++){
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
        }else{
            System.out.println("Não é possível fazer a multipoicação");
        }
   }
public void imprimirMatrizC(){
    System.out.println("O resultado da multiplicação da matriz A pela matriz B...!");
    for(int i=0;i<lma;i++){
        for(int j=0;j<cmb;j++){
                System.out.println(matrizC[i][j] +" ");
        }
    }
  }
}