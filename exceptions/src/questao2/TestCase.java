package questao2;

import static org.junit.Assert.*;

import org.junit.Test;

import questoes13e5.ContaCorrente;
import questoes13e5.SaldoInsuficienteException;
import questoes13e5.ValorErradoException;

public class TestCase {

	@Test
	public void test1() {
		ContaCorrente c = new ContaCorrente(50);
		try {
			c.sacar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} catch (ValorErradoException e) {
			e.printStackTrace();
		}
		System.out.println(c.getSaldo());
		assertEquals(c.getSaldo(), 30);
	}
	
	@Test
	public void test2() {
		ContaCorrente c = new ContaCorrente(100);
		try {
			c.sacar(200);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} catch (ValorErradoException e) {
			e.printStackTrace();
		}
		System.out.println(c.getSaldo());
		assertTrue(c.getSaldo() == 0);
	}
	
	@Test
	public void test3() {
		ContaCorrente c = new ContaCorrente(50);
		try {
			c.depositar(50);
		} catch (ValorErradoException e) {
			e.printStackTrace();
		}
		System.out.println(c.getSaldo());
		assertEquals(c.getSaldo(), 100);
	}
	
	@Test
	public void test4() {
		ContaCorrente c = new ContaCorrente(50);
		try {
			c.sacar(100);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} catch (ValorErradoException e) {
			e.printStackTrace();
		}
		System.out.println(c.getValorLimite());
		assertEquals(c.getValorLimite(), 50);
	}
	
	@Test
	public void test5() {
		ContaCorrente c = new ContaCorrente(100);
		try {
			c.sacar(150);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} catch (ValorErradoException e) {
			e.printStackTrace();
		}
		System.out.println(c.getSaldo());
		assertTrue(c.getValorLimite() == 50);
	}
	
	@Test
	public void test6(){
		ContaCorrente c = new ContaCorrente(1);
		Throwable etemp = null;
		try {
			c.sacar(100);
		} catch (SaldoInsuficienteException e) {
			e.getMessage();
			etemp = e;
		} catch (ValorErradoException e) {
			e.printStackTrace();
		}
		assertTrue(etemp instanceof SaldoInsuficienteException);
	}

	
	@Test
	public void test7() {
		ContaCorrente c = new ContaCorrente(1);
		Throwable etemp = null;
		try {
			c.sacar(-50);
		} catch (SaldoInsuficienteException e) {
			etemp = e;
		} catch (ValorErradoException e) {
			etemp = e;
		}
		assertTrue(etemp instanceof ValorErradoException);
	}
	@Test
	public void test8() {
		ContaCorrente c = new ContaCorrente(100);
		Throwable etemp = null;
		try {
			c.sacar(-50);
		} catch (SaldoInsuficienteException e) {
			etemp = e;
		} catch (ValorErradoException e) {
			etemp = e;
		}
		assertFalse(etemp instanceof SaldoInsuficienteException);
	}
	@Test
	public void test9() {
		ContaCorrente c = new ContaCorrente(0);
		Throwable etemp = null;
		try {
			c.sacar(0);
		} catch (SaldoInsuficienteException e) {
			etemp = e;
		} catch (ValorErradoException e) {
			etemp = e;
		}
		assertFalse(etemp instanceof SaldoInsuficienteException);
	}
	@Test
	public void test10() {
		ContaCorrente c = new ContaCorrente(0);
		Throwable etemp = null;
		try {
			c.sacar(0);
		} catch (SaldoInsuficienteException e) {
			etemp = e;
		} catch (ValorErradoException e) {
			etemp = e;
		}
		assertFalse(etemp instanceof ValorErradoException);
	}
}
