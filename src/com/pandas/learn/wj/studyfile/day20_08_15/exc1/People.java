package com.pandas.learn.wj.studyfile.day20_08_15.exc1;

/**
 * @author wangjing
 * @create 2020-08-15 9:58
 *
 * People类
 * 	私有属性：name(姓名),skill(技能),nationality(国籍)
 * 	方法：打印国籍printNationality()，输出“我是**，我是**国籍”
 * 	方法：showSkill()，在此方法中输出“，我会**技能”
 * ChinaPeople类：继承于People类，声明构造器对父类属性进行初始化，
 * 在测试类输入我是张三，我是中国人，我会功夫。
 * 和AmericanPeople类：继承于People类，声明构造器对父类属性进行初始化，
 * 在测试类输入我是特朗普，我是美国人，我会吹牛逼
 */
public class People {
    // 姓名
    protected String name;
    // 技能
    protected String skill;
    // 国籍
    protected String nationality;

    // 打印国籍方法
    public void printNationality(){
        System.out.printf("我是%s，我是%s国籍。", name, nationality);
    }

    // 输出技能
    public void showSkill(){
        System.out.printf("我会%s \n", skill);
    }
}
