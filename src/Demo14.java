void main(){
    String str1 = "ijse";
    String str2 = "ijse";
    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    System.out.println("----------------------");

    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));
    System.out.println(i1.intValue() == i2.intValue());
    System.out.println(i1.compareTo(i2) == 0);

    System.out.println("----------------------");

    Integer i3 = 150;
    Integer i4 = 150;
    System.out.println(i3 == i4);
    System.out.println(i3.equals(i4));
    System.out.println(i3.intValue() == i4.intValue());
    System.out.println(i3.compareTo(i4) == 0);

    Long l1 = 150L;
}