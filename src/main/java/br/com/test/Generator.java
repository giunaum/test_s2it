package br.com.test;

import java.math.BigInteger;

/**
 * Classe para implementação da questão 8.
 */
public class Generator {

	private static final int MAX = 1000000;

	private Generator() {
		throw new IllegalStateException("Classe contém somente métodos estáticos.");
	}

	public static Integer generateC(int a, int b) {
		char[] arrayA = Integer.toString(a).toCharArray();
		char[] arrayB = Integer.toString(b).toCharArray();

		int size = arrayA.length >= arrayB.length ? arrayA.length : arrayB.length;

		StringBuilder builderC = new StringBuilder();

		for (int i = BigInteger.ZERO.intValue(); i < size; i++) {
			if (arrayA.length > i) {
				builderC.append(arrayA[i]);
			}

			if (arrayB.length > i) {
				builderC.append(arrayB[i]);
			}
		}

		int c = Integer.parseInt(builderC.toString());

		return c > MAX ? -BigInteger.ONE.intValue() : c;
	}
}