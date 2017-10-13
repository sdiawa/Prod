package uvhc.istv.scrabble;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Adrien Jablonski (@Flakkles)
 */

public class Sac {

	public ArrayList<Lettre> sac;

	public Sac() {
		ArrayList<Lettre> sac = new ArrayList<Lettre>();
	}

	public void generer2(Lettre l, int n) {
		for (int i = 0; i < n; i++)
			sac.add(l);
	}

	public void generer() {

		generer2(Lettre.A, 9);
		generer2(Lettre.B, 2);
		generer2(Lettre.C, 2);
		generer2(Lettre.D, 3);
		generer2(Lettre.E, 15);
		generer2(Lettre.F, 2);
		generer2(Lettre.G, 2);
		generer2(Lettre.H, 2);
		generer2(Lettre.I, 8);
		generer2(Lettre.J, 1);
		generer2(Lettre.K, 1);
		generer2(Lettre.L, 5);
		generer2(Lettre.M, 3);
		generer2(Lettre.N, 6);
		generer2(Lettre.O, 6);
		generer2(Lettre.P, 2);
		generer2(Lettre.Q, 1);
		generer2(Lettre.R, 6);
		generer2(Lettre.S, 6);
		generer2(Lettre.T, 6);
		generer2(Lettre.U, 6);
		generer2(Lettre.V, 2);
		generer2(Lettre.W, 1);
		generer2(Lettre.X, 1);
		generer2(Lettre.Y, 1);
		generer2(Lettre.Z, 1);
		generer2(Lettre.JOKER, 2);
	}

	public void melanger() {

		Collections.shuffle(sac);
	}

	public Lettre tirer() {
		Lettre lettre = sac.get(0);
		sac.remove(0);
		return lettre;
	}

}
