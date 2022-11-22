import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero del 1 al 3");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Escribir base");
                int base = teclado.nextInt();
                System.out.println("Escribir altura");
                int altura = teclado.nextInt();
                double area = (base*altura)/2;
                System.out.println("area final=" +area);
                break;//salta el final de la estructura switch
            case 2:
                System.out.println("Escribir radio del circulo");
                int radio = teclado.nextInt();
               double area_C = Math.pow(radio,2) *Math.PI;
                System.out.println("area final="+area_C);
                break;
            case 3:
                System.out.println("Escribir radio del cuadrado");
                System.out.println("Escribir lado");
                int lado = teclado.nextInt();
                double lado_C = Math.pow(lado,2);
                System.out.println("area final="+lado_C);
                break;
        }

    }
}
