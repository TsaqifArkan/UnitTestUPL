package informatika;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CalculatorTest {

	private Calculator calculator;
	
	@BeforeEach
	public void setCalculatorDiAwal() {
		calculator = new Calculator();
	}
	
	@Test
	@DisplayName("Penjumlahan Bilangan Bulat Positif")
	void testTambahBilanganBulatPositif() {
//		fail("Not yet implemented");
		assertEquals(10, calculator.tambah(5, 5));
	}
	
	@Test
	@DisplayName("Penjumlahan Bilangan Bulat Negatif")
	void testTambahBilanganBulatNegatif() {
//		fail("Not yet implemented");
		assertEquals(-10, calculator.tambah(-5, -5));
	}

	@Test
//	@Disabled
	@DisplayName("Pembagian dengan nol")
	void testBagiDenganNol() {
//		fail("Not yet implemented");
//		assertEquals(Double.POSITIVE_INFINITY, calculator.bagi(10, 0));
		assertThrows(ArithmeticException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				calculator.bagi(10, 0);
				
			}
		});
	}

}
