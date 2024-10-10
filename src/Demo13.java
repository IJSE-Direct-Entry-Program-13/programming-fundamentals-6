void main(){
    Integer i1 = new Integer(20);
    Integer i2 = new Integer(20);

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i1 == i2);
    System.out.println("================");

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);

    System.out.println(i3);
    System.out.println(i4);
    System.out.println(i3 == i4);
    System.out.println("================");

    Integer i5 = 10;    // Integer.valueOf(10);
    Integer i6 = 10;    // Integer.valueOf(10);

    System.out.println(i5);
    System.out.println(i6);
    System.out.println(i5 == i6);
    System.out.println(i3 == i5);
    System.out.println(i4 == i6);
}