package kr.or.connect.diexam01;

public class ElectricEngine extends Engine {
    public ElectricEngine() {
        System.out.println("ElectricEngine 생성자");
    }

    @Override
    public void exec() {
        System.out.println("전기 엔진이 동작합니다.");
    }
}
