package estructura_for;

import java.util.Scanner;

public class SumaImpares {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero limte: ");
        Scanner teclado = new Scanner(System.in);
        int suma_impares = 0;
        int limite = teclado.nextInt();
        for(int contador = 1; contador <= limite; contador=contador+2){
            if(contador%2==1)
                suma_impares = suma_impares + contador;
        }
        System.out.println("La suma de los numeros impares ="+suma_impares);
    }
}
