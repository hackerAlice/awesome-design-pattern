package lsp;

/**
 * MachineGun: 描述机枪的类
 */
public class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("机枪射击...");
    }
}
