void main(){
    byte b = 10;        // N.P.C
    myMethod1(b);
    // myMethod1(10);   // ?
    myMethod2(10);   // Identity Conversion
    myMethod2(b);      // W.P.C
}

void myMethod1(byte x){

}

void myMethod2(int x){

}