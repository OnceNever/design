package cn.seeyourface.command;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/25 11:09
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Barbecuer barbecuer = new Barbecuer();
        Waiter waiter = new Waiter();

        Command c1 = new BakeMuttonCommand(barbecuer);
        waiter.addCommand(c1);
        Thread.sleep(1000);
        Command c2 = new BakeMuttonCommand(barbecuer);
        waiter.addCommand(c2);
        Thread.sleep(1000);
        Command c3 = new BakeMuttonCommand(barbecuer);
        waiter.addCommand(c3);
        Thread.sleep(1000);
        Command c4 = new BakeMuttonCommand(barbecuer);
        waiter.addCommand(c4);
        Thread.sleep(1000);
        Command c5 = new BakeChickenWingCommand(barbecuer);
        waiter.addCommand(c5);
        Thread.sleep(1000);
        Command c6 = new BakeChickenWingCommand(barbecuer);
        waiter.addCommand(c6);
        Thread.sleep(1000);
        waiter.removeCommand(c4);
        Thread.sleep(1000);
        waiter.notice();
    }
}
