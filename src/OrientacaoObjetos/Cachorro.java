package orientacaoObjetos;

public class Cachorro {
  public String nome; 
  public String cor;
  public int altura;
  public double peso;
  public int tamanhoDoRabo;


  public String estadoDoEspirito;


  public void comer(){

  }
  public void latir(){
    System.out.println("au au" );
  }
  public String pegar() { 
    return "Bolinha";
  }
  
  public String interagir(String acao) {
    if (acao.equals("carinho")){
       this.estadoDoEspirito = "Feliz";
      } else if(acao.equals("Vai dormir!")) {
        this.estadoDoEspirito = "Bravo";
      }else {
        this.estadoDoEspirito = "neutro";
      }
      return estadoDoEspirito; 
  }
}
