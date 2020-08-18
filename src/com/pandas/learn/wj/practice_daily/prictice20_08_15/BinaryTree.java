package com.pandas.learn.wj.practice_daily.prictice20_08_15;

/**
 * @author wangjing
 * @create 2020-08-15 9:39
 */
public class BinaryTree {
    // 根节点
    Node root;

    //
    public BinaryTree(){
        root = null;
    }

    public void setRoot(int key, int value){
        root = new Node(key, value);
    }

    // 判断当前key值是左子数还是右子树
    public Node isLeftChild(Node node, int key){
        Node result = null;
        if(node != null){
            result = isLeftChild(node.left, key);
            if(node.key * 2 < key && node.key * 2 + 2 >= key){
                result = node;
            }
            if(result == null)
                result = isLeftChild(node.right, key);

        }
        return result;
    }

    public void insertNode(int key, int value) {
        if (root == null) {
            root = new Node(key, value);
            return ;
        }

        // 得到插入节点的父节点
        Node result = isLeftChild(root, key);

        Node newNode = new Node(key, value);
        // 如果key值为单数，则为左节点
        if(key % 2 == 0){
            result.right = newNode;
        }
        else {
            result.left = newNode;
        }
    }

    // 验证树
    public boolean isSearchTree(){
        return isSearchTree(root);
    }

    public boolean isSearchTree(Node node){
        int flag = 0;
        if(node != null){
            if(!isSearchTree(node.left))
                flag++;
            if(node.left != null && node.right != null){
                if(node.left.value >= node.value
                        || node.left.value >= node.right.value
                        || node.right.value <= node.value){
                    flag++;
                }
            }
            if(!isSearchTree(node.right))
                flag++;
        }
        return flag <= 0;
    }

    // 中序遍历
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.key + " : " + node.value);
            inOrder(node.right);
        }
    }
}
