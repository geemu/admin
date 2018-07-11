package com.chenfangming.admin.core.util;

import com.chenfangming.admin.core.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fangming.chen
 * @since 2018-07-01 10：23
 * Email cfmmail@sina.com
 * Description 树结构工具类
 */
public class TreeUtil {

    /**
     * 两层循环实现建树
     * @param list 源集合
     * @return 树集合
     */
    public static <T extends TreeNode> List<T> buildTree(List<T> list) {
        List<T> tree = new ArrayList<>();
        for (T item : list) {
            // 找到根
            if (null == item.getParentId()) {
                tree.add(item);
            }
            // 找到子
            for (T treeNode : list) {
                if (treeNode.getParentId().equals(item.getId())) {
                    item.getChildren().add(treeNode);
                }
            }
        }
        return tree;
    }

    /**
     * 使用递归实现建树
     * @param list 源集合
     * @return 树集合
     */
    public static <T extends TreeNode> List<TreeNode> toTree(List<T> list) {
        List<TreeNode> rootTreeNodeList = new ArrayList<>();
        // 找到根
        for (T tree : list) {
            if (0 == tree.getParentId()) {
                rootTreeNodeList.add(tree);
            }
        }
        // 遍历当前集合
        for (T tree : list) {
            getChildren(rootTreeNodeList, tree);
        }
        return rootTreeNodeList;
    }

    /**
     * 递归查找子节点
     * @param rootTreeNodeList 所有的根节点
     * @param tree             当前节点
     */
    private static <T extends TreeNode> void getChildren(List<T> rootTreeNodeList, TreeNode tree) {
        for (T node : rootTreeNodeList) {
            if (tree.getParentId().equals(node.getId())) {
                if (null == node.getChildren()) {
                    node.setChildren(new ArrayList<>());
                }
                node.getChildren().add(tree);
            }
            if (null != node.getChildren()) {
                getChildren(node.getChildren(), tree);
            }
        }
    }
}
