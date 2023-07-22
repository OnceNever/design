package cn.seeyourface.composite;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/22 10:21
 * @Version 1.0
 * @Description
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int length);

    public abstract void lineOfDuty();

}
