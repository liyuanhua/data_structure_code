/**
 * Created by liyuanhua on 16/3/31.
 */
public class BinaryTree {

    public static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

        public Node insert(Node node, int data){

            if(node == null){
                node = new Node(data);
            }

            else {
                if (data <= node.data) {
                    //System.out.println("insert");
                    node.leftChild = insert(node.leftChild, data);
                } else if (data > node.data) {
                    //System.out.println("insert");
                    node.rightChild = insert(node.rightChild, data);
                }
            }

            return node;
        }

        public void show(Node node){

            if(node == null){
                System.out.println("show null");
                return;
            }
            System.out.println(node.data);


        }

        public void preTravels(Node node){

            //System.out.println("start once..");

            if(node == null){
                ///System.out.println("root is null");
                return ;
            }
            else{
                show(node);     //root node data first
                preTravels(node.leftChild);
                preTravels(node.rightChild);

            }

        }
    public void midTravels(Node node){

        //System.out.println("start once..");

        if(node == null){
            //System.out.println("root is null");
            return ;
        }
        else{
            midTravels(node.leftChild);
            //show(node);     //root node data first
            System.out.println(node.data);
            midTravels(node.rightChild);

        }

    }





    public static void main(String[] args){


        BinaryTree bt = new BinaryTree();


        Node root = new Node(0);

        root = bt.insert(root,12345);
        root = bt.insert(root,111);
        root = bt.insert(root,222);
        root = bt.insert(root,999);
        root = bt.insert(root,1);
        bt.midTravels(root);
    }


}
