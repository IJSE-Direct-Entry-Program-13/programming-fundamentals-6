void main(){
    myMethod(new HuskyDog[]{});
}

class Animal{}
class Dog extends Animal{}
class HuskyDog extends Dog{}

//void myMethod(Animal[] animal){
//    System.out.println("myMethod(Animal[]");
//}
//void myMethod(Dog[] dogs){
//    System.out.println("myMethod(Dog[])");
//}
//void myMethod(Object[] cats){
//    System.out.println("myMethod(Object[])");
//}
void myMethod(Object cats){
    System.out.println("myMethod(Object)");
}