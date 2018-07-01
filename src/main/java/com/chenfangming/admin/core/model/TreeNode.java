package com.chenfangming.admin.core.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


/**
 * @author fangming.chen
 * @since 2018-06-13 12：33
 * Email cfmmail@sina.com
 * Description Tree 其他需要建树的类需要继承此类然后调用TreeUtil方法
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
    private List<TreeNode> children = new ArrayList<>();

    /**
     * 构造
     * @param id       节点
     * @param parentId 父节点
     */
    public TreeNode(long id, long parentId) {
        this.id = id;
        this.parentId = parentId;
    }
}
