package adapter;

public class HairDrier implements Electronic110V{
    @Override
    public void powerOn() {
        System.out.println("헤어드라이 110v on");
    }
}
