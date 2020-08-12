package com.pandas.learn.wj.practice_daily.prictice20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 14:40
 *
 * 1、给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 *
 * 2、难度提升：
 * 使用一趟扫描实现。
 */

import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

/**
 * 链表的节点
 */
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

/**
 * 链表的代码
 */
public class LinkedList {
    private Node link;
    private int length;

    public Node getLink() {
        return link;
    }

    public int getLength() {
        return length;
    }

    public LinkedList(){
        link = null;
        length = 0;
    }

    /**
     * 判断链表下一个节点是否还有值
     * @param node
     */
    public boolean hasNext(Node node){
        if(node.next == null)
            return false;
        return true;
    }

    /**
     * 获取最后一个节点
     * @return
     */
    public Node getEndNode(){
        Node currentNode;
        Node next;

        if(link == null) return null;
        else{
            currentNode = link;
            while (hasNext(currentNode)){
                next = currentNode.next;
                currentNode = next;
            }
        }
        return currentNode;
    }

    /**
     * 在链表尾插入
     * @param node
     */
    public void addNode(Node node){
        if(link == null){
            link = node;
        }
        else {
            this.getEndNode().next = node;
        }
        length++;
    }

    public Node getNode(int index){

        Node node = null;
        Node curNode = null;
        Node next = null;

        curNode = link;
        for(int i = 0; i < index; i++){
            if(curNode == null){

            }
            node = curNode;
            assert curNode != null;
            if(hasNext(curNode)){
                next = curNode.next;
                curNode = next;
            }else{
                curNode = null;
            }
        }
        return node;
    }

    /**
     * 删除倒数第 n 个节点
     * @param n
     * @return
     */
    public void deleteNode(int n){
        Node prevNode = getNode(length - n);
        Node node;

        if(hasNext(prevNode)){
            node = prevNode.next;
            if(hasNext(node)){
                prevNode.next = node.next;
            }else{
                prevNode.next = null;
            }
        }
        length--;
    }

    /**
     * 一趟扫描实现
     * @param n
     */
    public void deleteNode2(int n){
        Node prevNode = link;
        Node lastNode = link;
        for(int i = 0; i < n - 1; i++){
            lastNode = lastNode.next;
        }
        Node node = null;
        while (hasNext(lastNode)){
            node = prevNode;
            if(hasNext(prevNode)){
                prevNode = prevNode.next;
                lastNode = lastNode.next;
            }
        }
        assert node != null;
        node.next = prevNode.next;

        length--;
    }

    public void showLink(){
        Node n = link;
        for(int i = 0; i < length; i++){
            System.out.print(n.data);
            if(i < length - 1)
                System.out.print("->");
            n = n.next;
        }
        System.out.println();
    }
}

class Test{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("输入链表：");
        // 1->2->3->4->5->6->7
        String[] strs = sc.nextLine().split("->");
        for(int i = 0; i < strs.length; i++){
            list.addNode(new Node(Integer.parseInt(strs[i])));
        }
        System.out.print("倒删的是第几个节点：");
        int n = sc.nextInt();
        list.deleteNode(n);
        System.out.print("链表变为：");
        list.showLink();

        // 一趟扫描
        System.out.print("倒删的是第几个节点(一趟扫描)：");
        int n2 = sc.nextInt();
        list.deleteNode2(n2);
        System.out.print("链表变为：");
        list.showLink();
    }
}
