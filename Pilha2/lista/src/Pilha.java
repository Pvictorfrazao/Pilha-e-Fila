public class Pilha {

    Node head;
    int tamanho, qtd;
    
    public Pilha(int tamanho){
        this.head = null;
        this.tamanho = tamanho;
    }

    public void push(int data){
        Node temp = new Node(data);
     
        if(qtd >= tamanho){
            System.out.println("A pilha está cheia 2");
        }else{
            temp.next = head;
            head = temp;
            qtd ++;
        }
        
    }

    public void peek(){
        Node current = head;
        if (head == null){
            System.out.println("Não há elementos na pilha");
        }else{
            System.out.println(current.data);
        }
    }

    public void pop(){
        if(head == null){
            return;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        qtd --;
    }

    public void isEmpty(){
        if (head == null){
            System.out.println("A pilha está vazia");
        }else{
            System.out.println("A pilha não está vazia");
        }
    }

    public void isFull(){
        if (tamanho == qtd){
            System.out.println("A pilha está cheia");
        }else{
            System.out.println("A pilha não está cheia");
        }
    }
    
}
