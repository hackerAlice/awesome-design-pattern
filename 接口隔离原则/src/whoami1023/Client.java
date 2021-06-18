package whoami1023;

/**
 * 场景实现类
 */
public class Client {
    public static void main(String[] args) {
        IPettyGirl pettyGirl = new PettyGirl("哈哈");
        AbstractSearcher searcher = new Searcher(pettyGirl);
        searcher.show();
    }
}
