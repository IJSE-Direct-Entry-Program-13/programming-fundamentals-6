void main(){
    byte b = 10;        // (byte <= int) Narrowing Primitive Conversion

    // Followings are widening primitive conversion
    short s = b;        // short <= byte
    int i = b;          // int <= byte
    long l = b;         // long <= byte
    float f = b;        // float <= byte
    double d = b;       // double <= byte
    l = i;              // long <= int
    d = f;              // double <= float
    i = 'c';            // int <= char
    f = 'c';            // float <= char

    // char c = b;
    // char c = s;

    int i2 = 1234567891;
    float f2 = i2;
    double d2 = i2;
    System.out.println(f2);
    System.out.println(d2);

}