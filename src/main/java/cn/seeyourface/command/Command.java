package cn.seeyourface.command;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/25 10:42
 * @since 1.1.0
 */
public abstract class Command {
    // 指定命令接收人
    protected final Barbecuer barbecuer;

    public Command (Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    protected abstract void executeCommand();
}
