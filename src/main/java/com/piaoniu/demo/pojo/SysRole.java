package com.piaoniu.demo.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * 角色信息
 */
@Entity
public class SysRole {
    @Id
    @GeneratedValue
    private Integer id;                      //编号
    private String role;                     //角色标识程序中判断使用
    private String description;               //角色描述，UI界面使用
    private Boolean available=Boolean.FALSE; // 是否可用,如果不可用将不会添加给用户

    //角色--权限关系：多对多
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "SysRolePermission",joinColumns = {@JoinColumn(name = "roleId")},inverseJoinColumns = {@JoinColumn(name = "permissionId")})
    private List<SysPermission> permissions;

    //角色-用户关系定义
    @ManyToMany
    @JoinTable(name="SysUserRole",joinColumns={@JoinColumn(name="roleId")},inverseJoinColumns={@JoinColumn(name="uid")})
    private List<SysUser> userInfo;// 一个角色对应多个用户

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    public List<SysUser> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<SysUser> userInfo) {
        this.userInfo = userInfo;
    }
}
