void main(){
    byte a = 10;
    short b = 10;
    int c = 10;
    myMethod(a, b, c);
    // myMethod(10,10);
}

void myMethod(int x, short s, long l){
    System.out.println("myMethod(int, short, long");
}

void myMethod(long x, int s, float l){
    System.out.println("myMethod(long, int, float");
}

void myMethod(int x, long y){}

void myMethod(long x, int y){}