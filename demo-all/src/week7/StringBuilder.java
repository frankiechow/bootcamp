package week7;

public class StringBuilder {
    public StringBuilder(String string) {
            //TODO Auto-generated constructor stub
        }
    
        public StringBuilder() {
                //TODO Auto-generated constructor stub
            }
        
                public static void main(String[] args) {
                    String s = "abc";
                    System.out.println(s); // abc
                    String s2 = s.concat("def"); // return a new String object
                    System.out.println(s2); // abcdef
                
                    StringBuilder sb = new StringBuilder("abc");
                System.out.println(sb); // abc
                sb.append("def");
                        System.out.println(sb); // abcdef
                    
                        // ! Why StringBuilder ?
                        System.out.println(sb.replace(1, 3, "x")); // axdef
                                        System.out.println(sb); // axdef
                                    
                                        int amount = 1_000_000;
                                        // StringBuilder has the best performance on String operation
                                        StringBuilder sb3 = new StringBuilder();
                                long startTime = System.currentTimeMillis();
                                for (int i = 0; i < 100_000; i++) {
                                  sb3.append("a");
                                }
                                long endTime = System.currentTimeMillis();
                                System.out.println(endTime - startTime); // 4 ms
                                System.out.println(sb3.length()); // 100_000
                                                            
                                                                String s10 = "";
                                                                startTime = System.currentTimeMillis();
                                                                for (int i = 0; i < 100_000; i++) {
                                                                  s10 += "a";
                                                                }
                                                                endTime = System.currentTimeMillis();
                                                                System.out.println(endTime - startTime); // 305 ms
                                                                System.out.println(s10.length()); // 100_000
                                                              }
                                                        
                                                                private char[] length() {
                                                    // TODO Auto-generated method stub
                                                    throw new UnsupportedOperationException("Unimplemented method 'length'");
                                                }
                                
                                                                private char[] replace(int i, int j, String string) {
                            // TODO Auto-generated method stub
                            throw new UnsupportedOperationException("Unimplemented method 'replace'");
                        }
                
                                private void append(String string) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'append'");
                }
    }