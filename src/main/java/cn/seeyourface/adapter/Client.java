package cn.seeyourface.adapter;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/20 15:41
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) {
        Player player1 = new Forwards("巴蒂尔");
        player1.attack();
        player1.defense();

        Player player2 = new Guards("麦克格雷迪");
        player2.attack();
        player2.defense();

        Player player3 = new Adapter("姚明");
        player3.attack();
        player3.defense();
    }
}
