package whoami1023;

public class PettyGirl implements IPettyGirl {
    private String name;

    public PettyGirl(String _name) {
        this.name = _name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "---脸蛋很漂亮！");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "---身材非常棒！");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "---气质非常好！");
    }
}
