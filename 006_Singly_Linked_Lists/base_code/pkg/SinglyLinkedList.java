package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;

	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList() {

	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		Node temp = head;
		
		for(int i = 0; i < pos-1; ++1)
			temp = temp.getNext()
		
		return temp.getData();
	}

	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos, int data){
		Node temp = new Node(data);
		Node list = this.head;
		Node add = null;

		if(list != null)
			add = list.getNext();

		if(head == null)
			head = temp;
		else if(pos == 0)
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){

	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){

	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){
		Node temp = head;
		
	}

	//private int length(Node insert){
		
}
