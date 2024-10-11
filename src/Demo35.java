void main(){
    myMethod((byte) 10, (short) 10, (byte) 10, 10);
}

//void myMethod(short a, int b, double c, long d){
//    System.out.println("myMethod(short,int,double,long)");
//}
//
//void myMethod(int a, short b, short c, long d){
//    System.out.println("myMethod(int,short,short,long)");
//}
//
//void myMethod(short a, short b, int c, float d){
//    System.out.println("myMethod(short,short,int,float)");
//}
//
//void myMethod(int a, int b, float c, long d){
//    System.out.println("myMethod(int,int,float,long)");
//}

void myMethod(Byte a, Short b, Byte c, Integer d){
    System.out.println("myMethod(Byte,Short,Byte,int)");
}
