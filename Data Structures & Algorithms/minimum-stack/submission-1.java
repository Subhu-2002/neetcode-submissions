class MinStack {
    Node top;

    public MinStack() {
        top = null;
    }
    
    public void push(int val) {
        Node newNode = new Node(val);
        
        if(top == null){
            top = newNode;
            top.prevMin = newNode;
            return;
        }

        Node temp = top;
        top.next = newNode;
        top = top.next;   
        top.prev = temp; 

        if(temp.prevMin.val < val){
            top.prevMin = temp.prevMin;
        }else{
            top.prevMin = top;
        }
        
    }
    
    public void pop() {        
        if(top.prev == null){
            top = null;
        }else{
            top = top.prev;
        }
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.prevMin.val;
    }
}

class Node {
    int val;
    Node next;
    Node prev;
    Node prevMin;

    public Node() {
    }

    public Node(int val){
        this.val = val;
        this.prev = null;
        this.next = null;
        this.prevMin = null;
    }

    public Node(int val, Node next){
        this.val = val;
        this.next = next;
        this.prev = null;
        this.prevMin = null;
    }
}
