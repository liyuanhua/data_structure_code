/**
 * Created by liyuanhua on 16/4/6.
 */
public class BinaryTreeV2 {

    int cnt = 0;

    public static class Node{
        String key;
        int value;
        Node leftChild;
        Node rightChild;



        Node(String key,int value){
            this.key = key;
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

    }

    public Node root = new Node("root",0);

    public void insert(String key,int value){
        insert(root,key,value);
    }

    public Node insert(Node node ,String key,int value){        //must return Node type
        if(node == null){
            node = new Node(key,value);
        }
        else if(value < node.value){
            node.leftChild = insert(node.leftChild,key,value);      //is left,not node
        }
        else{
            node.rightChild = insert(node.rightChild,key,value);
        }

        return node;

    }
    public void midTravel(){
        midTravel(root);
    }

    public void midTravel(Node node){
        if(node == null){
            return;
        }
        else{
            midTravel(node.leftChild);
            System.out.println(node.key + " : " + String.valueOf(node.value));
            midTravel(node.rightChild);
        }
    }

    public void max(){
        max(root);
    }
    public void max(Node node){
        if(node.rightChild == null){
            System.out.println("max -->" + node.value);
        }
        else{
            max(node.rightChild);
        }

    }

    public void min(){
        min(root);
    }
    public void min(Node node){
        if(node.leftChild == null){
            System.out.println("min -->" + node.value);
        }
        else{
            min(node.leftChild);
        }

    }

    public void get(int value){
        get(root,value);
    }

    public void get(Node node,int value){

        if(node == null){
            System.out.println("cannot found,exit");
            return ;
        }
        else if(node.value == value){
            System.out.println("after " + cnt + " found!,the key --> " + node.key);

        }
        else if (node.value < value){
            cnt++;
            get(node.rightChild,value);
        }
        else if(node.value > value){
            cnt++;
            get(node.leftChild,value);

        }
    }

    public static void main(String[] args){

        BinaryTreeV2 bt2 = new BinaryTreeV2();

        bt2.insert("l1",-1);
        bt2.insert("l2",-2);
        bt2.insert("l3",-3);
        bt2.insert("r1",1);
        bt2.insert("r2",2);
        bt2.insert("r3",3);

        bt2.midTravel();

        bt2.max();
        bt2.min();

        bt2.get(2);
    }
}
