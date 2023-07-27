package cn.seeyourface.mediator;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/27 11:39
 * @since 1.1.0
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(String message, Colleague colleague);
}
