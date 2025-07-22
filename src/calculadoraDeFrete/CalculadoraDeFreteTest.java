package calculadoraDeFrete;

import static org.junit.Assert.assertThrows;

//configuração

import junit.framework.TestCase;

public class CalculadoraDeFreteTest extends TestCase{
	
	
	public void testcalcularfrete() {
		CalculadoraDeFrete cdf = new CalculadoraDeFrete();
//		// cenário de teste 1
		assertTrue(cdf.calcularFrete(100.1, 0) == 0); //1
		assertTrue(cdf.calcularFrete(100.1, 1) == 0);//2
		assertTrue(cdf.calcularFrete(100.0001, 0) == 0);//3
		assertTrue(cdf.calcularFrete(100.0001, 1) == 0);//4
		assertTrue(cdf.calcularFrete(20000000, 2000000000) == 0);//5
		assertTrue(cdf.calcularFrete(20000000, 0000000.1) == 0);//6
		assertTrue(cdf.calcularFrete(200,200) == 0);//7
		assertTrue(cdf.calcularFrete(200.75,200) == 0);//8
		assertTrue(cdf.calcularFrete(200.33,33) == 0);//9
		assertTrue(cdf.calcularFrete(222,11) == 0);// 10
//		
//		// cenário de teste 2
		assertTrue(cdf.calcularFrete(70,0) == 5.0);// 1
		assertTrue(cdf.calcularFrete(70,1) == 5.25);// 2
		assertFalse(cdf.calcularFrete(70,0.0005) == 5.0); // 3
		assertTrue(cdf.calcularFrete(100,20) == 10);// 4 
		assertTrue(cdf.calcularFrete(76, 76) == 24); // 5
		assertTrue(cdf.calcularFrete(86, 99999)==25004.75); //6
		assertTrue(cdf.calcularFrete(86.5, 86.5)==26.625); //7
		assertTrue(cdf.calcularFrete(86, 86)==26.5); //8
		assertTrue(cdf.calcularFrete(77.7, 7)==6.75); //9
		assertTrue(cdf.calcularFrete(99, 8888)==2227); //10
//		
//		// cenário de teste 3
		assertTrue(cdf.calcularFrete(60, 0)==10); //1
		assertTrue(cdf.calcularFrete(69.99, 0)==10); //2
		assertTrue(cdf.calcularFrete(69.99, 1) > 10); //3
		assertTrue(cdf.calcularFrete(1, 300) == 160); //4
		assertTrue(cdf.calcularFrete(1, 1) == 10.5); //5
		assertTrue(cdf.calcularFrete(65, 999) == 509.5); //6
		assertTrue(cdf.calcularFrete(0.00001, 0.00001) == 10.000005); //7
		assertTrue(cdf.calcularFrete(65.5, 5) == 12.5); //8
		assertTrue(cdf.calcularFrete(33, 333) == 176.5);//9
		assertTrue(cdf.calcularFrete(2.1, 2.1) == 11.05);//10
//		
//		
//		//cenário de testes 4
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(0, 10);}); //1
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(0, 0);}); //2
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-1, 10);});//3
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-99.99, 10);});//4
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-0000.1, 10);});//5
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-99999, 555559);}); //6
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-99999, 99999);}); //7
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-952999.9, 952999.9);}); //8
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-9.66, 66);}); //9
		assertThrows(ValorCompraException.class, () -> { cdf.calcularFrete(-999, 555);}); //10
		
		//cenário de teste 5
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(200, -1);}); //1
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(50, -0.0001);}); //2
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(50.5, -0.0001);}); //3
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(50, -50);}); //4
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(50, -222);}); //5
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(222, -50);}); //6
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(9999, -50.2);}); //7
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(25, -50.25);}); //8
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(99999, -99999);}); //9
		assertThrows(DistanciaException.class, () -> { cdf.calcularFrete(99999, -0.0000001);}); //10
		
		
		
		 	
		
		
	}


}
