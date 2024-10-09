import java.io.Serializable;

void main(){
    Object[] o = {};
    Serializable s = null;
    Cloneable c = null;
    int[] x = {};

    myMethod(o); myMethod(s); myMethod(c); myMethod(x);
    myMethod1(s); myMethod1(o); myMethod1(x); /*myMethod1(c);*/
    myMethod2(o); myMethod2(x); myMethod2(c); /*myMethod2(s);*/
    myMethod3(x); /*myMethod3(o); myMethod3(c); myMethod3(s);*/
    myMethod4(o); /*myMethod4(x); myMethod4(c); myMethod4(s);*/
}

void myMethod(Object o){}
void myMethod1(Serializable s){}
void myMethod2(Cloneable c){}
void myMethod3(int[] x){}
void myMethod4(Object[] x){}