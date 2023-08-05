package br.senai.sp.form;

import java.util.Scanner;

public class form {
    public static void main(String[] args) {

        /** Declaração  das variaveis */

       /** import da class Scanner */
        Scanner teclado= new Scanner(System.in);

        /** Coleta dados do User
        System.out.print("Bom dia! Qual é o seu nome: ");
        String nome= teclado.nextLine();

        System.out.print("Bom dia! Qual é a sua  idade: ");
       int idade= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu peso: ");
        int peso= teclado.nextInt();

        System.out.print("Bom dia! Qual é o sua altura: ");
       float altura= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu Rg: ");
       int rg= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu cpf: ");
        long cpf= teclado.nextLong();

        System.out.print("Bom dia! Qual é o sua profissao: ");
       String profissao= teclado.next();

        System.out.print("Bom dia! Qual é o seu curso: ");
        String curso= teclado.next();


        /** Coleta dados do User1

        System.out.print("Bom dia! Qual é o seu nome: ");
        String nome1= teclado.next();

        System.out.print("Bom dia! Qual é a sua  idade: ");
        int idade1= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu peso: ");
        int peso1= teclado.nextInt();

        System.out.print("Bom dia! Qual é o sua altura: ");
        float altura1= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu Rg: ");
        int rg1= teclado.nextInt();

        System.out.print("Bom dia! Qual é o seu cpf: ");
        long cpf1= teclado.nextLong();

        System.out.print("Bom dia! Qual é o sua profissao: ");
        String profissao1= teclado.next();

        System.out.print("Bom dia! Qual é o seu curso: ");
        String curso1= teclado.next();*/



        /** Printa as informações
        System.out.println("_____________");
        System.out.println("_____________Formulario______");
        System.out.println("Olá "  + nome + " e "+ nome1 +" Seja Bem vindo");
        System.out.println("Sua idade é: "  + idade+ " e " +idade1);
        System.out.println("Seu peso é: "  + peso+ " e " +peso1);
        System.out.println("Sua altura é: "  + altura+ " e " +altura1 );
        System.out.println("Seu RG é: "  + rg+ " e " +rg1);
        System.out.println("Seu CPF é: "  + cpf +" e "+cpf1 );
        System.out.println("Sua profissao é: "  + profissao+ " e "+profissao1 );
        System.out.println("Seu curso é: "  + curso );
        System.out.println("_____________");
        System.out.println("_____________");*/

        String [] nomes = new String[2];
        System.out.println("Qual o nome do Prof 1 : ");
        nomes [0] =teclado.next();

        System.out.println("Qual o nome do Prof 2 :  ");
        nomes [1] =teclado.next();

        System.out.println("Ola professores: " + nomes[0]+ " e " + nomes [1]+ " Sejam bem vindos");

        int [] idade = new  int[2];
        System.out.println("Qual o idade do Prof 1 : ");
        idade [0] =teclado.nextInt();

        System.out.println("Qual o idade do Prof 2 :  ");
        idade [1] =teclado.nextInt();

        int [] peso = new int[2];
        System.out.println("Qual o peso do Prof 1 : ");
        peso [0] =teclado.nextInt();


        System.out.println("Qual o peso do Prof 2 : ");
        peso [1] =teclado.nextInt();

        int [] altura = new int[2];
        System.out.println("Qual a altura do professor 1 : ");
        altura [0] =teclado.nextInt();

        System.out.println("Qual a  altura do professor 2 : ");
        altura [1] =teclado.nextInt();

        int [] rg = new int[2];
        System.out.println("Qual o Rg do professor 1 : ");
        altura [0] =teclado.nextInt();

        System.out.println("Qual o Rg do professor 2 : ");
        altura [1] =teclado.nextInt();


        long [] cpf = new long[2];
        System.out.println("Qual o cpf do professor 1 : ");
        cpf [0] =teclado.nextLong();

        System.out.println("Qual o cpf do professor 1 : ");
        cpf [1] =teclado.nextLong();

        String [] curso = new String[2];
        System.out.println("Qual o curso do Prof 1 : ");
        curso [0] =teclado.next();

        System.out.println("Qual o curso do Prof 2 :  ");
        curso [1] =teclado.next();

        String [] profissao = new String[2];
        System.out.println("Qual o profissao do Prof 1 : ");
        profissao [0] =teclado.next();

        System.out.println("Qual o profissao do Prof 2 :  ");
        profissao [1] =teclado.next();





    }




}
