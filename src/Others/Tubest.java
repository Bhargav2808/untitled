package Others;

public class Tubest {
    public static void main(String[] args) {
        A a = new B(10, 15, 10);
        B b = (B)new A(10, 45);
//      A a;
//      a = b;
//        a.show();
//        a.show3();


    }
    }


class A{
    int i;
    int j;
    A(int i, int j){
        this.i = i;
        this.j = j;
    }
    void show3(){
        System.out.println("Hello World");
    }
    void show(){
        System.out.println("Hello I'm A");
    }
}

class B extends A{

    int k;
    void show() {
        System.out.println("Hello From B");
    }
    B(int i, int j, int k){
      super(i, j);
      this.k = k;
    }
    void show2(){
        System.out.println("Hello I'm Second Show");
    }

    public B(int i, int j) {
        super(i, j);
    }
}