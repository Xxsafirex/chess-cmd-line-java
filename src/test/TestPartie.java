package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import echec.Partie;

class TestPartie {

	@Test
	void test() {	
		
		Partie p=new Partie("jean","paul");
		p.debutTour();
		assertEquals(p.getListeJoueurs().size(),2);
		assertEquals(p.getListeJoueurs().get(0).getNom(),"jean");
		
	}

}
