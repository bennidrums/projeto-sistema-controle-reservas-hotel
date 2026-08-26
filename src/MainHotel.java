import java.util.Scanner;

public class MainHotel {
    // Vetor que armazena até 10 reservas
    static Reserva[] reservas = new Reserva[10];
    // Controla a quantidade de reservas cadastradas
    static int quantidadeReservas = 0;

    public static void main(String[] args) {

        int opcao;

        System.out.println("\n======HOTEL=DRAW======");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n======================");
            System.out.println("        MENU");
            System.out.println("======================\n");
            System.out.println("1 - CADASTRAR RESERVA DO CLIENTE");
            System.out.println("2 - LISTAR RESERVAS DO CLIENTE");
            System.out.println("3 - PESQUISAR NOME DO CLIENTE");
            System.out.println("4 - RESERVAS POR NÚMERO DE DIAS");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    opcao1(sc);
                    break;
                case 2:
                    opcao2(sc);
                    break;
                case 3:
                    opcao3(sc);
                    break;
                case 4:
                    opcao4(sc);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        sc.close();
    }

    public static void opcao1(Scanner sc) {
        System.out.println("\nCADASTRAR RESERVA DO CLIENTE");
        int novoCadastroReserva;
        do {
            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = sc.nextLine();
            System.out.print("Qual quarto para reserva: ");
            String tipoQuarto = sc.nextLine();
            System.out.print("Quantidade de dias para reserva?: ");
            int quantidadeDiasReserva = sc.nextInt();
            while (quantidadeDiasReserva <= 0) {
                System.out.print("Quantidade de dias invalida! digite novamente: ");
                quantidadeDiasReserva = sc.nextInt();
            }
            System.out.print("Valor do quarto para reserva: ");
            double precoReserva = sc.nextDouble();
            while (precoReserva <= 0) {
                System.out.print("Valor invalido! digite novamente: ");
                precoReserva = sc.nextDouble();
            }
            sc.nextLine();
            if(quantidadeReservas < reservas.length) {
                reservas[quantidadeReservas] = new Reserva(nomeCliente, tipoQuarto, quantidadeDiasReserva, precoReserva);
                quantidadeReservas++;
            }else {
                System.out.println("Hotel sem vagas no momento!");
            }

            System.out.print("\n01 - Novo cadastro \n02 - Voltar ao menu");
            System.out.print("\n........:");
            novoCadastroReserva = sc.nextInt();
            sc.nextLine();
        } while (novoCadastroReserva == 1);
    }

    public static void opcao2(Scanner sc) {
        System.out.println("\nLISTA DE RESERVAS DOS CLIENTES");
        if (quantidadeReservas == 0) {
            System.out.println("Nenhuma reserva encontrada!");
        }
        for (int i = 0; i < quantidadeReservas; i++) {
            System.out.println(reservas[i]);
        }
    }

    public static void opcao3(Scanner sc) {
        System.out.println("\nBUSCAR RESERVA DO CLIENTE");
        int novaBuscaCliente;
        do {
            System.out.print("Digite o nome do cliente: ");
            String nomeBuscaCliente = sc.nextLine();
            boolean encontrou = false;

            for (int i = 0; i < quantidadeReservas; i++) {
                if (reservas[i].getNomeCliente().toLowerCase().contains(nomeBuscaCliente.toLowerCase())) {
                    System.out.println(reservas[i]);
                    encontrou = true;
                }
            }
            if (!encontrou) {
                System.out.println("Nenhuma reserva encontrada!");
            }

            System.out.print("\n01 - Nova busca \n02 - Voltar ao menu");
            System.out.print("\n........:");
            novaBuscaCliente = sc.nextInt();
            sc.nextLine();
        } while (novaBuscaCliente == 1);
    }

    public static void opcao4(Scanner sc) {
        System.out.println("RESERVAS POR NÚMERO DE DIAS");
        if (quantidadeReservas == 0) {
            System.out.println("Nenhuma reserva encontrada!");
        }
        // Ordena as reservas por quantidade de dias, do maior para o menor
        for (int i = 0; i < quantidadeReservas; i++) {
            for (int j = i + 1; j < quantidadeReservas; j++) {
                if (reservas[j].getQuantidadeDiasReserva() > reservas[i].getQuantidadeDiasReserva()) {
                    Reserva temporaria = reservas[i];
                    reservas[i] = reservas[j];
                    reservas[j] = temporaria;
                }
            }
        }
        for (int i = 0; i < quantidadeReservas; i++) {
            System.out.println(reservas[i]);
        }
    }
}