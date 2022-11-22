public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE OPERADORES LÓGICOS O BOOLEANOS");
        boolean valor = (5 != 5);//operador relacional
        boolean valor_logico = ((5==5) || (4 >= 3) );// V or F
        valor_logico = (true);
        System.out.println( "valor: "+ valor );
        System.out.println("valor_logico: "+valor_logico);
        String valor_logico_and = null;
        System.out.println("valor_logico_and: "+valor_logico_and);
        System.out.println("negacion de valor_logico"+!valor_logico);
    }
}
