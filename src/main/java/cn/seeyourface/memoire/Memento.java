package cn.seeyourface.memoire;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/21 14:17
 * @since 1.1.0
 */
@Data
@AllArgsConstructor
public class Memento {

    private int vitality;
    private int attack;
    private int defense;

}
