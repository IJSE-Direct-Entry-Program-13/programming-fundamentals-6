import java.io.Serializable;

void main(){
    myMethod(10,10,10,10);
}
void myMethod(Integer a, Object b, Serializable c, Number d){
    System.out.println("myMethod(Integer,Object,Serializable,Number)");
}
void myMethod(Integer a, short b, Number n, Double d){
    System.out.println("myMethod(Integer,short,Number,Double)");
}
void myMethod(Double d, Number b, Object c, Float f){
    System.out.println("myMethod(Double,Number,Object,Float)");
}
void myMethod(Float f, Serializable b, int c, Number d){
    System.out.println("myMethod(Float,Serializable,int,Object,Double)");
}
void myMethod(Number a, Short b, Serializable c, Integer d){
    System.out.println("myMethod(Number,Short,Serializable,int,Object,Double)");
}
void myMethod(int... x){
    System.out.println("myMethod(int...)");
}