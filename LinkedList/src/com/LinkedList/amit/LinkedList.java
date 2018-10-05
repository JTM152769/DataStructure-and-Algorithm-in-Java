package com.LinkedList.amit;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> root;
	private int sizeCounter;

	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub
		++this.sizeCounter;
		if(root == null) {
			root = new Node<>(data);
		}else {
			insertAtBeginning(data);
		}
	}
	
	//o(1) constant time complexity, update the references
	private  void insertAtBeginning(T data) {
		Node<T> newNode = new Node<> (data);
		newNode.setNext(root);
		this.root = newNode;
	}
	
	//O(N) time complexity for inserting at end
	private void insertAtEnd(T data, Node<T> node) {
		
		if (node.getNext() != null) {
			insertAtEnd(data, node.getNext());
		}else {
			Node <T> newNode = new Node<> (data);
			node.setNext(newNode);
		}
	}

	@Override
    public void remove(T data) {

        if (this.root == null) {
            return;
        }

        --this.sizeCounter;

        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNext();
        } else {
            remove(data, root, root.getNext());
        }
    }

    @Override
    public void traverseList() {

        if (this.root == null) {
            return;
        }

        Node<T> node = this.root;

        while (node != null) {
            System.out.print(node + " ");
            node = node.getNext();
        }
    }
	
    private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {

        while (actualNode != null) {

            if (actualNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNext(actualNode.getNext());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNext();
        }
    }

	@Override
	public int size() {
		return this.sizeCounter;
	}
	
	

}
