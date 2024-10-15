/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV_01;

import java.util.Scanner;

/**
 *
 * @author kim
 */
public class MultMatriz {
    
    public  void Atv01_matriz() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de linhas da matriz A:");
        int linha = entrada.nextInt();
        System.out.println("Digite o número de colunas da matriz A:");
        int coluna = entrada.nextInt();
        int [][] matrizA = new int[linha][coluna];
        System.out.println("Digite o número de linhas da matriz B:");
        int linha2 = entrada.nextInt();
        System.out.println("Digite o número de colunas da matriz B:");
        int coluna2 = entrada.nextInt();
        int [][] matrizB = new int[linha2][coluna2];
        
        for(int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                System.out.println("Digite valor da matriz A:");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        
        for(int i=0;i<linha2;i++){
            for(int j=0;j<coluna2;j++){
                System.out.println("Digite valor da matriz B:");
                matrizB[i][j] = entrada.nextInt();
            }
        }
       for(int i=0;i<linha;i++){
            for(int j=0;j<coluna;j++){
                System.out.println(matrizA[i][j] +" ");
            }
        } 
        System.out.println("");
         for(int i=0;i<linha2;i++){
            for(int j=0;j<coluna2;j++){
                System.out.println(matrizB[i][j] +" ");
            }
        }
        //System.out.println("verifica se é possível fazer a multiplicação");
        if(matrizA[0].length == matrizB.length){
            int [][]matrizC = new int[linha][coluna2];
            
            for(int i = 0;i<linha; i++){
                for(int j=0; j< coluna2; j++){
                    for(int k=0;k<linha2; k++){
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
        System.out.println("matriz C");
         for(int i=0;i<linha;i++){
            for(int j=0;j<coluna2;j++){
                System.out.println(matrizC[i][j] +" ");
            }          
        } 
            
        }else{
            System.out.println("Não é possível fazer a multipoicação");
        }
        
    }
}
