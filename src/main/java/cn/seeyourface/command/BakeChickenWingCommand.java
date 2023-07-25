package cn.seeyourface.command;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/25 10:57
 * @since 1.1.0
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    protected void executeCommand() {
        barbecuer.bakeChickenWing();
    }
}
