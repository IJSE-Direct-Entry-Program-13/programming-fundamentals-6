import java.io.Serializable;

void main(){
    Integer i = Integer.valueOf(10);    // Boxing
    int i2 = i.intValue();                // Unboxing

    Integer myInteger = 10;         // Auto Boxing Conversion
    int myInt = myInteger;          // Auto Unboxing Conversion

    Boolean myBool = false;         // Boolean.valueOf(false)
    boolean myBool2 = myBool;       // myBool.booleanValue();

    Serializable myInteger2 = 10;
    //  10 -> Integer.valueOf(10) -> W.R.C (Serializable)

    long myInt2 = myInteger;
    // myInteger.intValue() -> W.P.C (long)

    // int myInt3 = myInteger2;

    Object o = 10;
    //Number n = o;

    byte b = 10;
    // Long l = b;
    Number n = b;
    //Float f = 10;
    Double d = 10d;
    // Number n = 'c';
    Character c = 10;
    int i3 = c;

    Serializable flag = false;

    // Integer i4 = c;
    // byte b2 = c;

    final short s = 65;
    byte b3 = s;

    final byte b4 = 65;
    final byte b5 = b4;
    Character c3 = b5;

    short s2 = 65;
    byte b6 = (byte) s2;

}