void main(){
    System.out.println("Conversions and Contexts");

    boolean flag = true;
    int x = 10;
    long y = 20L;
    float f = 2.5f;
    double d = 3.2;
    double d2 = 2d;
    char c = 'a';
    String str = "ijse";

    // Followings are not identity conversions
    byte b = 5;         // byte <= int
    short s = 10;       // short <= int
    char c2 = 25;       // char <= int
    long l = 5;         // long <= int
    float f2 = 2;       // float <= int
    double d3 = 3;      // double <= int
    float f3 = 2l;      // float <= long
    double d4 = 'a';    // double <= char
    Object o = "dep";   // Object <= String
    String str2 = null; // String <= null
}