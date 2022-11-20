package br.com.bytebank.banco.test;

public class TesteString {
    public static void main(String[] args) {
        //String depois de definida nao pode ser alterada.
        String nome = "Alura";
        String vazio = "    Alura     ";

        boolean alu = vazio.contains("Alu");
        System.out.println("alu = " + alu);

//        String s = vazio.trim();
//        System.out.println(s);

//        boolean empty = nome.isEmpty();
//        System.out.println("empty = " + empty);

//        int length = nome.length();
//        for (int i=0; i<nome.length(); i++) {
//            System.out.println(nome.charAt(i));
//        }

//        String s = nome.substring(1);
//        System.out.println(s);

//        char c = nome.charAt(0);
//        System.out.println(c);

//        int i = nome.indexOf("ra");
//        System.out.println(i);

//        String outra = nome.replace("A", "a");
//        String outra = nome.toUpperCase();
//        System.out.println(nome);
//        System.out.println(outra);
    }
}
