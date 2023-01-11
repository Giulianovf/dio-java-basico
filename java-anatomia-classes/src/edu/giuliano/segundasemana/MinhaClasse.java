package edu.giuliano.segundasemana;
public class MinhaClasse {

    public static void main (String [] args) {
        //System.out.print ("Olá Turma, sejam bem-vindos!")
        String primeiroNome = "Giuliano";
        String segundoNome = "Figueiró";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        /*int anoFabricacao = 2022;

        boolean verdadeira = false;

        anoFabricacao = 2023;
        */

        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return primeiroNome.concat(" ").concat(segundoNome);
        }

    }

    private static String nomeCompleto(String primeiroNome, String segundoNome) {
        return null;
    }
    
}
