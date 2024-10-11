void main(){
    myMethod(new SchoolBoy(), new SchoolGirl());
}

void myMethod(Boy b, Girl g){}
void myMethod(Human a, SchoolGirl g){}
void myMethod(SchoolBoy a, Object g){}
void myMethod(Object a, Object b){}
void myMethod(SchoolBoy a, Human b){}
void myMethod(Object o, Girl g){}
void myMethod(SchoolBoy a, SchoolGirl g){
    System.out.println("myMethod(SchoolBoy,SchoolGirl)");
}

class Human{}
class Girl extends Human{}
class Boy extends Human{}
class SchoolBoy extends Boy{}
class SchoolGirl extends Girl{}