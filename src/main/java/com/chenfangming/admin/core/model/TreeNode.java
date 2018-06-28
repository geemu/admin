package com.chenfangming.admin.core.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author fangming.chen
 * @since 2018-06-13 12：33
 * Email cfmmail@sina.com
 * Description Tree
 */
@Getter
@Setter
@ToString
public class TreeNode {
    /**
     * 当前节点id
     */
    private long id;
    /**
     * 当前节点的父节点
     */
    private long parentId;
    /**
     * 子节点
     */
    private List<TreeNode> children;

    public TreeNode(long id, long parentId) {
        this.id = id;
        this.parentId = parentId;
    }

    public static void main(String[] args) {
        List<TreeNode> list = new ArrayList<>();
        list.add(new TreeNode(1L, 0L));
        list.add(new TreeNode(2L, 0L));
        list.add(new TreeNode(3L, 1L));
        list.add(new TreeNode(4L, 1L));
        list.add(new TreeNode(5L, 3L));
        list.add(new TreeNode(6L, 2L));
        list.add(new TreeNode(7L, 8L));
        list.add(new TreeNode(8L, 7L));
        System.out.println(list.toString());

        List<TreeNode> data = listGetStree(list);
        System.out.println(data.toString());
    }

    private static List<TreeNode> listGetStree(List<TreeNode> list) {
        List<TreeNode> tree = new ArrayList<>();
        for (TreeNode item : list) {
            // 找到根
            if (0L == item.getParentId()) {
                tree.add(item);
            }
            // 找到子
            for (TreeNode treeNode : list) {
                if (treeNode.getParentId() == item.getId()) {
                    if (null == item.getChildren()) {
                        item.setChildren(new ArrayList<>());
                    }
                    item.getChildren().add(treeNode);
                }
            }
        }
        return tree;
    }

    /**
     * 方法三
     */
    private static List<TreeNode> toTree(List<TreeNode> list) {
        List<TreeNode> rootTreeNodeList = new ArrayList<>();
        // 找到根
        for (TreeNode tree : list) {
            if (0L == tree.getParentId()) {
                rootTreeNodeList.add(tree);
            }
        }
        // 遍历当前集合
        for (TreeNode tree : list) {
            toTreeChildren(rootTreeNodeList, tree);
        }
        return rootTreeNodeList;
    }

    /**
     * 根节点树
     * @param rootTreeNodeList 所有的根节点
     * @param tree             当前节点
     */
    private static void toTreeChildren(List<TreeNode> rootTreeNodeList, TreeNode tree) {
        for (TreeNode node : rootTreeNodeList) {
            if (tree.getParentId() == node.getId()) {
                if (null == node.getChildren()) {
                    node.setChildren(new ArrayList<>());
                }
                node.getChildren().add(tree);
            }
            if (null != node.getChildren()) {
                toTreeChildren(node.getChildren(), tree);
            }
        }
    }
}
