package cn.seeyourface.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Class DiscountEnum
 * @Author yanglei
 * @Date 2022/9/18 10:08
 * @Version 1.0
 * @Description
 */
@Getter
@AllArgsConstructor
public enum DiscountEnum {

    NONE(1, 10, 0, 0),
    DISCOUNT(2, 8, 0, 0),
    REBATE(3, 10, 500, 100);

    private static final Map<Integer, DiscountEnum> MAP = new HashMap<>();

    static {
        for (DiscountEnum enum1 : DiscountEnum.values()) {
            MAP.put(enum1.getType(), enum1);
        }
    }

    public static DiscountEnum getType(int type) {
        return MAP.get(type);
    }

    /**
     * 1 - 无优惠
     * 2 - 打折
     * 3 - 满减
     */
    private final int type;
    /**
     * 折扣
     */
    private final double discount;
    /**
     * 满
     */
    private final double full;
    /**
     * 返
     */
    private final double rebate;
}
