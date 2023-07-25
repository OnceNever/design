package cn.seeyourface.command;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/25 10:56
 * @since 1.1.0
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    protected void executeCommand() {
        barbecuer.bakeMutton();
    }
}
