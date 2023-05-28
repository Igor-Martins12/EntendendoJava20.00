package orientacaoObjetos;

public class Passaro extends animal {
    static int numerosDePassaros;
   
    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
     }
     @Override
     public void soar() {
      System.out.println(" PRI PRI");
     }
   

  

};