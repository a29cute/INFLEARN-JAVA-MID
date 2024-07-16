package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();


        action(dog);
        action(car);
    }

    private static void action(Object obj){
        // obj.sound(); Object는 sound()가 없기 때문에 컴파일 오류
        // -> 다운캐스팅이 필요
        if(obj instanceof Dog dog){ // 다운캐스팅은 instanceof를 사용한다.
            dog.sound();
        } else if (obj instanceof Car car){
            car.move();
        }
    }
}
