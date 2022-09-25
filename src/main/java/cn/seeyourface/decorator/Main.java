package cn.seeyourface.decorator;

/**
 * @Class Main
 * @Author yanglei
 * @Date 2022/9/25 9:57
 * @Version 1.0
 * @Description
 */
public class Main {

    public static void main(String[] args) {
        Person person = Person.builder().name("John").build();
        DecoratorA decoratorA = new DecoratorA();
        DecoratorB decoratorB = new DecoratorB();

        decoratorA.setPerson(person);
        decoratorB.setPerson(decoratorA);

        decoratorB.show();
    }
}
