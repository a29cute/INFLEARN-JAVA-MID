package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속 받는다. : 묵시적 메소드
public class Parent { // + extends Object랑 같은 의미

    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
