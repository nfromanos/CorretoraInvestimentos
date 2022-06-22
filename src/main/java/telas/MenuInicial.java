package telas;

import telas.Cliente.CadastroCliente;

import java.util.Scanner;

public class MenuInicial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("\nQual opção deseja selecionar?\n1-Criar conta\n2-Acessar conta\n3-Sair");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    CadastroCliente criarCliente = new CadastroCliente();
                    criarCliente.criar();
                    break;
                case "2":
                    Login acessoCliente = new Login();
                    acessoCliente.logar();
                    break;
                case "3":
                    SimularInvestimento.simulacao(scanner);
                    break;
                case "4":
                    break;
            }
        } while(!opcao.equals("4"));
    }
}