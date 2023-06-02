import models.ExercicioQuatro;
import models.FuncaoExercicioQuatro;

import java.util.Scanner;
public class ExercicioQuatroListaVII{

        public static void main(String[] args) {

            FuncaoExercicioQuatro funcaoExercicioQuatro = new FuncaoExercicioQuatro();
            Scanner scanner = new Scanner(System.in);
            

            System.out.println("\tPROGRAMAÇÃO DE SOLUÇÕES COMPUTACIONAIS");
            System.out.println("\t\tLISTA VII");

            System.out.println("\n Por favor, insira um número de 0 a 99.");
            ExercicioQuatro.setNumeroUsuario(scanner.nextInt());
            funcaoExercicioQuatro.escrevePorExtenso();

            scanner.close();
        }
}