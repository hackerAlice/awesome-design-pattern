package lsp;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        // 产生三毛这个士兵
        Soldier sanMao = new Soldier();
        // 给三毛一只枪
        sanMao.setGun(new Rifle());
        sanMao.killEnemy();
    }
}
