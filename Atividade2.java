/*
Implementar um algoritmo que lê 5 valores do teclado, coloca eles na ordem de entrada no vetor, e mostra eles na ordem em que foram inseridos
Parte 2: mostre os valores na ordem inversa de que foram inseridos
 */

package atividade.pkg2;
import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        
        System.out.println("O programa irá ler 5 valores digitados e colocar em ordem");
        
        int v[];
        int vetor = 5;
        v = new int [vetor];

    for(int i=0; i<vetor; i++){
        System.out.println("Digite o "+(i+1)+"º valor: ");
            int valor = my_scan.nextInt();
            v[i] = valor;
    }
        System.out.println("\nOs valores na ordem digitada são: ");
    for(int i=0; i<vetor; i++){
            System.out.println();
                System.out.println(v[i]);
    }
        System.out.println("\nOs valores na ordem inversa a digitada são: ");
    for(int i=4; i<=4 && i>=0; i=i-1){
            System.out.println();
                System.out.println(v[i]);
    }
    }
}