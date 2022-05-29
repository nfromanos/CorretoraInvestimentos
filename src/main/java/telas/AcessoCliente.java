package telas;
import dominios.Cliente;
import dominios.TiposDeInvestimento;
import dominios.Usuario;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

import static repositorio.ClientRepository.listaDeClientes;

public class AcessoCliente {

    public void acessar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre o seu login:");
        String login = scanner.next();
        System.out.println("Entre a sua senha:");
        String senha = scanner.next();

//        for (Cliente usuario : listaDeClientes) {
//            if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
//                System.out.println("Usuário encontrado, entre a opção desejada:\n1 - Investir\n2 - Retirar investimento\n3 - Acompanhar os investimentos\n4 - Ver tipos de investimentos");
//                switch(scanner.next()){
//                    case "1":
////                        if(){
////
////                        } else if () {
////
////                        } else if () {
////
////                        }
////                        else{
//
//                        }
//                    case "2":
//                    case "3":
//                    case "4":
//                        for(TiposDeInvestimento investimento : TiposDeInvestimento.values()){
//                            System.out.println(investimento);
//                        }
//                }
//            }
        }
    }
