package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysPermissionDao{
    /**
     * 根据用户ID获取角色权限
     * @param id
     * @return
     */
    @Select("select p.name,p.url,p.permission from sys_role_permission rp left join  sys_user_role urole on urole.role_id=rp.role_id left join sys_permission p on p.id=rp.permission_id where urole.uid=#{0}")
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
