package pacotejava;

import java.util.Scanner;

public class classejava {
	
	

    public static void main(String[] args) {

        System.out.println("Digite um número");
        Scanner leia = new Scanner(System.in);

        int numero = leia.nextInt();

        if (numero == 0) {
            System.out.println("\n O numero:" + numero + " é par");
        } else if (numero > 0) {
            // Goddesses de positive e par our positive e impair
            if (numero % 2 == 0) {
                System.out.println("\n O numero:" + numero + " é positivo e par");
            } else {
                System.out.println("\n O numero:" + numero + " é positivo e impar");
            }
        } else {
            if (numero % 2 != 1) {
                System.out.println("\n O numero:" + numero + " é negativo e par");
            } else {
                System.out.println("\nO número: " + numero + " é negativo e ímpar");
            }

        }


    }

			
			
    
    

	
    
    	
    }
    

