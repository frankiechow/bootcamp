package week7;

public class StringBox {
    private char[] chs;

    public StringBox(String s){
        this.chs = s.toCharArray();
    }
    public char charAt(int idx){
        return this.chs[idx];
    }

    // String Design
    public StringBox append1(String s1){
        char[] arr = new char[this.chs.length + s1.length()];
        int idx = 0;
        for(int i = 0; i < this.chs.length; i++){
            arr[idx++] = this.chs[i];
        }
        for(int i = 0; i < s1.length(); i++){
            arr[idx++] = s1.charAt(i);
        }
        return new StringBox(String.valueOf(arr));
    }

    // StringBuilder Design
    public void append2(String s2){
        char[] arr = new char[this.chs.length + s2.length()];
        int idx = 0;
        for(int i = 0; i < this.chs.length; i++){
            arr[idx++] = this.chs[i];
        }
        for(int i = 0; i < s2.length(); i++){
            arr[idx++] = s2.charAt(i);
        }
        this.chs = arr;
    }
    @Override
    public String toString(){
    return String.valueOf(this.chs);
    }

    public static void main(String[] args) {
        StringBox sb = new StringBox("abc");
        System.out.println(sb.charAt(1)); // b
        sb.append2("def");
        System.out.println(sb); // abcdef

        StringBox newStringBox = sb.append1("ijk");
        System.out.println(newStringBox); //abcdefijk
    }
}
