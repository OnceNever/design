package cn.seeyourface.build;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/14 17:44
 * @since 1.1.0
 */
public class PhoneBuilder extends ProductBuilder{

    private final Product product = new Product();

    @Override
    public void buildName() {
        product.setName("手机");
    }

    @Override
    public void buildCountry() {
        product.setCountry("美国");
    }

    @Override
    public void buildPrice() {
        product.setPrice("10000￥");
    }

    @Override
    public Product build(){
        return product;
    }
}
