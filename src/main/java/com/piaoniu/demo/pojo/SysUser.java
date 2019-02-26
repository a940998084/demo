package com.piaoniu.demo.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 后台用户信息
 */
@Entity
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Integer uid;
    @Column(unique = true)
    private String username;//账号
    private String nickname;//昵称
    private String password;//密码
    private String salt;    //加密密码的盐
    private Byte state;     //用户状态，0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定
    @ManyToMany(fetch = FetchType.EAGER)//立即从数据库中进行加载数据
    @JoinTable(name = "SysUserRole",joinColumns ={@JoinColumn(name = "uid")},inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<SysRole> roleList;//一个用户可以有多个角色

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    /**
     * 密码盐;
     * @return
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }
}
