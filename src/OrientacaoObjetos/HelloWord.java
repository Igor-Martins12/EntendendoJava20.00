package orientacaoObjetos;

import Lojas.PetShop;

public class HelloWord {

    public static void main(String[] args) {

       Cachorro cachorro1 = new Cachorro("Feliz", "PRETO", 0, 4.5);

        
        Gato gato1 = new Gato("Felix", "rosa", 3.5 );


            
       Passaro passaro1 = new Passaro("frajola", "verde", 0.5 );

       PetShop petShop = new PetShop();

       petShop.darbanho(cachorro1);
       System.out.println(cachorro1.getEstadoDoEspirito());




        // new Cachorro("Puppy", "marron", 25, 5.5, "nada", 5 );

        // System.out.println(Cachorro.getNumerodeCachorro());
        
        // System.out.println(Cachorro.getNumerodeCachorro());
        // System.out.println(Cachorro.getNumerodeCachorro());
        // System.out.println("O Cachorro pegou uma " + cachorro1.pegar());
        //   System.out.println("O Cachoro esta " + cachorro1.interagir("carinho"));
        //     System.out.println("O Cachoro esta " + cachorro1.interagir("nada"));
        //       System.out.println("O Cachoro esta " + cachorro1.interagir("Vai dormir!"));
        
    }
    
}
