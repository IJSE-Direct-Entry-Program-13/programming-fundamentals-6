import java.io.Serializable;

void main(){
    int i = 10;             // Identity Conversion
    Integer i2 = 10;        // Boxing Conversion
    System.out.println(i2);

    long l = 20;            // Widening Primitive Conversion
    Long l2 = l;            // Boxing Conversion
    Long l3 = 20L;          // Boxing Conversion

    byte b = 10;            // Narrowing Primitive Conversion
    Byte b2 = 10;           // Narrowing Primitive Conversion followed by Boxing Conversion
    System.out.println(b2);

    Number o = 10;          // Boxing Conversion followed by Widening Reference Conversion
    Serializable s2 = 10.2; // Boxing Conversion followed by Widening Reference Conversion

    // Unboxing conversion optionally followed by Widening primitive conversion
    int i3 = b2;            // int <= Byte

    Character c = 'c';      // Boxing Conversion
    double d = c;           // double <= Character Unboxing Conversion followed by Widening Primitive Conversion

    Byte b3 = 10;           // Narrowing Primitive Conversion followed by Boxing Conversion
    Object n2 = b3;         // Widening Reference Conversion

    long l4 = b3;
    // Long l5 = 20;

}