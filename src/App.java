import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int flag = 0;

        Clinica secretaria = new Clinica();

        while (flag != 6) {

            System.out.println("=============================");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Médico");
            System.out.println("3 - Lista de Médicos");
            System.out.println("4 - Cadastrar Consulta");
            System.out.println("5 - Ver Agendas");
            System.out.println("6 - Encerrar Programa");
            System.out.println("=============================");
            System.out.print("Selecione uma opção: ");
            flag = teclado.nextInt();

            switch (flag) {
                case 1:
                    secretaria.cadastrarCliente();
                    break;
                case 2:
                    secretaria.cadastrarMedico();
                    break;
                case 3:
                    secretaria.mostrarListaMedico();
                    break;
                case 4:
                    secretaria.cadastrarConsulta();
                    break;
                case 5: 
                    secretaria.verificarAgenda();
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }

        }
    }
}
