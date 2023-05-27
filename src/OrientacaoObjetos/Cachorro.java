package orientacaoObjetos;
// atributos
public class Cachorro {
  private String nome; 
  private String cor;
  private int altura;
  private double peso;
  private int tamanhoDoRabo;
  private String estadoDoEspirito;

   // construtures
   public Cachorro(){}
   
 public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo) {
  this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.tamanhoDoRabo = tamanhoDoRabo;
    this.estadoDoEspirito = "";
    
  }   
  
  
  
   // metodos 
  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }


  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }


  public int getAltura() {
    return altura;
  }
  public void setAltura(int altura) {
    this.altura = altura;

  }
  public double getPeso() {
    return peso;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getTamanhoDoRabo() {
    return tamanhoDoRabo;
  }
  public void setTamanhoDoRabo(int tamanhoDoRabo) {
    this.tamanhoDoRabo = tamanhoDoRabo;
  }

  public String getEstadoDoEspirito() {
    return estadoDoEspirito;
  }
  public void setEstadoDoEspirito(String estadoDoEspirito) {
    this.estadoDoEspirito = estadoDoEspirito;
    
  }
  public void comer(){

  }
  public void latir(){
    System.out.println("au au" );
  }
  public String pegar() { 
    return "Bolinha";
  }
  
  public String interagir(String acao) {

    switch (acao) {
      case "carinho": this.estadoDoEspirito = "Feliz"; break;
      case "Vai dormir!": this.estadoDoEspirito = "Bravo"; break;
      case "pisar na patinha": this.estadoDoEspirito = "triste"; break;
      case "nada": this.estadoDoEspirito = "neutro";  break;

    }
    return estadoDoEspirito;
    // if (acao.equals("carinho")){
    //    this.estadoDoEspirito = "Feliz";
    //   } else if(acao.equals("Vai dormir!")) {
    //     this.estadoDoEspirito = "Bravo";
    //   }else {
    //     this.estadoDoEspirito = "neutro";
    //   }
      // return estadoDoEspirito; 
  }
}
