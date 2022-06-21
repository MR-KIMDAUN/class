package Ex12;
class Car {
    int speed = 0;  // 속도 0으로 초기화
    
    void upSpeed(int speed) {   // Car 클래스에서 속도올리기 () 메소드 만듦
        this.speed += speed;
        System.out.println("현재속도(부모클래스) : " + this.speed);
    }
}

class Sedan extends Car {
    void upSpeed(int speed) {   // Sedan 클래스에서 속도올리기() 메소드를 오버라이딩 , 최고속도는 150이상 안 되도록

        // super.upSpeed(speed);    // 자식클래스에서 부모클래스를 강제 호출하는 코드 출력하게 되면 부모클래스의 upSpeed()가 호출됨
        this.speed += speed;
        if(this.speed > 150)
            this.speed = 150;
        System.out.println("현재속도(자식클래스) : " + this.speed);
    }
}

class Truck extends Car {   // Truck 클래스는 Car 클래스를 그대로 상속
}

public class overriding {
    public static void main(String[] args) {
        
        Truck truck1 = new Truck();
        Sedan sedan1 = new Sedan();

        System.out.print("트럭 -> "); // 최고속도를 200으로 올림
        truck1.upSpeed(200);

        System.out.print("승용차 -> ");    // 최고속도를 200으로 올림
        sedan1.upSpeed(200);
    }
}
