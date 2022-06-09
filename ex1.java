package src;

import java.util.Scanner;

public class ex1 {
    private static final Scanner entrada = null;
    public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {



        //1. programa que peça dois dois n inteiros e imprima a soma desses 2 n na tela

        System.out.println("digite um valor");
        int valor1 = entrada.nextInt();
        System.out.println ("seu valor eh " + valor1);

        System.out.println("digite um valor");
        int valor2 = entrada.nextInt();
        System.out.println ("seu valor eh " + valor2);

        int somaex1 = valor1+valor2;
        System.out.println ("a soma desses valores eh " + somaex1);

        //2. escreva um programa que leia um valor em m e o exiba conv em cm

        System.out.println("digite o seu valor, em metros (m)");
        double metro = entrada.nextDouble();
        System.out.println ("seu valor eh " + metro*100 + " centimetros (cm)");


        //3. programa que peca um n e imprima dizendo se eh par ou impar

        System.out.println("digite o seu valor");
        double valoranalisado = entrada.nextDouble();


        if (valoranalisado%2 == 0){
            System.out.println ("seu valor eh par ");
        }else{
            System.out.println ("seu valor eh impar ");
        }
    }
}
}




        
    
