package cn.seeyourface.build;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/14 17:40
 * @since 1.1.0
 */
public abstract class ProductBuilder {

    public abstract void buildName();

    public abstract void buildCountry();

    public abstract void buildPrice();

    public abstract Product build();
}
