public class App {
    public static void main(String[] args) throws Exception {

        Pilha pilha = new Pilha(3);

        pilha.peek();
        pilha.isEmpty();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.peek();
        pilha.isFull();
        pilha.push(4);
        pilha.isFull();





    }
}
