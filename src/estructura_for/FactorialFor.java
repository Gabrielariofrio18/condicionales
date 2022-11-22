package estructura_for;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        int nult = 1;
        for(int contador = 1; contador <= numero;contador=contador+1){
            nult = nult*numero;
    }
    System.out.println("el factorial es: "+nult);
}
}
