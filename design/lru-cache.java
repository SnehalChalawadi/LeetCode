class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        public Node(int key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    HashMap<Integer,Node> map;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);

        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }

    public void removeNode(Node node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void addNode(Node node)
    {
        tail.prev.next=node;
        node.prev=tail.prev;

        node.next=tail;
        tail.prev=node;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        Node node=map.get(key);
        removeNode(node);
        addNode(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            removeNode(node);
            node.value=value;
            addNode(node);
            return;
        }
        if(map.size()== capacity){
            Node node=head.next;
            removeNode(node);
            map.remove(node.key);
        }
        Node node=new Node(key,value);
        map.put(key,node);
        addNode(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */