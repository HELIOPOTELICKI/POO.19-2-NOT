import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DataAgendaTestMarcel {
	private static int nota = 0;

	// cada método de teste pode durar no máximo 1 segundo
	@Rule
    public Timeout globalTimeout = Timeout.seconds(1);
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Nota = " + nota);
	}

	@Test
	public void testMediaCompromisso01() {
		LocalDate ld = LocalDate.of(2019, 5, 18);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(8, 0);
		Compromisso c = new Compromisso(lt, "Missa", 120, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(12, 0);
		c = new Compromisso(lt, "Almoço", 90, 'N');
		da.addCompromisso(c);

		lt = LocalTime.of(18, 30);
		c = new Compromisso(lt, "Cinema", 100, 'A');
		da.addCompromisso(c);

		int mediaCalculada = da.getTempoMedio();

		assertEquals(103, mediaCalculada);
		nota = nota + 5;
	}

	@Test
	public void testMediaCompromisso02() {
		LocalDate ld = LocalDate.of(2019, 5, 20);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(14, 0);
		Compromisso c = new Compromisso(lt, "Teste de sistema", 90, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(17, 30);
		c = new Compromisso(lt, "Visita", 30, 'B');
		da.addCompromisso(c);

		int mediaCalculada = da.getTempoMedio();

		assertEquals(60, mediaCalculada);
		nota = nota + 5;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAdicionarMesmaData() {
		Agenda agenda = new Agenda();

		LocalDate ld = LocalDate.of(2019, 5, 20);
		DataAgenda da1 = new DataAgenda();
		da1.setData(ld);

		ld = LocalDate.of(2019, 5, 20);
		DataAgenda da2 = new DataAgenda();
		da2.setData(ld);

		agenda.addDataAgenda(da1);
		nota = nota + 10;
		agenda.addDataAgenda(da2);
		nota = nota - 10; // se chegou aqui é porque não gerou exceção 
	}

	@Test
	public void testAdicionarDatasDiferentes() {
		Agenda agenda = new Agenda();

		LocalDate ld = LocalDate.of(2019, 9, 20);
		DataAgenda da1 = new DataAgenda();
		da1.setData(ld);

		ld = LocalDate.of(2019, 5, 20);
		DataAgenda da2 = new DataAgenda();
		da2.setData(ld);

		agenda.addDataAgenda(da1);
		agenda.addDataAgenda(da2);
		nota = nota + 2;
		// não verifico se ficou guardado em Agenda pois não defini no modelo um método
		// para retornar uma DataAgenda
	}

	@Test
	public void testQuantidadeCompromisso01() {
		LocalDate ld = LocalDate.of(2019, 5, 18);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(8, 0);
		Compromisso c = new Compromisso(lt, "Missa", 120, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(12, 0);
		c = new Compromisso(lt, "Almoço", 90, 'N');
		da.addCompromisso(c);

		lt = LocalTime.of(18, 30);
		c = new Compromisso(lt, "Cinema", 100, 'A');
		da.addCompromisso(c);

		assertEquals(2, da.getQtdCompromissosPrioridade('A'));
		nota = nota + 4;
	}

	@Test
	public void testQuantidadeCompromisso02() {
		LocalDate ld = LocalDate.of(2019, 5, 18);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(8, 0);
		Compromisso c = new Compromisso(lt, "Missa", 120, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(12, 0);
		c = new Compromisso(lt, "Almoço", 90, 'N');
		da.addCompromisso(c);

		lt = LocalTime.of(18, 30);
		c = new Compromisso(lt, "Cinema", 100, 'A');
		da.addCompromisso(c);

		assertEquals(0, da.getQtdCompromissosPrioridade('B'));
		nota = nota + 4;
	}

	@Test
	public void testBuscarCompromisso01() {
		LocalDate ld = LocalDate.of(2019, 5, 18);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(8, 0);
		Compromisso c = new Compromisso(lt, "Missa", 120, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(12, 0);
		c = new Compromisso(lt, "Almoço", 90, 'N');
		da.addCompromisso(c);

		lt = LocalTime.of(18, 30);
		c = new Compromisso(lt, "Cinema", 100, 'A');
		da.addCompromisso(c);

		ArrayList retorno = da.getCompromissosPrioridade('A');
		assertEquals(2, retorno.size());
		nota = nota + 6;
	}

	@Test
	public void testBuscarCompromisso02() {
		LocalDate ld = LocalDate.of(2019, 5, 18);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(8, 0);
		Compromisso c = new Compromisso(lt, "Missa", 120, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(12, 0);
		c = new Compromisso(lt, "Almoço", 90, 'N');
		da.addCompromisso(c);

		lt = LocalTime.of(18, 30);
		c = new Compromisso(lt, "Cinema", 100, 'A');
		da.addCompromisso(c);

		ArrayList retorno = da.getCompromissosPrioridade('B');
		assertEquals(0, retorno.size());
		nota = nota + 6;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddCompromissoMesmaHora() {
		LocalDate ld = LocalDate.of(2019, 5, 20);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(14, 0);
		Compromisso c = new Compromisso(lt, "Teste de sistema", 90, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(14, 0);
		c = new Compromisso(lt, "Visita", 30, 'B');
		nota = nota + 10;
		da.addCompromisso(c);
		nota = nota - 10; // se chegou aqui é porque não gerou exceção 
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPrioridadeInvalida() {
		LocalTime lt = LocalTime.of(14, 0);
		nota = nota + 3;
		Compromisso c = new Compromisso(lt, "Teste de sistema", 90, 'X');
		nota = nota - 3; // se chegou aqui é porque não gerou exceção 
	}

	@Test
	public void testMenorCompromisso01() {
		Agenda agenda = new Agenda();
		Compromisso menor;

		// primeiro dia com seus compromissos
		LocalDate ld = LocalDate.of(2019, 5, 18);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(8, 0);
		Compromisso c = new Compromisso(lt, "Missa", 120, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(12, 0);
		c = new Compromisso(lt, "Almoço", 90, 'N');
		da.addCompromisso(c);

		lt = LocalTime.of(18, 30);
		c = new Compromisso(lt, "Cinema", 100, 'A');
		da.addCompromisso(c);

		agenda.addDataAgenda(da);

		// segundo dia com seus compromissos e o menor
		ld = LocalDate.of(2019, 5, 20);
		da = new DataAgenda();
		da.setData(ld);

		lt = LocalTime.of(17, 30);
		c = new Compromisso(lt, "Visita", 30, 'B');
		da.addCompromisso(c);
		menor = c;

		lt = LocalTime.of(14, 0);
		c = new Compromisso(lt, "Teste de sistema", 90, 'A');
		da.addCompromisso(c);

		agenda.addDataAgenda(da);

		c = agenda.getMenorCompromisso();

		assertSame(menor, c);
		nota = nota + 10;  
	}

	@Test
	public void testMenorCompromisso02() {
		Agenda agenda = new Agenda();
		Compromisso menor;

		// primeiro dia com seus compromissos e o menor
		LocalDate ld = LocalDate.of(2019, 5, 20);
		DataAgenda da = new DataAgenda();
		da.setData(ld);

		LocalTime lt = LocalTime.of(17, 30);
		Compromisso c = new Compromisso(lt, "Visita", 30, 'B');
		da.addCompromisso(c);
		menor = c;

		lt = LocalTime.of(14, 0);
		c = new Compromisso(lt, "Teste de sistema", 90, 'A');
		da.addCompromisso(c);

		agenda.addDataAgenda(da);

		// segundo dia com seus compromissos
		ld = LocalDate.of(2019, 5, 18);
		da = new DataAgenda();
		da.setData(ld);

		lt = LocalTime.of(8, 0);
		c = new Compromisso(lt, "Missa", 120, 'A');
		da.addCompromisso(c);

		lt = LocalTime.of(12, 0);
		c = new Compromisso(lt, "Almoço", 90, 'N');
		da.addCompromisso(c);

		lt = LocalTime.of(18, 30);
		c = new Compromisso(lt, "Cinema", 100, 'A');
		da.addCompromisso(c);

		agenda.addDataAgenda(da);

		c = agenda.getMenorCompromisso();

		assertSame(menor, c);
		nota = nota + 10; 
	}
}
