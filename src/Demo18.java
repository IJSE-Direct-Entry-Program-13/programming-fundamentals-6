void main(){
    System.out.println(false ? 2.f : 5);
    boolean flag = false;
    float f = flag ? 2.f: 10;
    // int l = flag ? 2L : 10;
    long l = flag ? 2L : 10;
    float f2 = flag ? 2L : 10;
    //long d = flag ? 10 + 2. : 2l + 3;
    //float d = flag ? 10 + 2. : 2l + 3;
    double d = flag ? 10 + 2. : 2l + 3;
    Byte b = 2;
    long l2 = flag ? b : 2l;
    float f3 = flag ? 2.5f: 3.2f;
}