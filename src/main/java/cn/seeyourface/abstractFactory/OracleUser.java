package cn.seeyourface.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 10:50
 * @since 1.1.0
 */
@Slf4j
public class OracleUser implements IUser{
    @Override
    public void insert(User user) {
        log.info("新增一条OracleUser记录");
    }

    @Override
    public User getUser(int id) {
        log.info("查询一条Oracle中id为：{}的User记录", id);
        return null;
    }
}
