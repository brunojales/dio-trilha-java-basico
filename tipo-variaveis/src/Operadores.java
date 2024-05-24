public class Operadores {

    public static void main(String[] args) {

        //No exemplo abaixo mostra que o sinal de + serve tanto para calular numeros interios
        //Quanto para concatenar strings
       // String nomeCompleto = "LINGUAGEM" + "JAVA";
       // System.out.println("Resultado: " + nomeCompleto);

        //Exemplos de concatenação
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println("Resultado: " +concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("Resultado: " +concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println("Resultado: " +concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("Resultado: " +concatenacao);

    }
    
}
