void main(){
    byte b = 10;
    short s = 10;
    char c = 'A';
    int i = 10;
    long l = 10;

    myMethod(i);        // I.C
    myMethod(b); myMethod(s);myMethod(c);   // W.P.C
    //myMethod(l);        // N.P.C X

    myMethod2((short) 10);
    short s2 = 10;
    myMethod2(s2);
}

void myMethod(int x){

}

void myMethod2(short s){}