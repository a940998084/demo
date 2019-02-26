package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.AddressDao;
import com.piaoniu.demo.model.AddressModel;
import com.piaoniu.demo.pojo.Address;
import com.piaoniu.demo.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    AddressDao addressDao;
    @Override
    public List<AddressModel> SelectByUid(int user_id) {
        return addressDao.SelectByUid(user_id);
    }

    @Override
    public int DeleteByAid(int address_id) {
        return addressDao.DeleteByAid(address_id);
    }

    @Override
    public int insertAddress(Address address) {
        return addressDao.insertAddress(address);
    }
}
