package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import echec.Couleur;
import echec.Pion;
import echec.Piece;
import echec.Position;
import java.util.List;
class TestPion {

	@Test
	void test() {
		int x=4;
		int y=5;
		Piece p=new Pion (x,y,Couleur.BLACK);
		assertEquals(p.getCouleur(),Couleur.BLACK);
		List<Position> pos=p.getMouvementPossible();
		assertTrue(pos.size()==2);
		Position ptest=new Position(x,y-2);
		System.out.println(pos);
		assertTrue(pos.get(1).equals(ptest));
		ptest.setPosition(x, y);
		assertTrue(p.getPosition().equals(ptest));
		assertTrue(p.getMouvementPossible().containsAll(p.getMouvementExecutable()));
	}

}
