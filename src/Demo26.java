void main(){
    byte b = 10;
    // myMethod(b); // Widening Primitive + Narrowing Primitive Conversion X
    short s = 10;   // Narrowing Primitive Conversion X
    // myMethod(s);
    char c = 'A';
    myMethod(c);    // Identity Conversion - OK
    int i = 10;
    // myMethod(i);    // Narrowing Primitive Conversion X
}

void myMethod(char c){

}