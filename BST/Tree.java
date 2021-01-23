package com.sample.BST;

//Printing only Leaf nodes
//https://www.geeksforgeeks.org/print-all-leaf-nodes-of-a-binary-tree-from-right-to-left/

//https://www.codesdope.com/blog/article/binary-search-tree-in-java/

//https://www.softwaretestinghelp.com/binary-search-tree-in-java/
public class Tree {
	// mathod to search for an element in a tree
    public  Node search(int x, Node n){
        if (n==null || n.getData()==x) //if data of root is x then the element is found
            return n;
        else if(n.getData()>x) // x is greater, so we will search the right subtree
            return search(x, n.getLeftChild()); 
        else //x is smaller than the data, so we will search the left subtree
            return search(x, n.getRightChild());
    }

    //method to find the minimum value in a tree
    public  Node findMinimum(Node root){
        if(root==null)
            return null;
        else if(root.getLeftChild() != null) // node with minimum value will have no left child
            return findMinimum(root.getLeftChild()); // left most element will be minimum
        return root;
    }
    
    // method to insert a new node
    public  Node insert(Node root, int x){
        if (root == null)
            return new Node(x);// if node not found create a node with a value and return , it will set as child in the recursive fn stack
        else if(x>root.getData()) // x is greater. Should be inserted to right
            root.setRightChild(insert(root.getRightChild(),x));
        else // x is smaller should be inserted to left
            root.setLeftChild(insert(root.getLeftChild(),x));
        return root;
    }

    // method to delete a node
    public  Node delete(Node root, int x){
        //searching for the item to be deleted
        if(root==null)
            return null;
        if (x>root.getData())
            root.setRightChild(delete(root.getRightChild(), x));
        else if(x<root.getData())
            root.setLeftChild(delete(root.getLeftChild(), x));
        else
        {// Value found as ROOT
            //No Children
            if(root.getLeftChild()==null && root.getRightChild()==null)
            {
                root = null;// delete the node
                return null;
            }

            //One Child
            else if(root.getLeftChild()==null || root.getRightChild()==null)
            {
                Node temp;
                if(root.getLeftChild()==null)
                    temp = root.getRightChild();
                else
                    temp = root.getLeftChild();
                root = null;
                return temp;// set the orphan child node to the parent [ie set the child to parent of the deleted node in line 42/line 40]
            }

            //Two Child
            else
            {
                Node temp = findMinimum(root.getRightChild());//find the miniumum from the greater side of the tree
                root.setData(temp.getData());// replace the value with the root node value
                root.setRightChild(delete(root.getRightChild(), temp.getData()));
                /*
                20
              /    \
             /      \
            5       30
              \     /\
               \   /  \
               15 25   42[Previously 40]
             /           \
            /             \
           9              45
         /   \           /
        /     \         /
       7      12       42[Delete this node]
 */
                //delete the duplicate or copied data from the right treee of the root node
            }
        }
        return root;
    }

    //method for inorder
    public  void inorder(Node root){
        if(root!=null){ // checking if the root is not null
            inorder(root.getLeftChild()); // visiting left child
            System.out.print(" "+root.getData()+" "); // printing data at root
            inorder(root.getRightChild()); // visiting right child
        }
    }

}
