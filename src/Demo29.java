void main(){
    // Loose Invocation Context
    myMethod(10);       // Boxing Conversion
    myMethod3(10);      // Boxing Conversion + Widening Reference Conversion
    Integer i = 10;
    myMethod2(i);           //  Unboxing Conversion + Widening Primitive Conversion
    Long l = 2l;
    myMethod2(l);           // Unboxing Conversion
}

void myMethod(Integer i){

}

void myMethod2(long l){

}

void myMethod3(Number i){

}