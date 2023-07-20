package cn.seeyourface.adapter;


/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/20 15:30
 * @since 1.1.0
 */
public class Adapter extends Player{

    private final Center center;

    public Adapter(String name) {
        super(name);
        center = new Center();
        center.setName(name);
    }

    @Override
    public void attack() {
        center.进攻();
    }

    @Override
    public void defense() {
        center.防守();
    }
}
