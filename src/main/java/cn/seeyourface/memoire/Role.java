package cn.seeyourface.memoire;

import lombok.Data;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/21 14:15
 * @since 1.1.0
 */
@Data
public class Role {

    // 生命值
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;

    public Role() {
        this.vitality = 100;
        this.attack = 10;
        this.defense = 10;
    }

    public void display() {
        System.out.println("角色当前状态：");
        System.out.println("生命值：" + this.vitality);
        System.out.println("攻击力：" + this.attack);
        System.out.println("防御力：" + this.defense);
    }

    // 打怪
    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
        System.out.println("BOSS战，角色阵亡");
    }

    // 存档
    public Memento save() {
        System.out.println("存档成功");
        return new Memento(this.vitality, this.attack, this.defense);
    }

    // 恢复存档
    public void restore(Memento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
        System.out.println("读档成功");
    }
}
