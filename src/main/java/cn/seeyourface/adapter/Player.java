package cn.seeyourface.adapter;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/20 15:23
 * @since 1.1.0
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
