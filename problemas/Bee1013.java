/*
1013 - O Maior

Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a + b + (abs(a - b))) / 2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

import java.io.IOException;
import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int absab = a - b;
        int maior = 0;
        
        if(absab < 0){
            absab = -absab;
        }

        int maiorab = (a + b + absab) / 2;

        if(maiorab > c || maiorab == c){
            maior = maiorab;
        }else{
            maior = c;
        }

        System.out.printf("%d eh o maior%n", maior);

        sc.close();

    }
}
