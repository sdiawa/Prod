package uvhc.istv.scrabble;

import java.util.ArrayList;

public class Sac {

	public ArrayList<Lettre> sac;

	public Sac(ArrayList<Lettre> sac) {
		this.sac = sac;
	}
	
	
	public void generer2(Lettre l,int n){
	for(int i=0;i<n;i++)
		this.add(l);
	}
	
	public ArrayList<Lettre> generer(){
		
		ArrayList<Lettre> sac = new ArrayList<Lettre>();
		sac.generer2(Lettre.A,9);
		sac.generer2(B,2);
		sac.generer2(C,2);
		sac.generer2(D,3);
		sac.generer2(E,15);
		sac.generer2(F,2);
		sac.generer2(G,2);
		sac.generer2(H,2);
		sac.generer2(I,8);
		sac.generer2(J,1);
		sac.generer2(K,1);
		sac.generer2(L,5);
		sac.generer2(M,3);
		sac.generer2(N,6);
		sac.generer2(O,6);
		sac.generer2(P,2);
		sac.generer2(Q,1);
		sac.generer2(R,6);
		sac.generer2(S,6);
		sac.generer2(T,6);
		sac.generer2(U,6);
		sac.generer2(V,2);
		sac.generer2(W,1);
		sac.generer2(X,1);
		sac.generer2(Y,1);
		sac.generer2(Z,1);
		sac.generer2(JOKER,2);
		return sac;
	}
	
	public ArrayList<Lettre> melanger(ArrayList<Lettre> sac){
		
		ArrayList<Lettre> nouvelle = new ArrayList();
		Collections.shuffle(nouvelle);
		return nouvelle;
			
	}
	
	
}
