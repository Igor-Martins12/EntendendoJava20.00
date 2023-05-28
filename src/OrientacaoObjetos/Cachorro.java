package orientacaoObjetos;
// atributos
public class Cachorro extends animal {

  
  static int numerodeCachorro;
  
  private int tamanhoDoRabo;


   // construtures

   
 public Cachorro(String nome, String cor, int altura, double peso) {
  super(nome, cor, peso);
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.estadoDoEspirito = "";
    
    numerodeCachorro ++;
    
  }   
  
  
  
  // metodos 
 


public static int getNumerodeCachorro() {
    return numerodeCachorro;
  }

  public static void setNumerodeCachorro(int numerodeCachorro) {
    Cachorro.numerodeCachorro = numerodeCachorro;
  }

   
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

  @Override
  public String toString() {
    return "Cachorro [nome=" + nome +  "]";
  }



  @Override
  public void soar() {
   System.out.println("Au Au");
  }

}
