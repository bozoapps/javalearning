package br.com.bozoapps.application;

import br.com.bozoapps.model.*;

public class Main {

	public static void main(String[] args) {
		
		//eoq
		Resultados res = new Resultados();
		Calculo cal = new Calculo();
		Retangulo quadrado = new Retangulo();
		Fish f = new Fish();
		
	
		f.setName("Fizz");
		System.out.println("Enquanto "+ f.swim() + " ele tamb�m consegue fazer c�lculos, esse peixe � brabo!");
		
		
	//  string resultado soma + calculo/soma
			res.Soma();
			cal.soma(5, 25);
			
			//  string resultado subtra��o + calculo/sub
			res.Sub();
			cal.sub(1, 2);
			
			//   definindo altura/largura + string resultado area total/� quadrado booleano.
			quadrado.width = 50;
			quadrado.height = 10;
			res.Area();
			System.out.println(quadrado.areaTotal());
			res.Quad();
			System.out.println(quadrado.isQuadrado());
	}

}
