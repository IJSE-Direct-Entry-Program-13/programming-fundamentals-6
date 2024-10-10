void main(){
    Boy kasun = new Boy();
    Girl piumi = new Girl();

    Object o = kasun;
    System.out.println(o == kasun);

    Human h = (Human) o;
    //Dog d = (Dog) h;
    //Dog d = (Dog) o;

    //Dog dog = (Dog) new Boy();     // W.R.C + N.R.C

    Object o2 = (Object) new Boy();
    Dog dog2 = (Dog) o2;

    Dog dog3 = (Dog) (Object) new Boy();

}

class Human{}
class Boy extends Human{}
class Girl extends Human {}
class Dog{}