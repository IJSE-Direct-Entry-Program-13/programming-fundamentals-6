void main(){
    byte b = 10;
    short s = 10;
    char c = 'A';
    int i = 10;
    long l = 5L;
    float f = 5.0F;
    double d = 2.3;

    myMethod1(b);

    myMethod2(b);
    myMethod2(s);

    myMethod3(b);
    myMethod3(s);
    myMethod3(c);
    myMethod3(i);
}

void myMethod1(byte b){}
void myMethod2(short s){}
void myMethod3(int i){}