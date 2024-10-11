import java.io.Serializable;

void main(){
    //myMethod(new Object[]{10,20,30});
    myMethod(new int[]{10,20,30});
}

void myMethod(Cloneable a){
    System.out.println("myMethod(Cloneable)");
}
//void myMethod(Serializable a){
//    System.out.println("myMethod(Serializable)");
//}
void myMethod(Object o){
    System.out.println("myMethod(Object)");
}
//void myMethod(int[] x){
//    System.out.println("myMethod(int[])");
//}
void myMethod(long[] y){
    System.out.println("myMethod(long[])");
}