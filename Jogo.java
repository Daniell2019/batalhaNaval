package batalhanaval;

public class Jogo {
    
    String[][] tabelaJogo;
 
    public Jogo(){
        this.tabelaJogo = new String[10][10];
    }
    
    
    
    public void mostrarTabela(){
        for (int i = 0; i < this.tabelaJogo.length; i++) {
            for (int j = 0; j < this.tabelaJogo[i].length; j++) {
                System.out.print(this.tabelaJogo[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
