package main.com.effectivejava.item4.privateconstructor;

public class UtilityClass {

    // 기본 생성자가 만들어지는 것을 막는다 (인스턴스화 방지용)
    private UtilityClass() {
        throw new AssertionError();
    }
}
