package cn.seeyourface.build;

import lombok.Data;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/14 17:38
 * @since 1.1.0
 */
@Data
public class Product {

    /**
     * 产品名称
     */
    private String name;

    /**
     * 生产国家
     */
    private String country;

    /**
     * 产品价格
     */
    private String price;
}
