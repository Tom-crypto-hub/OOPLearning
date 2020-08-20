package com.pandas.learn.wj.studyfile.day20_08_19.test1;

/**
 * @author wangjing
 * @create 2020-08-19 10:05
 *
 * 战士
 */
public class Warrior extends Role {
    public Warrior(int health){
        super(health);
    }

    @Override
    public void operate(Role role) {
        if(role instanceof Monster){
            Monster monster = (Monster)role;
            monster.setHealth(monster.getHealth() - 10);
            System.out.println("战士攻击了九头蛇");
            System.out.println("战士当前血量：" + getHealth());
            System.out.println("九头蛇当前血量：" + monster.getHealth());
        }
        else if(role instanceof Minister){
            setHealth(getHealth() + 10);
            System.out.println("牧师使用回复术帮战士加血，当前战士血量为：" + getHealth());
        }
        else{
            super.operate(role);
        }
    }
}
