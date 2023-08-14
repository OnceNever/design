package cn.seeyourface.composite.apply;

import org.apache.commons.lang3.StringUtils;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/8/14 14:33
 * @since 1.1.0
 */
public class CheckItemImpl extends CheckItem {
    public CheckItemImpl(String name, Double weight, Byte checkable) {
        super(name, weight, checkable);
    }

    @Override
    public double display(Byte type) {
        double s = (checkable | type) == 1 ? score : 0D;
        System.out.println(name + "的得分为：" + s);
        return s;
    }
}