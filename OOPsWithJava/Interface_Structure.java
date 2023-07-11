package OOPsWithJava;

public interface Interface_Structure {
    public abstract void learn(String str);
    public abstract void work();

    public static final int duration = 10;

    public static void main(String[] args) {
        Interface_Structure ins = new Interface_Structure() {
            @Override
            public void learn(String str) {
                str = "Ashish";
                System.out.println("This a interface first method.");
                System.out.println("This abstract method paramiteris-->"+str);
            }

            @Override
            public void work() {
                System.out.println("This a interface second method.");
                System.out.println("Interface valiable is -->"+duration);
            }
        };
    }

}
