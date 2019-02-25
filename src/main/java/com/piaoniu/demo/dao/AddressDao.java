package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.AddressModel;
import com.piaoniu.demo.pojo.Address;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressDao {
    List<AddressModel> SelectByUid(int user_id);
    int DeleteByAid(int address_id);
    int insertAddress(Address address);
}
