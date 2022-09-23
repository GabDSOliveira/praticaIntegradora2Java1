import java.util.Scanner;

public class Inscricao {

    private static Scanner scanner = new Scanner(System.in);


    public static Candidato inscreverParticipante(int categoria){

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        if (categoria == 3 && idade < 18){
            System.out.println("Idade não permitida para essa categoria! Encerrando inscrição");
            return null;
        }
        scanner.nextLine();
        System.out.print("RG (apenas números): ");
        int rg = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Primeiro Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Numero de Celular (xx)xxxxx-xxxx: ");
        String numeroCelular = scanner.nextLine();
        System.out.print("Numero de Emergência (xx)xxxxx-xxxx: ");
        String numeroEmergencia = scanner.nextLine();
        System.out.print("Grupo Sanguíneo: ");
        String grupoSanguineo = scanner.nextLine();

        valorAPagar(categoria, idade);
        return new Candidato(rg, nome, sobrenome, idade, numeroCelular, numeroEmergencia, grupoSanguineo, categoria);
    }

    public static void valorAPagar(int categoria, int idade){
        if (categoria == 3){
            System.out.println("Valor da inscrição: R$2800,00");
        }
        if (idade < 18){
            if (categoria == 1){
                System.out.println("Valor da inscrição: R$1300,00");
            }else if (categoria == 2){
                System.out.println("Valor da inscrição: R$2000,00");
            }
        }else {
            if (categoria == 1){
                System.out.println("Valor da inscrição: R$1500,00");
            }else if (categoria == 2){
                System.out.println("Valor da inscrição: R$2300,00");
            }
        }
    }
}
