package br.com.bozoapps.model;

public class Retangulo {
	public int width, height;

	public int areaTotal() {
		return width * height;
	}

	public boolean isQuadrado() {
		if (width == height)
			return true;
		return false;
	}
}