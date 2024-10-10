void main(){
    System.out.println((int) 10);       // Identity Conversion
    System.out.println((long) 10);      // Widening Primitive Conversion
    System.out.println((byte) 10);      // Narrowing Primitive Conversion
    System.out.println((Integer) 10);   // Boxing Conversion
    Integer i = 10;
    System.out.println((int) i);        // Unboxing Conversion
    System.out.println((Number) 10);    // Boxing Conversion + W.R.C
    System.out.println((long) i);       // Unboxing Conversion + W.P.C
    byte b = 10;
    System.out.println((char) b);       // W.P.C + N.P.C
    String str = "ijse";
    System.out.println((Object) str);   // Widening Reference Conversion
    Object o = 10.2;
    System.out.println((Double) o);     // Narrowing Reference Conversion

    // System.out.println((String) 10);        // String Conversion
    // System.out.println((int) "ijse");       // String Conversion
    // System.out.println((boolean) 10);       // Incompatible Conversion
}