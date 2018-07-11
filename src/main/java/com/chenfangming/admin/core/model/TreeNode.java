package com.chenfangming.admin.core.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author fangming.chen
 * @since 2018-06-13 12：33
 * Email cfmmail@sina.com
 * Description Tree 其他需要建树的类需要继承此类然后调用TreeUtil方法
 */
@Data
public class TreeNode implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 7469670756390179911L;
    /**
     * 当前节点id
     */
    private Integer id;
    /**
     * 当前节点的父节点 0为根节点
     */
    private Integer parentId;
    /**
     * 子节点
     */
    private List<TreeNode> children = new ArrayList<>();

    /**
     * 构造
     * @param id       节点
     * @param parentId 父节点
     */
    public TreeNode(int id, int parentId) {
        this.id = id;
        this.parentId = parentId;
    }
}
