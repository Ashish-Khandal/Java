package OOPsWithJava;

// * variable, method & class are final that means these are constant.
class ParentClass3{

    int num = 10;

    final void showData() {
        System.out.println("Inside ParentClass showData() method");
        System.out.println("num = " + num);
    }

}

final class ChildClass3 extends ParentClass3{
    // ? if we are use this method than find the error.
    // ? it does not allow it to override.
    /* !void showData() {
      *  System.out.println("Inside ChildClass showData() method");
      *  System.out.println("num = " + num);
     !}*/
}
/* !class Final_class extends  ChildClass3{
//? When a class defined with final keyword, it can not be extended by any other class.
   ! int a = 10;
   ! String s = "Ashsih";
 ! }  */
public class Final_Var_Method_Class {
    public static void main(String[] args) {

        final int a = 10;

        System.out.println("a = " + a);

       // ! a = 100;	// ! Can't be modified

        ChildClass obj = new ChildClass();
        obj.showData();
    }
}
