package com.greatlearning.services;
import java.util.*;
import com.greatlearning.driver.driver.*;


public class pathTraversal {
   //Function to find longest path
	public static ArrayList<Integer> longestPath(node root){
		
		// If root is null means there is no binary tree so
	    // return a empty vector
		if(root == null) {			
			ArrayList<Integer> output = new ArrayList<Integer>();
			return output;
		}
		
		//Recursive call root.right
		ArrayList<Integer> right = longestPath(root.right);
		
		//Recursive call root.left
		ArrayList<Integer> left = longestPath(root.left);
		
		//compare the size of two Array and insert current node accordingly.
		
		if (right.size()< left.size()) {
			
			left.add(root.data);
			return left;
		}
		else {
			right.add(root.data);
			return right;
		}
		
	}

//Function to create a node

public static node newNode(int data) {
	
	node temp = new node();
	
	temp.data = data;
	temp.left = null;
	temp.right = null;
	
	return temp;
	
}

public static void longestListPrint (ArrayList<Integer> output){
	int n = output.size();
    System.out.print("Longest Path is :- ");
    System.out.print(output.get(n - 1));
    for(int i = n - 2; i >= 0; i--)
    {
        System.out.print(" -> " + output.get(i));
    }
	
}
	
}