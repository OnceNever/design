package cn.seeyourface.observer;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/17 16:49
 * @since 1.1.0
 */
public abstract class Observer {

    protected String name;
    protected Observable observable;

    public Observer(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
    }

    abstract void update();
}
