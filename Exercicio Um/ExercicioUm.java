public class ExercicioUm {

//##############################################################

    private String palavraUm;

    public String getPalavraUm() {
        return palavraUm;
    }
    public void setPalavraUm(String palavraUm) {
        this.palavraUm = palavraUm;
    }

//##############################################################

    private String palavraDois;

    public String getPalavraDois() {
        return palavraDois;
    }
    public void setPalavraDois(String palavraDois) {
        this.palavraDois = palavraDois;
    }

//##############################################################

    public void funcaoExercicioUm(){



        System.out.println("Primeira palavra: " + getPalavraUm());
        System.out.println("Segunda palavra: " + getPalavraDois());
        System.out.println("Tamanho de '" + getPalavraUm() + "' " + getPalavraUm().length() +" caracteres"  );
        System.out.println("Tamanho de '" + getPalavraDois() + "' " + getPalavraDois().length() +" caracteres"  );

        if (getPalavraUm().length() == getPalavraDois().length()){
            System.out.println("As duas strings possuem tamanhos iguais.");
        }else {
            System.out.println("As duas strings possuem tamanhos diferentes.");
        }

        if (getPalavraUm().equals(getPalavraDois()) ){
            System.out.println("As palavras possuem o mesmo conteúdo.");

        }else {
            System.out.println("As palavras possuem conteúdos diferentes.");

        }

    }
    
}
