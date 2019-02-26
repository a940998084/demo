package com.piaoniu.demo.dao;

import com.piaoniu.demo.pojo.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysRoleDao{
    /**
     * 根据用户ID获取该用户所在组的角色权限
     * @param id
     * @return
     */
    @Select("select role.id,role.role,role.description from sys_user_role urole left join sys_role role on urole.role_id=role.id where urole.uid=#{0}")
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
