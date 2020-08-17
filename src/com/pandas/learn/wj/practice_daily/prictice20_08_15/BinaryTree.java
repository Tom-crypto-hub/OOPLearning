package com.pandas.learn.wj.practice_daily.prictice20_08_15;

/**
 * @author wangjing
 * @create 2020-08-15 9:39
 */
public class BinaryTree {
    // 根节点
    Node root;
//    // 树的深度
//    int deep;
//    // 树的节点数
//    int length;

    //
    public BinaryTree(){
        root = null;
    }

    public void setRoot(int key, int value){
        root = new Node(key, value);
    }

    // 添加一个节点
//    public void addNode(String data){
//        Node node = new Node();
//        if(!data.equals("null")){
//            node.value = Integer.parseInt(data);
//            node.key = deep;
//        }
//        // 树中没有节点
//        if(root == null){
//            root = new Node();
//            root.key = deep;
//            root.value = node.value;
//            deep++;
//            length++;
//        }
//        else if(length <= (2 << deep)){
//            if(length == 2 << deep)
//                deep++;
//            if(insertNode(root, node))
//                length++;
//        }
//    }

    public void insertNode(int key, int value) {
        if (root == null) {
            root = new Node(key, value);
            return ;
        }
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = true;
        while (currentNode != null) {
            parentNode = currentNode;
            if (key <= currentNode.key * 2 + 1) {
                currentNode = currentNode.left;
                isLeftChild = true;
            } else {
                currentNode = currentNode.right;
                isLeftChild = false;
            }
        }
        Node newNode = new Node(key, value);
        if (isLeftChild) {
            parentNode.left = newNode;
        } else {
            parentNode.right = newNode;
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
