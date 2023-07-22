package cn.seeyourface.adapter;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/20 15:27
 * @since 1.1.0
 */
@Slf4j
@Data
public class Center{

    private String name;

    public void 进攻() {
        log.info("外籍中锋{}进攻", name);
    }

    public void 防守() {
        log.info("外籍中锋{}防守", name);
    }
}
