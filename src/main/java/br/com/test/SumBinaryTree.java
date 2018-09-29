package br.com.test;

import java.math.BigInteger;

/**
 * Classe para implementação da questão 9.
 */
public class SumBinaryTree {

	private SumBinaryTree() {
		throw new IllegalStateException("Classe contém somente métodos estáticos.");
	}

	public static int sum(BinaryTree binaryTree) {
		return binaryTree == null ? BigInteger.ZERO.intValue()
				: binaryTree.getValor() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
	}
}
