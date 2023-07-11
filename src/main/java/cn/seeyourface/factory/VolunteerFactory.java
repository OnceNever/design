package cn.seeyourface.factory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/11 11:37
 * @since 1.1.0
 */
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer("志愿者");
    }

}
