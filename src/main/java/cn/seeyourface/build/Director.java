package cn.seeyourface.build;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/14 17:45
 * @since 1.1.0
 */
public class Director {

    public void build(ProductBuilder builder){
        builder.buildName();
        builder.buildCountry();
        builder.buildPrice();
        Product p = builder.build();
        System.out.println(p.toString());
    }
}
