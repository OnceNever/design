package cn.seeyourface.build;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/14 17:42
 * @since 1.1.0
 */
public class CarBuilder extends ProductBuilder {

    private final Product product = new Product();

    @Override
    public void buildName() {
        product.setName("汽车");
    }

    @Override
    public void buildCountry() {
        product.setCountry("中国");
    }

    @Override
    public void buildPrice() {
        product.setPrice("1000000￥");
    }

    @Override
    public Product build(){
        return product;
    }
}
