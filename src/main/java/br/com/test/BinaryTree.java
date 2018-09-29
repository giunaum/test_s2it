package br.com.test;

public class BinaryTree {

	private int valor;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree() {
	}

	public BinaryTree(int valor) {
		this.valor = valor;
	}

	public BinaryTree(BinaryTree left, BinaryTree right) {
		this.left = left;
		this.right = right;
	}

	public BinaryTree(int valor, BinaryTree left, BinaryTree right) {
		this.valor = valor;
		this.left = left;
		this.right = right;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
}