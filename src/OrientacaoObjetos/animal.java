package orientacaoObjetos;

public class animal {
  
 protected String nome;
 protected String cor;
 protected int altura;
 protected double peso;
 protected String estadoDoEspirito;
    
  public animal(String nome, String cor, double peso) {
    this.nome = nome;
    this.cor = cor;
    this.peso = peso;
}
public void comer() {

 }
 public void dormir() {

 }
  public void soar (){
     System.out.println("PIU PIU");
 }

 
}
