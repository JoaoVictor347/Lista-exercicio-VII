

public class ValidacaoTelefone {

    public void RealizaFuncaoExercicoV() {
        
        
        

        System.out.print("Telefone: ");
        String telefone = ExercicioCinco.getNumeroTelefone();

        
        telefone = telefone.replaceAll("\\D", "");

        if (telefone.length() == 8) {
            telefone = "9" + telefone;
            System.out.println("Telefone possui 8 dígitos.");
            System.out.println("Vou acrescentar o dígito '9' na frente.");
        } else if (telefone.length() != 9) {
            System.out.println("Número de telefone inválido.");
            return;
        }

        String telefoneFormatado = telefone.substring(0, 5) + "-" + telefone.substring(5);

        System.out.println("Telefone corrigido sem formatação: " + telefone);
        System.out.println("Telefone corrigido com formatação: " + telefoneFormatado);
    }
}
