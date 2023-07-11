package cn.seeyourface.prototype;

import cn.hutool.core.date.DateUtil;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/11 14:41
 * @since 1.1.0
 */
public class Main {

    public static void main(String[] args) {
        Resume r1 = new Resume("小李");
        r1.setBaseInfo("男", 18);
        r1.setWorkExperience(DateUtil.date(), "中国移动");

        Resume r2 = r1.clone();
        r2.setBaseInfo("男", 20);
        r2.setWorkExperience(DateUtil.offsetMonth(DateUtil.date(), 6), "中国联通");

        r1.display();
        r2.display();
    }
}
