package com.sanvalero.toastsapi.service;

import java.time.LocalDate;
import java.util.List;

import com.sanvalero.toastsapi.model.Menu;
import com.sanvalero.toastsapi.repository.MenuRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository mr;

    @Override
    public List<Menu> findAllMenus() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Menu> findByDate(LocalDate date) {
        return mr.findByDate(date);
    }

    @Override
    public List<Menu> findByDateBetween(LocalDate minDate, LocalDate maxDate) {
        return mr.findByDateBetween(minDate, maxDate);
    }

    @Override
    public List<Menu> findByPrice(float price) {
        return mr.findByPrice(price);
    }

    @Override
    public List<Menu> findByPriceBetween(float minPrice, float maxPrice) {
        return mr.findByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Menu> findByPunctuation(float punctuation) {
        return mr.findByPunctuation(punctuation);
    }

    @Override
    public List<Menu> findByPunctuationBetween(float minPunctuation, float maxPunctuation) {
        return mr.findByPunctuationBetween(minPunctuation, maxPunctuation);
    }

    @Override
    public Menu findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Menu addMenu(Menu menu) {
        return mr.save(menu);
    }

    @Override
    public Menu deleteMenu(Menu menu) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Menu modifyMenu(Menu menu, int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
