package org.account.com.service.impl;

import org.account.com.mapper.ObjMapper;
import org.account.com.model.ObjectModel;
import org.account.com.service.ObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ObjServiceImpl implements ObjService {

    @Autowired
    private ObjMapper mapper;

    @Override
    public List<ObjectModel> findAll() {
        return mapper.findAll();
    }
}
