package whoami1023;

/**
 * 星探抽象类
 */
public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;

    public AbstractSearcher(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    // 搜索美女，列出美女信息
    public abstract void show();
}
