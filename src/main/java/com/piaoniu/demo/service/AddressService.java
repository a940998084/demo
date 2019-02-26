package com.piaoniu.demo.service;

import com.piaoniu.demo.model.AddressModel;
import com.piaoniu.demo.pojo.Address;

import java.util.List;

public interface AddressService {
    List<AddressModel> SelectByUid(int user_id);
    int DeleteByAid(int address_id);
    int insertAddress(Address address);
}
