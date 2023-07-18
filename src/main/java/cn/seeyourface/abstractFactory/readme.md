抽象工厂模式
===

## 1. 介绍

### 1.1 定义

抽象工厂模式（Abstract Factory Pattern）是指提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

### 1.2 作用

抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。他与工厂方法模式的区别就在于，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则需要面对多个产品等级结构。

### 1.3 使用场景

- 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节；
- 强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码；
- 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现。
- 一个产品族的多个对象被设计成一起工作，这样的例子有汽车的轮胎和发动机，电视机的遥控器和电源等。
- 系统提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现。

## 3. 代码实现

### 3.1 抽象工厂

```java

/**
 * @description: 抽象工厂类
 * @date: 2021/6/4 14:54
 */
public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的方法
     * @return
     */
    public abstract AbstractProductB createProductB();

}
    
    ```

### 3.2 具体工厂

    ```java
    /**
     * @description: 具体工厂类1
     * @date: 2021/6/4 14:56
     */
    public class ConcreteFactory1 extends AbstractFactory{
        @Override
        public AbstractProductA createProductA() {
            return new ConcreteProductA1();
        }
    
        @Override
        public AbstractProductB createProductB() {
            return new ConcreteProductB1();
        }
    }
    
    /**
     * @description: 具体工厂类2
     * @date: 2021/6/4 14:56
     */
    public class ConcreteFactory2 extends AbstractFactory{
        @Override
        public AbstractProductA createProductA() {
            return new ConcreteProductA2();
        }
    
        @Override
        public AbstractProductB createProductB() {
            return new ConcreteProductB2();
        }
    }
    
        ```

### 3.3 抽象产品
    
        ```java
        /**
        * @description: 抽象产品A类
        * @date: 2021/6/4 14:57
        */
        public abstract class AbstractProductA {
            /**
            * 每个具体的产品子类需要实现的方法
            */
            public abstract void method();
        }
        
        /**
        * @description: 抽象产品B类
        * @date: 2021/6/4 14:57
        */
        public abstract class AbstractProductB {
            /**
            * 每个具体的产品子类需要实现的方法
            */
            public abstract void method();
        }
        
            ```

### 3.4 具体产品

            ```java
            /**
            * @description: 具体产品A1类
            * @date: 2021/6/4 14:58
            */
            public class ConcreteProductA1 extends AbstractProductA{
                @Override
                public void method() {
                    System.out.println("具体产品A1的方法");
                }
            }

            /**
            * @description: 具体产品A2类
            * @date: 2021/6/4 14:58
            */
            public class ConcreteProductA2 extends AbstractProductA{
                @Override
                public void method() {
                    System.out.println("具体产品A2的方法");
                }
            }

            /**
            * @description: 具体产品B1类
            * @date: 2021/6/4 14:58
            */
            public class ConcreteProductB1 extends AbstractProductB{
                @Override
                public void method() {
                    System.out.println("具体产品B1的方法");
                }
            }

            /**
            * @description: 具体产品B2类
            * @date: 2021/6/4 14:58
            */
            public class ConcreteProductB2 extends AbstractProductB{
                @Override
                public void method() {
                    System.out.println("具体产品B2的方法");
                }
            }
            
                ```
