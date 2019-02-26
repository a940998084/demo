package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.SysPermission;

import java.util.List;

public interface SysPermissionService {
    /**
     * 根据角色ID获取角色权限
     * @param id
     * @return
     */
    List<SysPermission> findPermissionByUserId(Integer id);
    /**
     * 添加权限
     * @return
     */
    int add(SysPermission sysPermission);

    /**
     * 删除权限
     * @return
     */
    int delete(Integer id);
}
