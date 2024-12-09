package week11;

public class StringLinkedList {
    private String value;
    private StringLinkedList next;
    private StringLinkedList prev;

    public StringLinkedList(String value){
        this.value = value;
    }
    public StringLinkedList(StringLinkedList next){
        this.next = next;
    }

    // setter
    public void next(StringLinkedList next){
        this.next = next;
    }

    public void add(String value){
        // find tail

        StringLinkedList tail = this;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = new StringLinkedList(value);
        
    }

    public void remove(String s){
        StringLinkedList head = this;
        StringLinkedList prev = null;
        while(head.next != null){
            if(head.value.equals(s)){
                if(prev != null){
                    prev.next = head.next;
                }else{
                    head = head.next;
                }
                continue;
            }
            prev = head;
            head = head.next;
        }
    }

    public String toString(){
        StringLinkedList head = this;
        String str = "[";
        while(head != null){
            str += head.value;
            head = head.next;
        }
        str = str.substring(0, str.length() - 1) + "]";
        return str;
    }

    public static void main(String[] args) {
        StringLinkedList strings = new StringLinkedList("abc");
        // strings.next(new StringLinkedList("def"));

        strings.add("def");
        strings.add("ijk");
        System.out.println(strings);

        // Object reference -> strings -> object1 ()
    }
}
