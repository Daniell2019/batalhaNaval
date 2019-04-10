
package batalhanaval;


public class Batalhanaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jogo j = new Jogo();
        Jogador1 jj = new Jogador1();
        j.mostarTabela();
        
        jj.criarSubmarino();
        System.out.println("");
        j.mostarTabela();
        
    }
    
}
