void main(){
    Object o = 10;
    Number n = 10;
    Integer i = 15;
    Float f = 20f;

    myMethod(n);            // I.C
    myMethod(i);            // W.R.C
    myMethod(f);            // W.R.C
    myMethod((Number) o);   // N.R.C + I.C
}

void myMethod(Number n){}