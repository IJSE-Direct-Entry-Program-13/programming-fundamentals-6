void main(){
    myMethod(10);
}

void myMethod(byte x){
    System.out.println("int");
}

void myMethod(Float x){
    System.out.println("Integer");
}

void myMethod(byte... x){
    System.out.println("int...");
}

void myMethod(Integer... x){
    System.out.println("Integer...");
}