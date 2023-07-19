package cn.seeyourface.abstractFactory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 10:39
 * @since 1.1.0
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}
