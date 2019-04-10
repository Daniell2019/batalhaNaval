
package batalhanaval;


public class Jogo {
    
    int[][] tabelaJogo;
    
    public Jogo(){
        this.tabelaJogo = new int[10][10];
    }
    
    
    
    public void mostarTabela(){
        for (int i = 0; i < this.tabelaJogo.length; i++) {
            for (int j = 0; j < this.tabelaJogo[i].length; j++) {
                System.out.print(this.tabelaJogo[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
    }

    public int[][] getTabelaJogo() {
        return tabelaJogo;
    }

    public void setTabelaJogo(int[][] tabelaJogo) {
        this.tabelaJogo = tabelaJogo;
    }
}
