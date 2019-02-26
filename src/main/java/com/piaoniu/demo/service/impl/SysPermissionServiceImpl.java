package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.SysPermissionDao;
import com.piaoniu.demo.pojo.SysPermission;
import com.piaoniu.demo.service.SysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Resource
    private SysPermissionDao permissionDao;

    @Override
    public List<SysPermission> findPermissionByUserId(Integer id) {
        return permissionDao.findPermissionByUserId(id);
    }

    @Override
    public int add(SysPermission sysPermission) {
        return permissionDao.add(sysPermission);
    }

    @Override
    public int delete(Integer id) {
        return permissionDao.delete(id);
    }
}
