package com.pandas.learn.wj.studyfile.day20_08_18.exc;

/**
 * @author wangjing
 * @create 2020-08-18 11:19
 */
public class EmployeeFactory implements EmployeeFactoryInter {

    @Override
    public Employee getEmployee(String work) {
        switch (work){
            case "JavaEE":
                return new JavaEE(1008, "JavaEE Worker");
            case "Android":
                return new Android(2008, "Android Worker");
            case "Network":
                return new Network(1007, "Network Worker");
            case "Hardware":
                return new Hardware(2007, "Hardware Worker");
            default:
                return new Employee(8008, "employee");
        }
    }
}

class Test2{
    public static void main(String[] args) {
        EmployeeFactoryInter employee = new EmployeeFactory();
        employee.getEmployee("Network").work();
    }
}
