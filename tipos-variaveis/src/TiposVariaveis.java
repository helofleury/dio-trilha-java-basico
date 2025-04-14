public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;

        System.out.println("Número: " + numero);

        final double valor_de_pi = 3.14;
        double resultado = valor_de_pi + numero;
        
        System.out.println("Resultado da soma: " + resultado);
    }
}
