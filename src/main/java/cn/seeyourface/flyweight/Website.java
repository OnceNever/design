package cn.seeyourface.flyweight;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/28 14:39
 * @since 1.1.0
 */
public abstract class Website {

    protected final String name;
    public Website(String name) {
        this.name = name;
    }

    protected abstract void use(User user);
}
