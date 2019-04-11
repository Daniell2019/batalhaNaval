package batalhanaval;
import java.util.Random;

public class Jogador extends Jogo{
    
    public Jogador() {
        for (int i = 0; i < this.tabelaJogo.length; i++) {
            for (int j = 0; j < this.tabelaJogo.length; j++) {
                this.tabelaJogo[i][j] = "~~";
            }
        }
    }
    public void criarportaAviao(int horizontal, int vertical){
        Random r = new Random();
        int posicao = r.nextInt(9);
           
        if (horizontal == 0 && vertical == 1){
            for (int i = 0; i < this.tabelaJogo.length; i++) {
                for (int j = 0; j < this.tabelaJogo.length; j++) {
                    if(this.tabelaJogo[i][j] == "~~") {
                        if (i <= 4){
                                this.tabelaJogo[i][posicao] = "PA";
                            }
                    }
                }
            }
        } else {
            for (int i = 0; i < this.tabelaJogo.length; i++) {
                for (int j = 0; j < this.tabelaJogo.length; j++) {
                    if(this.tabelaJogo[i][j] == "~~") {
                        if (j <= 4) {
                            this.tabelaJogo[posicao][j] = "PA";
                    }
                }
            }
        }
        }
    
    }
    public void criarnavioTanque(int horizontal, int vertical) {
        Random t = new Random();
        int posicaoTanque = t.nextInt(9);
        if (horizontal == 0 && vertical == 1){
            for (int i = 0; i < this.tabelaJogo.length; i++) {
                for (int j = 0; j < this.tabelaJogo.length; j++) {
                    if(i >= 6 && this.tabelaJogo[i][posicaoTanque] != "PA") {
                        if (i >= 6 ){
                                this.tabelaJogo[i][posicaoTanque] = "NT";
                            }
                    }
                }
            }
        } else {
            for (int i = 0; i < this.tabelaJogo.length; i++) {
                for (int j = 0; j < this.tabelaJogo.length; j++) {
                    if(j >= 6 && this.tabelaJogo[posicaoTanque][j] != "PA") {
                        if (j >= 6){
                                this.tabelaJogo[posicaoTanque][j] = "NT";
                            }
                    }
                }
            }
        }
    }
    
    public void criarContratorpedeiro(){
        Random p = new Random();
        int posicao = p.nextInt(9);
        int novaposicao = p.nextInt(9);
        while (novaposicao == posicao) {
            novaposicao = p.nextInt(9);
        }
        
        for (int i = 0; i < this.tabelaJogo.length; i++) {
            for (int j = 0; j < this.tabelaJogo.length; j++) {
                if (i >= 7 && this.tabelaJogo[i][posicao] == "~~") {
                    this.tabelaJogo[i][posicao] = "CT";
                    this.tabelaJogo[i][novaposicao] = "CT";
                }
            }
        }
    }
    
    public void criarSubmarino(){
        Random p = new Random();
        int posicao = p.nextInt(9);
        int novaposicao = p.nextInt(9);
        while (novaposicao == posicao) {
            novaposicao = p.nextInt(9);
        }
        for (int i = 0; i < this.tabelaJogo.length; i++) {
            for (int j = 0; j < this.tabelaJogo.length; j++) {
                if (i <= 1 && this.tabelaJogo[i][posicao] == "~~") {
                    this.tabelaJogo[i][posicao] = "SU";
                    this.tabelaJogo[i][novaposicao] = "SU";
                }
            }
        }
    }
}
