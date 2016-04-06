/**
 * Created by liyuanhua on 16/4/3.
 *
 * !! sort !!
 */
public class BinaryNode {

    private int value;//current value
    private BinaryNode lChild;//left child
    private BinaryNode rChild;//right child

    public BinaryNode(int value, BinaryNode l, BinaryNode r){
        this.value = value;
        this.lChild = l;
        this.rChild = r;
    }



    //iterate all node.
    public static void iterate(BinaryNode root){        //mid travel
        if(root.lChild!=null){
            iterate(root.lChild);
        }
        //System.out.println(root.getValue());
        System.out.println(root.value);

        if(root.rChild!=null){
            iterate(root.rChild);
        }
    }

    /**
     * add child to the current node to construct a tree.
     * Time: O( nlog(n) )
     * **/
    public void addChild(int n){
        if(n<value){
            if(lChild!=null){
                lChild.addChild(n);
            }
            else{
                lChild = new BinaryNode(n, null, null);
            }
        }
        else{
            if(rChild!=null){
                rChild.addChild(n);
            }
            else{
                rChild = new BinaryNode(n, null, null);
            }
        }
    }

    //test case.
    public static void main(String[] args){
        System.out.println();
        int[] arr = new int[]{23,54,1,65,9,3,100};
        BinaryNode root = new BinaryNode(arr[0], null, null);
        for(int i=1; i<arr.length; i++){
            root.addChild(arr[i]);
        }
        BinaryNode.iterate(root);
    }
}

