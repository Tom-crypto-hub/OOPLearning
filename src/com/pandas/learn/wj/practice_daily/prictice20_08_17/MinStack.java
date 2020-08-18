package com.pandas.learn.wj.practice_daily.prictice20_08_17;

import java.util.Stack;

/**
 * @author wangjing
 * @create 2020-08-17 15:19
 */
public class MinStack {

    Stack<Integer> originalStack;
    Stack<Integer> minStack;

    public MinStack(){
        originalStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value){
        originalStack.push(value);
        if(minStack.empty()){
            minStack.push(value);
        }
        else if(value < getMin()){
            minStack.push(value);
        }
    }

    public int top(){
        return originalStack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public void pop(){
        if(getMin() == top())
        {
            minStack.pop();
        }
        originalStack.pop();
    }
}
