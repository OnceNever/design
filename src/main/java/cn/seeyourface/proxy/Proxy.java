package cn.seeyourface.proxy;

/**
 * <p>
 *     代理类
 * </p>
 *
 * @author yangLei
 * @date 2022/9/30 10:09
 * @since 1.0.0
 */
public class Proxy implements IGiveGift {

    // 保存一个真实实体的引用
    Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
