package br.com.bozoapps.application;

import br.com.bozoapps.model.Fish;

public class Main {

	public static void main(String[] args) {
		
		Fish f = new Fish();

		f.setName("Fizz");

		System.out.println(f.swim());
	}

}
