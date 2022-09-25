package cn.seeyourface.decorator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class Person
 * @Author yanglei
 * @Date 2022/9/25 9:29
 * @Version 1.0
 * @Description
 */
@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    void show(){
        log.info(name + "今天约会的穿搭：");
    }
}
