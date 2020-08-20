package com.pandas.learn.wj.studyfile.day20_08_19.test1;

/**
 * @author wangjing
 * @create 2020-08-19 10:06
 *
 * 九头蛇怪
 */
public class Monster extends Role {
    public Monster(int health) {
        super(health);
    }

    @Override
    public void operate(Role role) {
        if(role instanceof Warrior){
            Warrior warrior = (Warrior)role;
            warrior.setHealth(warrior.getHealth() - 15);
            System.out.println("九头蛇攻击了战士");
            System.out.println("战士当前血量：" + warrior.getHealth());
            System.out.println("九头蛇当前血量：" + getHealth());
        }
        else if(role instanceof Minister){
            Minister minister = (Minister)role;
            minister.setHealth(minister.getHealth() - 20);
            System.out.println("牧师闯入了九头蛇领地，受到攻击");
            System.out.println("牧师当前血量：" + minister.getHealth());
            System.out.println("九头蛇当前血量：" + getHealth());
        }
        else{
            super.operate(role);
        }
    }
}
