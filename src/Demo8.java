void main(){
    // Object :> String
    // Widening Reference Conversion = When you assign a proper subtype to a super type

    Object o = new Object();            // Identity Conversion
    myMethod(o);
    myMethod("ijse");                   // Widening Reference Conversion
    String str = "dep";
    myMethod(str);                      // Widening Reference Conversion
    Object o1 = str;                    // Object <= String (W.R.C)
    Object o2 = "dep";                  // Object <= String (W.R.C)
    Object o3 = new Object();           // Object <= Object (I.C)
}

void myMethod(Object o){
}