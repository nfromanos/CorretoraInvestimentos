package telas;
import java.util.Scanner;

public class Menu {

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
                    AcessoCliente acessoCliente = new AcessoCliente();
                    acessoCliente.logar();
                    break;
                case "3":
                    break;

            }
        }while(!opcao.equals("3"));
    }
}