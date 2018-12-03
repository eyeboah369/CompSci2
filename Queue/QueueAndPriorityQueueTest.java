import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

/**
 *  QUEUES & Priority Queues 
 */ 
public class QueueAndPriorityQueueTest
{
    // Generate a random regular queue, let users enter the number of nodes
    
    
    public static Node QueueGenerator()
    {
        Random randomgen = new Random();
        System.out.print("Enter the size of the queue: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("Random queue of" + x + "size: ");
        Node head = null;
            for(int i = 1; i <= x; i++) {
                
                int newInt = randomgen.nextInt(100);
                Node nNode = new Node((int)(Math.random()*100), head);
                head = nNode;
                System.out.println("Inserted: " + nNode.getData());
                
                
                }
                return head;
    }

    // Generate a random priority queue, let users enter the number of nodes
    public static Node PriorityQueueGenerator()
    { 
        
        Random randomgen = new Random();
        System.out.print("Enter the size of the queue: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("Random queue of" + x + "size: ");
        Node head = null;
       
        for(int i = 0; i <= x; i++) {
            int newInt = randomgen.nextInt(100);
            Node nNode = new Node((int)(Math.random()*100), head);
            nNode.setLink(head);
            nNode = head;
            
            
        }
        return head;
    }    
    
    
    public static void QueuePrint(Node entry)
    {
        
        entry = entry.getData();
        for(int i = 0; i < entry; i++) {
        System.out.println(entry);

    }
    }

    // READ the DATA in the FIRST node of the Queue
    public static int PeekQueue(Node head)
    {
        int headNum = head;
        head.getLink();
        System.out.print("Head of the queue: " + head);
        
        return headNum;
        
    }

    // REMOVE the HEAD of the Queue
    public static Node Dequeue(Node head)
    {
        
        head.setLink(null);
        return head;
    }    
    
    // Enqueue for Regular Queue
    // ADD a NEW node to the TAIL of the Queue
    public static void Enqueue(Node head, Node nNode)
    {
      for(int i = 0; i <= 5; i--) {
           
            nNode = new Node(5, head);
            nNode.setLink(head);
            nNode = head;
            
            
        }
    }

    // Enqueue for Priority Queue
    // ADD a NEW node to the RIGHT place
    public static Node PriorityEnqueue(Node head, Node nNode)
    {
        for(int i = 0; i <= 5; i++) {
           
            nNode = new Node(5, head);
            nNode.setLink(head);
            nNode = head;
            
            
        }
        return nNode;
    }
    
    
    public static void main(String[] arg)
    {
        Node head=null;

        // 1.Regular Queue
        //==================
        
        // Generate RANDOM Queue
        head=QueueGenerator();        
              
        // PRINT all nodes of the queue BEFORE enqueuing
        QueuePrint(head);
        
        //Creat a new Node:
        Node newNode = new Node(1,null);
        
        //ENQUEUE
        Enqueue(head,newNode);
        
        // PRINT all nodes of the queue AFTER enqueuing
        QueuePrint(head);
        
        // PEEK: GET data in the HEAD of the queue
        System.out.println("\nPeekQUEUE: " + PeekQueue(head) );
        
        //DEQUEUE
        head=Dequeue(head);
        
        // PRINT all nodes of the queue AFTER enqueuing
        QueuePrint(head);
        
        // 2.Priority Queue
        //==================        
        
        head=null;
      
        // Generate RANDOM Queue
        head= PriorityQueueGenerator();           
     
        // PRINT all nodes of the queue BEFORE enqueuing
        QueuePrint(head);
        
        //Creat a new Node:
        newNode = new Node(90,null);
        
        //ENQUEUE
        head = PriorityEnqueue(head,newNode);
        
        // PRINT all nodes of the queue AFTER enqueuing
        QueuePrint(head);
        
        // PEEK: GET data in the HEAD of the queue
        System.out.println("\nPeekQUEUE: " + PeekQueue(head) );
        
        //DEQUEUE
        head=Dequeue(head);
        
        // PRINT all nodes of the queue AFTER enqueuing
        QueuePrint(head);
    }
}