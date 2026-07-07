class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val; 
    }
    
    public void addAtHead(int val) {
        ListNode newnode = new ListNode(val);
        if (head==null) {
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newnode = new ListNode(val);
        if(head == null){
            head  = newnode;
        }
        else{
            ListNode curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newnode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

    if (index == 0) {
        addAtHead(val);
        return;
    }

    if (index == size) {
        addAtTail(val);
        return;
    }

    ListNode newnode = new ListNode(val);
    ListNode curr = head;

    for (int i = 0; i < index - 1; i++) {
        curr = curr.next;
    }

    newnode.next = curr.next;
    curr.next = newnode;
    size++;
    }
    
    public void deleteAtIndex(int index) {

    if (index < 0 || index >= size) return;

    if (index == 0) {
        head = head.next;
        size--;
        return;
    }

    ListNode curr = head;

    for (int i = 0; i < index - 1; i++) {
        curr = curr.next;
    }

    curr.next = curr.next.next;
    size--;
}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */