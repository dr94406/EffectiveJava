package main.com.effectivejava.item3.singleton;

public class Elvis {

    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}
}
