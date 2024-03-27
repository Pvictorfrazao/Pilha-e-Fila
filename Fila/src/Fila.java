public class Fila {

    Node head;
    Node tail;
    int count = 0;
    
    public Fila(){
        this.head = null;
        this.tail = null;
    }


    public void add(int data){
        Node temp = new Node(data);

        if(tail == null){
            head = temp;
            tail = temp;
        }else{
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        
        count ++;
    }

    public void peek(){
        Node temp = head;
        
        System.out.println(temp.data);
    }

    //teste de mapear a cauda
    public void peek2(){
        Node temp = tail;
        
        System.out.println(tail.data);
    }


    public void remove(){
        if(head == null){
            System.out.println("Não tem elementos na lista para serem removidos");
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;

        count --;
    }

    public void isEmpty(){
        if(tail == null){
            System.out.println("fila vazia");
        }
    }

    public void size(){
        System.out.println(count);
    }

 
}
