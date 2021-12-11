package com.sanvalero.toastsapi.service;

import java.util.List;

import com.sanvalero.toastsapi.model.ToastType;
import com.sanvalero.toastsapi.repository.ToastTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToastTypeServiceImpl implements ToastTypeService {

    @Autowired
    private ToastTypeRepository ttr;

    @Override
    public List<ToastType> findAllTypes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ToastType findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ToastType addType(ToastType type) {
        return ttr.save(type);
    }

    @Override
    public ToastType deleteType(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ToastType modifyType(ToastType type, int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
