package uvhc.istv.scrabble;

import java.util.ArrayList;

/**
 * @author Tristan Duwiquet
 */
public class Joueur {
    private String nom;
    private int score;
    private ArrayList<String> chevalet;

    public Joueur(String nom, int score, ArrayList<String> chevalet) {
        this.nom = nom;
        this.score = score;
        this.chevalet = chevalet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<String> getChevalet() {
        return chevalet;
    }

    public void setChevalet(ArrayList<String> chevalet) {
        this.chevalet = chevalet;
    }
}
