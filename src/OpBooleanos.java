public class OpBooleanos { 
    // operadores logicos 
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia  = fimDeSemana && fazendoSol;
        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // true && true =  false
        // true && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false 

        System.out.println(vamosAPraia);
        
        // Operador ternario 
        // Ternario é pq tem 3 termos 
        // O primeiro é o termo que esta sendo avaliado por isso o ponto de ? (fimDeSemana)
        // O segundo é o termo que é : esta avaliando se o primeiro é verdade  (é fim de semana) true
        // O terceiro é o termo caso seja false (Náo é fim de semana) true

        String mensagem = fimDeSemana ? "e fim de semana" : "nao e fim de semana";


        System.out.println(mensagem);
        // Tipos booleanos que armazena o valores logicos 
        // Operadores Logicos que sáo (AND) é (OR) 
        // Que sao representados pelo duplo (&&) é (||)
        
        // Operador Ternario 
        // O primeiro é o termo que esta sendo avaliado por isso o ponto de ? (fimDeSemana)
        // O segundo é o termo que é : esta avaliando se o primeiro é verdade  (é fim de semana) true
        // O terceiro é o termo caso seja false (Náo é fim de semana) true
        
        
    } 
}
