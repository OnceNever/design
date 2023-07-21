package cn.seeyourface.memoire;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/21 14:20
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) {
        Role role = new Role();
        role.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.save());

        role.fight();
        role.display();

        role.restore(caretaker.getMemento());
        role.display();
    }
}
