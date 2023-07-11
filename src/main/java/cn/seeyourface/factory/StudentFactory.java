package cn.seeyourface.factory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/11 11:35
 * @since 1.1.0
 */
public class StudentFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Student("学生");
    }

}
