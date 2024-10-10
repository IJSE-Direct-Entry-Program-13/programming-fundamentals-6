void main(){
    byte b = 10;
    short s = 20;
    boolean flag = false;
    short myShort = flag ? b : s;
    byte myByte = flag ? b : 25;
    int x = 10;
    int myByte2 = flag ? b : x;

    char c = 'A';
    char myChar = flag ? c : 5;
    int myInt = flag ? c : b;

    final int abc = 10;
    final long edf = 20;
    byte b2 = flag ? b : abc;
    //short s2 = flag ? s : edf;
    // int s2 = flag ? s : edf;
    long l = flag ? s : edf;

    final short s3 = 5;
    // byte b3 = flag ? b : s3;
    short b3 = flag ? b : s3;

    final int myConst = 150;
    //byte b4 = flag ? b : myConst;
    //short b4 = flag ? b : myConst;
    int b4 = flag ? b : myConst;
}