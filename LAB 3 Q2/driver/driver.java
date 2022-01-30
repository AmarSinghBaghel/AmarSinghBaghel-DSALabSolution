package com.greatlearning.driver;
import java.util.*;
import com.greatlearning.services.*;
public class driver {
     
	//declaring  class Node,in the same class as driver class
	public static class node {
		
		public node left;
		public node right;
		public int data;
	}
		
	public static void main(String[] args) {
		// calling function newNode to create nodes in a BST with hard code the inputs
        node root = pathTraversal.newNode(100);
        root.left = pathTraversal.newNode(20);
        root.right = pathTraversal.newNode(130);
        root.left.right = pathTraversal.newNode(10);
        root.left.left = pathTraversal.newNode(50);
        root.left.right.left = pathTraversal.newNode(5);     
        root.right.left = pathTraversal.newNode(110);
        root.right.right= pathTraversal.newNode(140);
		        
        //Calling function to find longest path in BST
        ArrayList<Integer> output = pathTraversal.longestPath(root);
        
        //Calling Printing Longest Path function
        pathTraversal.longestListPrint(output);
      
	}


}
