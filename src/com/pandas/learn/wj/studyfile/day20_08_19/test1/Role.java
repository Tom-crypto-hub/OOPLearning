package com.pandas.learn.wj.studyfile.day20_08_19.test1;

/**
 * @author wangjing
 * @create 2020-08-19 10:03
 */
public class Role {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Role(int health) {
        this.health = health;
    }

    public void operate(Role role){
        String name = "";
        if(role instanceof Minister){
            name = "牧师";
        }
        else if(role instanceof Monster){
            name = "九头蛇";
        }
        else if(role instanceof Warrior){
            name = "战士";
        }
        System.out.println("当前角色为：" + name + ", 声明值为：" + role.getHealth());
    }
}
