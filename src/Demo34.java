void main(){
    byte a = 10;
    short b = 10;
    int c = 20;
    myMethod(b, a, c);
}

void myMethod(short x, float y, int z){
    System.out.println("myMethod(short, float, int)");
}

void myMethod(int x, short y, double z){
    System.out.println("myMethod(int, short, double)");
}

void myMethod(float f, int x, int y){
    System.out.println("myMethod(float, int, int)");
}

void myMethod(short a, short b, int c){
    System.out.println("myMethod(short, short, int)");
}
