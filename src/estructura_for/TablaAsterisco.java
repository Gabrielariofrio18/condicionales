package estructura_for;

import java.util.Scanner;

public class TablaAsterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = teclado.nextInt();
        System.out.println("Ingrse el numero de columnas");
        int columnas= teclado.nextInt();
        for(int fila =1; fila <= filas; fila++){//controlamos numero de filas
            String fila_asteriscos = "";
            for(int col=1;col<=columnas; col++){//controlamos el numero de columnas
                fila_asteriscos = fila_asteriscos+"*";
            }
            System.out.println(fila_asteriscos);
        }
    }
}
