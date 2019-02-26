package com.piaoniu.demo.service;

import com.piaoniu.demo.pojo.SysRole;

import java.util.List;

public interface SysRoleService {
    /**
     * 根据用户ID获取该用户所在组的角色权限
     * @param id
     * @return
     */
    List<SysRole> findRoleByUid(Integer id);
    /**
     * 添加角色
     * @return
     */
    int add(SysRole sysRole);

    /**
     * 删除角色
     * @return
     */
    int delete(Integer id);
}
