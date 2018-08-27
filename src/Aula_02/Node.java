package Aula_02;

import org.omg.CORBA.portable.UnknownException;

public class Node {

	public static void main(String args[]) {
		JLinkedList lista = new JLinkedList();
		try {
			lista.insertFirst(new Node("D"));
			lista.insertFirst(new Node("A"));
			lista.insertFirst(new Node("B"));
			lista.insertLast(new Node("S"));
			lista.insertLast(new Node("C"));
			lista.removeFirst(); // pode lançar UnderflowException
			lista.removeLast(); // pode lançar UnderflowException
		} catch (UnknownException e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();
		}
		lista.print();
	}

	private String element;
	private Node next;

	public Node(String s, String n) {

		element = s;
		next = n;

	}

	public Node(String element) {

		this(element, null);

	}

	public String getElement() {

		return element;

	}

	public String getNext() {

		return next;

	}

	public void setElement(String newElem) {

		element = newElem;

	}

	public void setNext(String newNext) {

		next = newNext;

	}
	

}
