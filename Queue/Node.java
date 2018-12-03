public class Node
{
    private int data;
    private Node link;

    /**
     * Constructor for objects of class Node
     */

    public Node(int ndata, Node nlink)
    {
        // initialise instance variables
        data = ndata;
        link = nlink;
    }
   
    public int getData(){
        return data;
    }
    
    public Node getLink(){
        return link;
    }
      
    public void setData(int mydata){
        this.data = mydata;
    }
    
    public void setLink(Node mylink){
        this.link = mylink;
    }
}