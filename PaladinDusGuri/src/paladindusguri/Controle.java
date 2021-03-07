package paladindusguri;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Controle {

    public int numJogadores = 8; // Número de jogadores por euipe
    public ArrayList<Equipe> equipes = new ArrayList<>();
    public ArrayList<Jogador> jogadoresAtuais = new ArrayList<>();
    Random rand = new Random();

    public Controle() {
        Equipe eq1 = new Equipe();
        Equipe eq2 = new Equipe();
        equipes.add(eq1);
        equipes.add(eq2);
        for (int i = 0; i < numJogadores; i++) {
            jogadoresAtuais.add(new Jogador("Samuel " + String.valueOf(i)));
        }
        Jogador player2 = new Jogador("Samuel");
        Jogador player3 = new Jogador("Samuel");
        Jogador player4 = new Jogador("Samuel");

        for (int i = 0; i < numJogadores; i++) {
            int var = rand.nextInt(equipes.size());

            if (equipes.get(0).jogadoresAtuais.size() == numJogadores/2) {
                equipes.get(1).jogadoresAtuais.add(jogadoresAtuais.get(i));
            } 
            if(equipes.get(1).jogadoresAtuais.size() == numJogadores/2){
                equipes.get(0).jogadoresAtuais.add(jogadoresAtuais.get(i));
            }
            if(equipes.get(1).jogadoresAtuais.size() != numJogadores/2 && equipes.get(0).jogadoresAtuais.size() != numJogadores/2){
             equipes.get(var).jogadoresAtuais.add(jogadoresAtuais.get(i));
            }
        }
        /* 
        Jogador player1 = new Jogador("Samuel");
        eq1.adicionaEquipe(player1);
        Jogador player2 = new Jogador("Samuel");
        eq1.adicionaEquipe(player2);
        Jogador player3 = new Jogador("Samuel");
        eq1.adicionaEquipe(player3);
        Jogador player4 = new Jogador("Samuel");
        eq1.adicionaEquipe(player4);
        equipes.add(eq1);
        Jogador player5 = new Jogador("Samuel");
        eq2.adicionaEquipe(player5);
        Jogador player6 = new Jogador("Samuel");
        eq2.adicionaEquipe(player6);
        Jogador player7 = new Jogador("Samuel");
        eq2.adicionaEquipe(player7);
        Jogador player8 = new Jogador("Samuel");
        eq2.adicionaEquipe(player8);
        equipes.add(eq2);
         */
        adicionaRolesValidas();
    }

    private void adicionaRolesValidas() {
        ArrayList<String> copiaRoles = new ArrayList<>(Arrays.asList("Curandeiro", "Dano", "Tanque", "Flanco"));
        if (equipes.get(0).jogadoresAtuais.size() == 4 || equipes.get(1).jogadoresAtuais.size() == 4) {
            for (int j = 0; j < equipes.size(); j++) {
                for (int i = 0; i < equipes.get(j).jogadoresAtuais.size(); i++) {
                    int roleAle = rand.nextInt(copiaRoles.size());
                    equipes.get(j).jogadoresAtuais.get(i).role = copiaRoles.get(roleAle);
                    copiaRoles.remove(roleAle);
                }
                copiaRoles = new ArrayList<>(Arrays.asList("Curandeiro", "Dano", "Tanque", "Flanco"));
            }
        }
        copiaRoles = new ArrayList<>(Arrays.asList("Curandeiro", "Dano", "Tanque", "Flanco"));
        if (equipes.get(0).jogadoresAtuais.size() == 5 || equipes.get(1).jogadoresAtuais.size() == 5) {
            for (int j = 0; j < equipes.size(); j++) {
                int contaTank = 0;
                for (int i = 0; i < equipes.get(j).jogadoresAtuais.size(); i++) {

                    int roleAle = rand.nextInt(copiaRoles.size());
                    equipes.get(j).jogadoresAtuais.get(i).role = copiaRoles.get(roleAle);
                    if (copiaRoles.get(roleAle) == "Tanque" && contaTank == 0) {
                        contaTank++;
                    } else {
                        copiaRoles.remove(roleAle);
                    }

                }
                copiaRoles = new ArrayList<>(Arrays.asList("Curandeiro", "Dano", "Tanque", "Flanco"));
            }
        }
    }

    @Override
    public String toString() {
        String retorno = "";

        for (int i = 0; i < equipes.size(); i++) {
            retorno += "Equipe " + String.valueOf(i + 1) + ": \n" + equipes.get(i).toString() + "\n";
        }
        return retorno;
    }
}
