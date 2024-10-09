void main(){
    byte b = -5;
    char c = (char) b;
    byte b2 = (byte) c;
    short s = (byte) c;
    int i = c;
    System.out.println(b2);
    System.out.println(s);
    System.out.println(i);
}