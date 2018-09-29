package br.com.test;

public class Main {

	public static void main(String[] args) {
		System.out.println(Generator.generateC(46, 578));

		BinaryTree node2R = new BinaryTree(6);
		BinaryTree node2L = new BinaryTree(1);
		BinaryTree node1R = new BinaryTree(4);
		BinaryTree node1L = new BinaryTree(3, node2L, node2R);
		BinaryTree root = new BinaryTree(2, node1L, node1R);
		System.out.println(SumBinaryTree.sum(root));
	}
}
