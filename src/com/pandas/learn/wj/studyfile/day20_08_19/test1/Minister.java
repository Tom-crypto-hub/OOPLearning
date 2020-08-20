package com.pandas.learn.wj.studyfile.day20_08_19.test1;

/**
 * @author wangjing
 * @create 2020-08-19 10:06
 *
 * 牧师
 */
public class Minister extends Role {
    public Minister(int health) {
        super(health);
    }

    @Override
    public void operate(Role role) {
        if(role instanceof Warrior){
            Warrior warrior = (Warrior)role;
            warrior.setHealth(warrior.getHealth() + 10);
            System.out.println("牧师使用回复术帮战士加血，当前战士血量为：" + warrior.getHealth());
            System.out.println("牧师当前血量：" + getHealth());
        }
        else if(role instanceof Monster){
            setHealth(getHealth() - 20);
            System.out.println("牧师被九头蛇攻击，受到伤害");
            System.out.println("牧师当前血量：" + getHealth());
            System.out.println("九头蛇当前血量：" + ((Monster)role).getHealth());
        }
        else{
            super.operate(role);
        }
    }
}
