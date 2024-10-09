void main(){
    myMethod1(new Object()); myMethod1(new A()); myMethod1(new B());
    myMethod1(new C()); myMethod1(new D());myMethod1(new E());

    myMethod2(new A()); myMethod1(new B()); myMethod2(new C()); myMethod2(new D()); myMethod2(new E());
    myMethod3(new B()); myMethod3(new D()); /* myMethod3(new A()); myMethod3(new Object());*/
    myMethod4(new C()); myMethod4(new E());  /* myMethod3(new A()); myMethod3(new Object());*/
}

void myMethod1(Object o){}
void myMethod2(A a){}
void myMethod3(B b){}
void myMethod4(C c){}

class A /*extends Object*/{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}