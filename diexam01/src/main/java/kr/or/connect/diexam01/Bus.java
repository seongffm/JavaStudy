package kr.or.connect.diexam01;

public class Bus extends Car {
    public Bus() {
        System.out.println("Bus 생성자");
    }

    @Override
    public void run() {
        System.out.println("버스가  전기엔진을 이용하여 달립니다.");
        super.run(); // 부모 클래스의 run() 호출
    }
}
