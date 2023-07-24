package cn.seeyourface.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/24 15:15
 * @since 1.1.0
 */
@Slf4j
public abstract class Software {
    protected final String name;
    public Software (String name) {
        this.name = name;
    }

    public abstract void run (String phoneName);
}
