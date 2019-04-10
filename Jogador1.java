
package batalhanaval;

import java.util.Objects;

/**
 *
 * @author guilherme
 */
public class Jogador1<T> extends Jogo{
    private String nome;
    
    int[] submarino;
    
    
    public void criarSubmarino(){
        this.submarino = new int[2];
        this.submarino[0] = 2;
        this.submarino[1] = 2;
        
        for (int i = 0; i < this.tabelaJogo.length; i ++) {
            for (int j = 0; j < this.tabelaJogo.length; j++) {
                this.tabelaJogo[0][0] = this.submarino[i];
                this.tabelaJogo[0][1] = this.submarino[i];
            }
        }
    }
    
    
    
    
}
