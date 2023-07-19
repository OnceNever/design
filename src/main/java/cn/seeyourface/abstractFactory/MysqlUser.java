package cn.seeyourface.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/19 11:40
 * @since 1.1.0
 */
@Slf4j
public class MysqlUser implements IUser {
    @Override
    public void insert(User user) {
        log.info("新增一条MysqlUser记录");
    }

    @Override
    public User getUser(int id) {
        log.info("查询一条Mysql中id为：{}的User记录", id);
        return null;
    }
}
