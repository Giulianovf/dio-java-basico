import java.util.Scanner;

/*Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre 
a quantidade de números pares e a quantidade de números impares. */


public class Ex4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero =scan.nextInt();

            if(numero % 2 == 0 ) quantPares++;
            else quantImpares++;


            count++;            
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares );
        System.out.println("Quantidade Impar: " + quantImpares );
    }
}