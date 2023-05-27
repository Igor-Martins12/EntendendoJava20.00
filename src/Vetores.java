import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int[] numeros = {9, 10 ,12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;
        for (int i=0; i < numeros.length; i++) {
            if( numeros[i] > maior){
                maior = numeros[i];
            }
            if ( numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }

        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
        System.out.println("Media:" + media/numeros.length);





        // int numeros1 = 1;
        // int numeros2 = 2;
        // int numeros3=  3;
        // int numeros4 = 4;
        // int numeros5 = 5;


        // String[] letras = new String[5];
        // letras[0] = "A";
        // letras[1] = "B";
        // letras[2] = "C";
        // letras[3] = "J";
        // letras[4] = "x";
        // for (int i=0; i < letras.length; i++) {
        //     System.out.println(letras[i]);

        // }

            // String[] letras = {"A", "B", "C", "J", "X"};
            // // for (int i=0; i < letras.length; i++) {
            // //          System.out.println(letras[i]);
        
            // //      }
            // System.out.println(Arrays.toString(letras));
    }

    
}
