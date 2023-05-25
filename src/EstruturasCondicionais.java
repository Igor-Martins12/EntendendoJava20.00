public class EstruturasCondicionais {
    public static void main(String[] args) {
        int nota = 100;
        String graduacao;

        // a 80 b 70 c 60 d 0

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "D";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
                graduacao = "";
            }

            switch (graduacao) { 
                case "A":
                case "B":
                    System.out.println("Aluno Aprovado!");
                    break;
                case "C":
                case "D":
                    System.out.println("Aluno Reprovado!");
                    break; 
                default:
                    System.out.println("Graduacao invalida!");
            }

        // int nota = 69;
        // // Nota maior ou igual 70, então aprovado
        // //if-else
        // if(nota >= 70) {
        // System.out.println("aluno aprovado!");
        // } else {
        // System.out.println("Nao aprovado.");
        // }

    }

}
