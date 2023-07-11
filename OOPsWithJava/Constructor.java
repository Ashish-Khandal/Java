package OOPsWithJava;

class Show {
    // ! Constructor always create by same class name.
    // ? Constructor should not return a value even void also.
    // * Constructor cannot be inheritance.
     // Example:-
                /* public interface InterfaceTest {
                    public InterfaceTest(){
                    }
                    public abstract void display();
                    public abstract void Show();
                }*/
    void Show() {
    // ? Default Constructor / non perameterise / zero argument Constructor.
        System.out.println("This is a method of Show class.");
    }

    int Show(int a, int b) {
        // parameterised Constructor.
        int c = a + b;
        return c;
    }
    float Show(float a, float b) {
        // parameterised Constructor.
        //Type casting.
        int c = (int)a + (int)b;
        return c;
    }
}
class Show1 extends Show {
    void Show1(){

        System.out.println("This is a method of extends Show1 class .");
    }
}
class Student {
    String name;
    int age;
    Student(String n, int m) {
//       * this.name = n;
//       * this.age = m;
        System.out.println("Your name and age:- "+n+", "+m);
    }
    Student(Student s){
        //! object create
       name = s.name;
       age = s.age;
    }
}
public class Constructor{
    public static void main(String[] args) {
        Show1 obj = new Show1();
        obj.Show();
        obj.Show1();
        // create new objects.
        Student s = new Student("Ashish",22);
        Student s2 = new Student(s);
        System.out.println(obj.Show(5,10));
        System.out.println(obj.Show(5.10f,10.9f));
//        OOPsWithJava.Student st = new OOPsWithJava.Student(Ashish,21);
    }
}
