void main(){
    int x = (int) 10;
    long y = (long) 10;
    double d = (double) 10.2f;
    int x2 = (byte) 10;

    byte b = (byte) x;

    short myShort = 150;
    byte b2 = (byte) myShort;
    System.out.println(b2);

    Integer i = (Integer) 10;
    Object n =  "ijse";
    i = (Integer) n;
}