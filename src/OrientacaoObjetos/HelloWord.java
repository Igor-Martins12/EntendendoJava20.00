package orientacaoObjetos;


public class HelloWord {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "marron", 25, 5.5, "nada", 5 );

        
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());
        System.out.println("O Cachorro pegou uma " + cachorro1.pegar());
          System.out.println("O Cachoro esta " + cachorro1.interagir("carinho"));
            System.out.println("O Cachoro esta " + cachorro1.interagir("nada"));
              System.out.println("O Cachoro esta " + cachorro1.interagir("Vai dormir!"));
        
    }
    
}
