import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("Ingrese el valor del 1 al 7");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1)
            System.out.println("lunes");
        else if ( n == 2)
            System.out.println("martes");
        else if ( n == 3)
            System.out.println("miercoles");
        else if ( n == 4)
            System.out.println("jueves");
        else if ( n == 5)
            System.out.println("viernes");
        else if ( n == 6)
            System.out.println("sabado");
        else if ( n == 7)
            System.out.println("domingo");
        else
            System.out.println(" 7 dias de la semana");