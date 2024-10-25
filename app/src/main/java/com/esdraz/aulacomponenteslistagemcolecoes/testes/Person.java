package com.esdraz.aulacomponenteslistagemcolecoes.testes;

public class Person {

    private String nome = "";
    private int idade = 0;

    public void salvarTelefone(String... telefones) {
        for (String telefone : telefones) {
            System.out.println("Telefone:" + telefone);
        }
    }

}
