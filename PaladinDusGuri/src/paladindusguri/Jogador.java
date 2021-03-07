/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paladindusguri;

public class Jogador {

    public String nome;
    public String role;
    public String nomeGamer = "";

    public Jogador(String nome, String role) {
        this.nome = nome;
        this.role = role;
    }

    public Jogador(String nome, String role, String nomeGamer) {
        this.nome = nome;
        this.role = role;
        this.nomeGamer = "";
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nRole: " + this.role + "\n\n";
    }
}
