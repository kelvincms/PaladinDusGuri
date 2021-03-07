package paladindusguri;

import java.util.ArrayList;

public class Equipe {

    public ArrayList<Jogador> jogadoresAtuais;
    public String nomeEquipe = "";

    public Equipe() {
        this.jogadoresAtuais = new ArrayList<Jogador>();
    }

    public Equipe(ArrayList<Jogador> jogadoresAtuais, String nomeEquipe) {
        this.jogadoresAtuais = jogadoresAtuais;
        this.nomeEquipe = nomeEquipe;
    }

    public Equipe(Jogador player1, Jogador player2, Jogador player3, Jogador player4, String nomeEquipe) {
        jogadoresAtuais.add(player1);
        jogadoresAtuais.add(player2);
        jogadoresAtuais.add(player3);
        jogadoresAtuais.add(player4);
    }

    public Equipe(ArrayList<Jogador> jogadoresAtuais) {
        this.jogadoresAtuais = jogadoresAtuais;
        // this.nomeEquipe = nomeEquipe;
    }

    public Equipe(Jogador player1, Jogador player2, Jogador player3, Jogador player4) {
        jogadoresAtuais.add(player1);
        jogadoresAtuais.add(player2);
        jogadoresAtuais.add(player3);
        jogadoresAtuais.add(player4);
    }

    public void adicionaEquipe(Jogador atual) {
        jogadoresAtuais.add(atual);
    }

    @Override
    public String toString() {
        String retorno;
        retorno = this.nomeEquipe;
        for (int i = 0; i < jogadoresAtuais.size(); i++) {
            retorno += jogadoresAtuais.get(i).toString();
        }
        return retorno;

    }
}
