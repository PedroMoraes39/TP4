package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeProduto {
	Valida v = new Valida(); 
	@Test
	void test() {
		assertTrue(v.validaProduto("Arroz"));
	}

}
