package telas;
import dominios.TiposDeInvestimento;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Qual opção deseja selecionar?\n1-Criar conta\n2-Acessar conta\n3-Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    CadastroCliente criarCliente = new CadastroCliente();
                    criarCliente.criar();
                    break;
                case 2:
                    AcessoCliente acessarCliente = new AcessoCliente();
                    acessarCliente.acessar();
                    break;
                case 3:
                    break;

            }
        }while(opcao!=3);

    }
}
