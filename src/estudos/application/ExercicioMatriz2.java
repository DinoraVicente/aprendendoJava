package estudos.application;

import java.util.Scanner;

public class ExercicioMatriz2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de linhas: ");
        int m = sc.nextInt();

        System.out.print("Quantidade de colunas: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        System.out.println("Números a serem inseridos nas linhas e colunas: ");
        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Qual número que deseja descobrir a posição?");
        int x = sc.nextInt();

        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.print("Posição: " + i + ", " + j);
                    System.out.println();
                }
                if(j > 0){
                    System.out.print("Para a esquerda: " + mat[i][j-1]);
                }
                if(j > 0){
                    System.out.print("Para a direita: " + mat[i][j+1]);
                }
                if(i > 0){
                    System.out.print("Para cima: " + mat[i+1][j]);
                }
                if(i > 0){
                    System.out.print("Para baixo: " + mat[i-1][j]);
                }
            }
        }
        sc.close();
    }
}
