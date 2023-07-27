中介者模式
===

## 1. 介绍
中介者模式（Mediator Pattern）用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

## 2. 适用场景
* 系统中对象之间存在复杂的引用关系，系统结构混乱且难以理解。
* 交互的公共行为，如果需要改变行为则可以增加新的中介者类。
* 一个对象由于引用了其他很多对象并且直接和这些对象通信，导致难以复用该对象。
* 想定制一个分布在多个类中的行为，但又不想生成太多的子类。

## 3. 角色介绍
* Mediator（抽象中介者）：它定义一个接口，该接口用于与各同事对象之间进行通信。
* ConcreteMediator（具体中介者）：它是抽象中介者的子类，通过协调各个同事对象来实现协作行为，它维持了对各个同事对象的引用。
* Colleague（抽象同事类）：它定义各个同事类公有的方法，并声明了一些抽象方法来供子类实现，同时它维持了一个对抽象中介者类的引用，其子类可以通过该引用来与中介者通信。
* ConcreteColleague（具体同事类）：它是抽象同事类的子类；每一个同事对象在需要和其他同事对象通信时，先与中介者通信，通过中介者来间接完成与其他同事类的通信；在具体同事类中实现了在抽象同事类中声明的抽象方法。

## 5. 源码分析
### 5.1 抽象中介者
```java
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
```

### 5.2 具体中介者
```java
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }
    @Override
    public void relay(Colleague cl) {
        for(Colleague ob: colleagues) {
            if(!ob.equals(cl)) {
                ((Colleague)ob).receive();
            }
        }
    }
}
```

### 5.3 抽象同事类
```java
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
```

### 5.4 具体同事类
```java
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }
    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
```

```java
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }
    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
```

### 5.5 客户端
```java
public class Client {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1,c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
```