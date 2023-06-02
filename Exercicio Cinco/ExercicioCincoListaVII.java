import java.util.Scanner;

public class ExercicioCincoListaVII {

    public static void main(String[] args) {
        ValidacaoTelefone  validacaoTelefone = new ValidacaoTelefone();

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tPROGRAMAÇÃO DE SOLUÇÕES COMPUTACIONAIS");
        System.out.println("\t\tLISTA VII");

        System.out.println("\nPor favor insira o número de telefone:");
        ExercicioCinco.setNumeroTelefone(scanner.nextLine());
        
        scanner.close();

        validacaoTelefone.RealizaFuncaoExercicoV();
        
        
    }
}