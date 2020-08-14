package com.pandas.learn.wj.practice_daily.prictice20_08_14;

import com.pandas.project.user_management_system.util.NumberUtil;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wangjing
 * @create 2020-08-14 12:26
 */
public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(3);
        System.out.println(arrayList.toString());

        arrayList.set(3, 4);
        arrayList.set(4, 5);
        System.out.println(arrayList.toString());

        for (Iterator<Integer> iter = arrayList.iterator(); iter.hasNext(); )
        {
            System.out.print(iter.next());
            System.out.print("\t");
        }
        System.out.println();

        LinkedList<Integer> arr = new LinkedList<Integer>(arrayList.size());
        arr.setArrayList(arrayList);
        arr.setValue(0, 10);
        arr.setValue(3, 30);
        arr.show(4);
        arr.show(50);
    }
}

class LinkedList<T extends Number> {
    ArrayList<T> arrayList;

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public LinkedList(int cap){
        arrayList = new ArrayList<T>(cap);
    }

    public void addValue(T value){
        arrayList.add(value);
    }

    public void setValue(int index, T value){
        arrayList.set(index, value);
    }

    public void show(){
        for(Iterator<T> iter = arrayList.iterator(); iter.hasNext(); ){
            System.out.print(iter);
            System.out.print("\t");
        }
        System.out.println();
    }

    public void show(T maxValue){
        for(Iterator<T> iter = arrayList.iterator(); iter.hasNext(); ){
            T temp = iter.next();
            if(temp.doubleValue() < maxValue.doubleValue()){
                System.out.print(temp);
                System.out.print("\t");
            }
        }
        System.out.println();
    }

}
