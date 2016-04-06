/**
 * Created by liyuanhua on 16/4/2.
 */
public class SequentSearchST {

    public static class Node{
        String key;
        int value;
        Node next;


        Node(String key,int value,Node next){
            this.key = key;
            this.value = value;
            this.next = next;

        }
    }

    Node first;

    public void get(String key){
        for(Node x = first;x!=null;x=x.next){
            if(x.key == key){
                System.out.println(x.value);
            }
        }
    }

    public void put(String key,int value){
        for(Node x=first;x!=null;x=x.next) {
            if (x.key == key) {
                x.value = value;
                return;
            }
        }

        first = new Node(key,value,first);
        return;



    }


    public static void main(String[] args){
        SequentSearchST ssst = new SequentSearchST();

        ssst.put("a",1);
        ssst.put("b",2);


        ssst.get("b");

    }
}
