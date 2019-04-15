package batalhanaval;

import java.util.Scanner;

public class Batalhanaval {

   
    public static void main(String[] args) {
        
        Computador pc = new Computador();
        pc.criarportaAviao(0, 1);
        pc.criarnavioTanque(1, 0);
        pc.criarContratorpedeiro();
        pc.criarSubmarino();
        //pc.mostrarTabela();
        
        System.out.println("=*=*=*=* Inicio do jogo batalha naval *=*=*=*=");
        System.out.println("Criando jogador");
        System.out.println("Sua tabela");
        while (true) {febvjehfbvhfbvhf
        Jogador guilherme = new Jogador();
        guilherme.criarportaAviao(0, 1);
        guilherme.criarnavioTanque(1, 0);
        guilherme.criarContratorpedeiro();
        guilherme.criarSubmarino();
        guilherme.mostrarTabela();
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("deseja refazer tabela: ");
        String resp = teclado.nextLine();
            if (resp.equals("nao")) {
                System.out.println("tebela construida");
                pc.percorrerTabela(3, 4);
                break;
               
            }
            
        }
        
        
    }
}
