package com.piaoniu.demo.config;

import com.piaoniu.demo.pojo.SysPermission;
import com.piaoniu.demo.pojo.SysRole;
import com.piaoniu.demo.pojo.SysUser;
import com.piaoniu.demo.service.SysPermissionService;
import com.piaoniu.demo.service.SysRoleService;
import com.piaoniu.demo.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 身份检验核心类
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService userService;
    @Autowired
    private SysRoleService roleService;
    @Autowired
    private SysPermissionService permissionService;

    private Logger logger=LoggerFactory.getLogger(MyShiroRealm.class);
    /*
    * Subject：主体 --  访问系统的用户，主体可以使用户、程序等，进行认证的都称为主体
    * Credential：凭证信息 -- 只有主体自己知道的安全信息，如密码、证书等
    * Principal：身份信息 -- 主体进行身份认证的标识，具有唯一性，一个主体可以有多个
    *                      身份，但是必须有一个主身份
    */
    /**
     * 登录认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("执行登录认证!-----shiro");
        //获取用户的输入的账号
        String username=(String)authenticationToken.getPrincipal();
//        System.out.println(username);
        SysUser user=userService.findByUserName(username);
        if (user!=null){
            //若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
            return new SimpleAuthenticationInfo (user,user.getPassword(),getName());
        }
        return null;
    }
    /**
     *授权认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("*****执行权限配置******");
        SysUser user=(SysUser) principalCollection.getPrimaryPrincipal();
        if (user!=null){
            SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
            List<SysRole> roleList=roleService.findRoleByUid(user.getUid()); //角色集合
            List<SysPermission> permissionList=permissionService.findPermissionByUserId(user.getUid());//权限集合
            List<String> ulist=new ArrayList<>();
            List<String> plist=new ArrayList<>();
            for (SysRole role:roleList){
                ulist.add(role.getRole());
            }
            for (SysPermission permission:permissionList){
                plist.add(permission.getPermission());
            }
            info.addRoles(ulist);
            info.addStringPermissions(plist);
            return info;
        }
        // 返回null的话，就会导致任何用户访问被拦截的请求时，都会自动跳转到unauthorizedUrl指定的地址
        return null;
    }
}
