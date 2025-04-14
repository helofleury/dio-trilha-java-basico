public class Operadores {
    public static void main(String[] args) {
        // Operador de Concatenação de Strings 
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println("\n" + nomeCompleto);

        // Operador de Negação Lógica (!)
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);


        //Operador ternário (?:)
        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        // Comparação de Strings
        String nome1 = "Heloisa";
        String nome2 = "Heloisa";

        System.out.println(nome1 == nome2);

        // Comparação de Strings
        String nomeUm = "Isabela";
        String nomeDois = new String("Isabela");

        System.out.println(nomeUm.equals(nomeDois));

    
        // Operadores Lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

      

        // Verifica cada condição separadamente (sem else if)
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras!");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira!");
        }

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras!");
        }
    }
}
