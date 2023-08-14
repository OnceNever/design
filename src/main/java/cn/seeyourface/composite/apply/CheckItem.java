package cn.seeyourface.composite.apply;


/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 11:40
 * @since 1.1.0
 */
public abstract class CheckItem {
    protected String name;
    protected Double score;
    protected Boolean checkable;

    public CheckItem(String name, Double score) {
        this.name = name;
        this.score = score;
        this.checkable = true;
    }

    public CheckItem(String name, Double score, Boolean checkable) {
        this.name = name;
        this.score = score;
        this.checkable = checkable;
    }

    public abstract double display();
}
