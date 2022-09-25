package cn.seeyourface.decorator;

import lombok.Data;

/**
 * @Class Decorator
 * @Author yanglei
 * @Date 2022/9/25 9:46
 * @Version 1.0
 * @Description
 */
@Data
public abstract class Decorator extends Person {
    Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    void show() {
        if (person != null) {
            person.show();
        }
    }
}
