import java.util.Scanner;

public class Atividade4 {
  public static void main(String[] args) {

    int[] codigos = new int[10]; // vetor para armazenar códigos de contas
    double[] saldos = new double[10]; // vetor para armazenar saldos de contas
    Scanner scanner = new Scanner(System.in); // objeto para ler entrada do usuário

    // Leitura de códigos e saldos
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o código da conta " + (i + 1) + ": ");
      codigos[i] = scanner.nextInt();
      System.out.print("Digite o saldo da conta " + (i + 1) + ": ");
      saldos[i] = scanner.nextDouble();
    }

    // Menu 
    while (true) {
      System.out.println("\nMenu de opções:");
      System.out.println("1. Efetuar depósito");
      System.out.println("2. Efetuar saque");
      System.out.println("3. Consultar o ativo bancário");
      System.out.println("4. Finalizar programa");
      System.out.print("Digite a opção desejada: ");
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          efetuarDeposito(codigos, saldos, scanner);
          break;
        case 2:
          efetuarSaque(codigos, saldos, scanner);
          break;
        case 3:
          consultarAtivoBancario(saldos);
          break;
        case 4:
          System.out.println("Programa finalizado!");
          return;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
  }

  // depósito
  public static void efetuarDeposito(int[] codigos, double[] saldos, Scanner scanner) {
    System.out.print("Digite o código da conta a receber o depósito: ");
    int codigo = scanner.nextInt();
    System.out.print("Digite o valor do depósito: ");
    double valor = scanner.nextDouble();

    // Verifica se o código da conta é válido
    int indice = -1;
    for (int i = 0; i < codigos.length; i++) {
      if (codigos[i] == codigo) {
        indice = i;
        break;
      }
    }

    if (indice != -1) {
      saldos[indice] += valor;
      System.out.println("Depósito efetuado com sucesso!");
    } else {
      System.out.println("Código de conta inválido.");
    }
  }

  // efetuar saque
  public static void efetuarSaque(int[] codigos, double[] saldos, Scanner scanner) {
    System.out.print("Digite o código da conta a sacar: ");
    int codigo = scanner.nextInt();
    System.out.print("Digite o valor do saque: ");
    double valor = scanner.nextDouble();

    // Verifica se o código da conta é válido
    int indice = -1;
    for (int i = 0; i < codigos.length; i++) {
      if (codigos[i] == codigo) {
        indice = i;
        break;
      }
    }

    if (indice != -1) {
      if (saldos[indice] >= valor) {
        saldos[indice] -= valor;
        System.out.println("Saque efetuado com sucesso!");
      } else {
        System.out.println("Saldo insuficiente.");
      }
    } else {
      System.out.println("Código de conta inválido.");
    }
  }

  // Método para consultar o ativo bancário
  public static void consultarAtivoBancario(double[] saldos) {
    double ativoBancario = 0;
    for (double saldo : saldos) {
      ativoBancario += saldo;
    }
    System.out.println("Ativo bancário: " + ativoBancario);
  }
}