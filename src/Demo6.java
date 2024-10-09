void main(){
    byte b = 2;
    short s = 3;
    char c = 4;
    int i = 5;

    // sub (S) <: super (T)
    // byte <: int
    // short <: int
    // char <: int
    // int <: int

    //  Widening Primitive/Reference Conversion (LSP Rule)
    //  if S is a subtype of T, then objects of type T in a program may be replaced with objects of type S
    //  without altering any of the desirable properties of that program

    // int i2 = i;
    // int i2 = c;
    // int i2 = s;
    int i2 = b;
    myMethod(i);
    myMethod(b);
    myMethod(s);
    myMethod(c);
}

void myMethod(int x){

}