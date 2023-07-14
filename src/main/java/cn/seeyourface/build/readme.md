建造者模式
===

## 1. 介绍

建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。

## 2. 适用场景

1. 需要生成的对象具有复杂的内部结构。
2. 需要生成的对象内部属性本身相互依赖。
3. 相同的方法，不同的执行顺序，产生不同的结果。
4. 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时。
5. 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的作用，这个时候使用建造者模式非常合适。

## 3. 角色介绍

- Builder：抽象建造者，定义了产品的创建步骤和方法。
- ConcreteBuilder：具体建造者，实现了 Builder 接口，构建和装配各个部件。
- Director：指挥者，构建一个使用 Builder 接口的对象。
- Product：产品角色，一个具体的产品对象。
- Client：客户端，使用 Builder 接口的对象。

## 5. 代码实现

### 5.1. 抽象建造者

```java
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    //返回产品对象
    public Product getResult(){
        return product;
    }
}
```

### 5.2. 具体建造者

```java
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
```

### 5.3. 指挥者

```java

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
```

### 5.4. 产品角色

```java
public class Product {
    private String partA;
    private String partB;
    private String partC;

    // ignored getter and setter
}
```

### 5.5. 客户端

```java
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);
    }
}
```