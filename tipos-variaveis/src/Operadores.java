public class Operadores {

    public static void main(String[] args) {

        /*
         * String nomeCompleto = "LINGUAGEM" + "JAVA";
         * System.out.println(nomeCompleto);
         */

        /*
         * String concatenacao = "?";
         * 
         * concatenacao = 1+1+1+"1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1+"1"+1+1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1+"1"+1+"1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1"+1+1+1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1"+(1+1+1);
         * System.out.println(concatenacao);
         */

        // int numero = 5;
        // System.out.println(- numero);

        /*
         * numero = - numero;
         * 
         * System.out.println(numero);
         * 
         * numero = numero * -1;
         * System.out.println(numero);
         */
        /*
         * numero = numero + 4;
         * System.out.println(numero);
         */

        /*
         * numero++;
         * // numero = numero +1;
         * System.out.println(numero);
         */
        /*
         * //INCREMENTO DE VALORES.
         * System.out.println( ++ numero);
         * System.out.println(numero);
         */

        // VALORES BOOLEANOS.

        /*
         * boolean variavel = true;
         * //System.out.println(!variavel);
         * variavel = !variavel;
         * System.out.println(variavel);
         */
        // Operadores - 06.
        /*
         * int a, b;
         * 
         * a = 6;
         * b = 6;
         * 
         * String resultado = a == b ? "verdadeiro" : "falso";
         * //String resultado = a == b ? 1 : 0;
         * System.out.println(resultado);
         */

         // Operadores - 06.
        /*
         * String nomeUm = "JONATHAN";
         * String nomeDois = new String("JONATHAN");
         * System.out.println(nomeUm == nomeDois);
         * 
         * int numero1 = 1;
         * int numero2 = 2;
         * 
         * 
         * boolean simNao = numero1 == numero2;
         * 
         * if (numero1 == numero2) {
         * System.out.println("A nossa condição é verdadeira!");
         * } else {
         * System.out.println("numeroUm é diferente a numeroDois? " + simNao);
         * }
         * System.out.println("numeroUm é igual a numeroDois? " + simNao);
         * 
         * simNao = numero1 != numero2;
         * System.out.println("numeroUm é diferente a numeroDois? " + simNao);
         * 
         * simNao = numero1 > numero2;
         * System.out.println("numeroUm é maior que numeroDois? " + simNao);
         * 
         */

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras!");
        }
        System.out.println("fim");
    }
}
