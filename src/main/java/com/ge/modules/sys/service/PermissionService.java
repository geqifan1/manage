package com.ge.modules.sys.service;

import com.ge.common.service.BaseService;
import com.github.pagehelper.PageInfo;
import com.ge.modules.sys.model.Permission;
import com.ge.modules.sys.vo.TreeNode;

import java.util.List;

/**
 * Created by cuiP on 2017/2/8.
 */
public interface PermissionService extends BaseService<Permission> {
    /**
     * 分页查询权限列表
     *
     * @param pageNum  当前页面
     * @param pageSize 每页显示条数
     * @param name     权限名称
     * @return
     */
    PageInfo<Permission> findPage(Integer pageNum, Integer pageSize, String name);

    /**
     * 根据用户ID查询该用户所拥有的权限
     *
     * @param UserId
     * @return
     */
    List<Permission> findListPermissionByUserId(Long userId);

    /**
     * 根据用户ID查询用户菜单列表
     * @param UserId
     * @return
     */
    List<Permission> findMenuListByUserId(Long userId);

    /**
     * 根据资源类型查询权限列表
     * @param type
     * @return
     */
    List<Permission> findListByType(String type);

    /**
     * 返回树列表
     * @return
     */
    List<TreeNode> findTreeList();

    /**
     * 根据权限ID删除权限并级联删除权限和角色的关联信息
     * @param permissionId
     * @return
     */
    Boolean deletePermissionAndRolePermissionByPermissionId(Long permissionId);
    
    /**
     * 根据父节点权限名称查询父子节点权限
     * @param permissionName
     * @return
     */
    List<Permission> findChildPermissionByName(String permissionName);
    
    /**
     * 根据权限名查询类似权限
     * @param permissionName
     * @return
     */
    List<Permission> findSimilarByName(String permissionName);
}
