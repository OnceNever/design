package cn.seeyourface.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/24 15:24
 * @since 1.1.0
 */
@Slf4j
public class WeChat extends Software {
    public WeChat() {
        super("微信");
    }

    @Override
    public void run(String phoneName) {
        log.info("{}手机运行{}软件", phoneName, name);
    }
}
