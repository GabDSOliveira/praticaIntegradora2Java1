import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Candidato> candidatos = new ArrayList<>();
    public static void main(String[] args) {
        boolean ligado = true;

        while (ligado) {
            System.out.printf("Escolha uma das opções:%n" +
                    "1) Inscrever candidato;%n" +
                    "2) Cancelar inscrição do candidato;%n" +
                    "3) Valor a pagar;%n" +
                    "4) Encerrar programa%n");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.printf("Escolha uma categoria:%n" +
                            "1) Circuito pequeno;%n" +
                            "2) Circuito médio;%n" +
                            "3) Circuito avançado;%n");
                    int escolhaCategoria = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhaCategoria > 0 && escolhaCategoria < 4) {
                        Candidato novoParticipante = Inscricao.inscreverParticipante(escolhaCategoria);
                        if (novoParticipante != null){
                            candidatos.add(novoParticipante);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Id do candidato:");
                    int id = scanner.nextInt();
                    if (id <= 0) {
                        System.out.println("ID Inválido");
                    } else {
                        candidatos.set(id - 1, null);
                        System.out.println("Candidato " + id + " removido");
                    }
                    break;
                case 3:
                    System.out.println("Id do candidato:");
                    int idCandidato = scanner.nextInt();
                    if (idCandidato <= 0) {
                        System.out.println("ID Inválido");
                    } else {
                        Inscricao.valorAPagar(candidatos.get(idCandidato-1).getCategoria(), candidatos.get(idCandidato-1).getIdade());
                    }
                    break;
                case 4:
                    ligado = false;
                    break;
            }
        }

    }
}
