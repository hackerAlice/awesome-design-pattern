package whoami1023;

/**
 * 星探表示类
 */
public class Searcher extends AbstractSearcher {
    public Searcher(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        System.out.println("--------美女信息如下--------");
        super.pettyGirl.goodLooking();
        super.pettyGirl.niceFigure();
        super.pettyGirl.greatTemperament();
    }
}
