package week11;

public class LinkedList1 {
    private Node head; //
    // public Node last; // ! Real LinkedList
  
    public void add(String newValue) {
      if (this.head == null) {
        this.head = new Node(newValue);
        return;
      }
      Node tail = this.head;
      while (tail.next != null) {
        tail = tail.next;
      }
      tail.next = new Node(newValue);
    }
  
    // O(1) - No loop
    public void removeFirst() {
      this.head = this.head.next;
    }
  
    // O(n) - Real LinkedList -> O(1)
    public void removeLast() {
      Node tail = this.head;
      Node prev = null;
      while (tail != null) {
        if (tail.next == null) { // tail definition
          prev.next = null;
          return;
        }
        prev = tail;
        tail = tail.next;
      }
    }
  
    // ! Remove target Node
    public void remove(String s) {
      Node current = this.head;
      Node prev = null;
      while (current != null) {
        if (current.value.equals(s)) {
          if (prev != null) {
            prev.next = current.next; // 1 -> 3
          } else {
            this.head = current.next;
          }
          return;
        }
        prev = current;
        current = current.next;
      }
    }
  
    public String toString() {
      Node tail = this.head;
      String str = "LinkedList1[";
      while (tail != null) {
        str += tail.value + ",";
        tail = tail.next;
      }
      str = str.substring(0, str.length() - 1) + "]";
      return str;
    }
  
    public static void main(String[] args) {
      LinkedList1 ll = new LinkedList1();
      ll.add("abc");
      ll.add("def");
      System.out.println(ll); // LinkedList1[abc,def]
      ll.add("ijk");
      System.out.println(ll); // LinkedList1[abc,def,ijk]
      ll.remove("abc");
      System.out.println(ll); // LinkedList1[def,ijk]
      ll.removeLast();
      System.out.println(ll); // LinkedList1[def]
    }
  }