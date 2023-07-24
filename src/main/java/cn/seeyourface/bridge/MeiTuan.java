package cn.seeyourface.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/24 15:26
 * @since 1.1.0
 */
@Slf4j
public class MeiTuan extends Software {
    public MeiTuan() {
        super("美团");
    }

    @Override
    public void run(String phoneName) {
        log.info("{}手机运行{}软件", phoneName, name);
    }
}
