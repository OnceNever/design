package cn.seeyourface.mediator;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/27 11:40
 * @since 1.1.0
 */
public abstract class Colleague {
    // 保存中介者的引用
    protected final Mediator mediator;
    protected final String name;
    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    protected abstract void receive(String message);
    protected abstract void send(String message);
}
