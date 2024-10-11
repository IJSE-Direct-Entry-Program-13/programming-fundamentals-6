import java.io.Serializable;

void main(){
    Byte b = 10;
    // System.out.println((Short) b);

    Integer i = 10;
    System.out.println((Serializable) i);

    // System.out.println((Long)(Object)i);                 // Class Cast Exception
    // System.out.println((String)(Serializable)(int)'A');  // Class Cast Exception

    System.out.println((Long) null);
    System.out.println((Serializable) null);
    System.out.println((Object) null);
    System.out.println((String) null);
    System.out.println((Boolean) null);

    // You can't cast null into primitives
    // System.out.println((long) null);
    // You can't cast any type into null
    // System.out.println((null) b);

    byte x = 10 + (int) (2.5 * 3);
    Byte b2 = 10;       // N.P.C + B.C
    // System.out.println((Byte) 10);
}