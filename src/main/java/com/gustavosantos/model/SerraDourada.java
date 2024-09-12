/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustavosantos.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LAB 07
 */
public class SerraDourada {
    private String[] arrayMateria = new String [4];
    private List<NotaAluno> listNotaAluno = new ArrayList<NotaAluno>();;
    private String nome = "";

    public SerraDourada(){
        this.arrayMateria[0] = "Lógica de Programação";
        this.arrayMateria[1] = "Sistemas Operacionais";
        this.arrayMateria[2] = "Arquitetura de Computadores";
        this.arrayMateria[3] = "Desenvolvimento de Produtos";
}

    public void entradaDeNotas(){
        Scanner ler = new Scanner(System.in);
        Double nota = 0.0;
        System.out.print("Digite seu nome: ");
        this.nome = ler.nextLine();

    for(int i = 0;i<arrayMateria.length;i++){
        System.out.print("Entre com a nota da disciplina " + arrayMateria[i] + " - ");
        nota = ler.nextDouble();
        NotaAluno notaAluno = new NotaAluno();
        notaAluno.setDisciplina(arrayMateria[i]);
        notaAluno.setNome(nome);
        notaAluno.setNotaFinal(nota);
        listNotaAluno.add(notaAluno);
        }
}



    public void imprimirNotas(){
        Scanner ler = new Scanner(System.in);
        String conf = "";

        System.out.print("Imprimir notas s/n ");
        conf = ler.nextLine();

        System.out.println(this.nome);
        if (conf.equalsIgnoreCase("s") || conf.equalsIgnoreCase("S")){
        for(NotaAluno notaAluno :listNotaAluno){

        System.out.print(notaAluno.getDisciplina() + " - ");
        System.out.println(notaAluno.getNotaFinal());
}

}
}

}
