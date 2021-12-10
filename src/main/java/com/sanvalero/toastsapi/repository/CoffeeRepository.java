package com.sanvalero.toastsapi.repository;

import java.time.LocalDate;
import java.util.List;

import com.sanvalero.toastsapi.model.Menu;
import com.sanvalero.toastsapi.model.Publication;
import com.sanvalero.toastsapi.model.Coffee;
import com.sanvalero.toastsapi.model.CoffeeType;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, Integer> {
    List<Coffee> findByType(CoffeeType coffeeType);

    List<Coffee> findByDate(LocalDate date);

    List<Coffee> findByDateBetween(LocalDate minDate, LocalDate maxDate);

    List<Coffee> findByPrice(float price);

    List<Coffee> findByPriceBetween(float minPrice, float maxPrice);

    List<Coffee> findByPunctuation(float punctuation);

    List<Coffee> findByPunctuationBetween(float minPunctuation, float maxPunctuation);

    List<Coffee> findByWithMenu(boolean withMenu);

    List<Coffee> findByMenu(Menu menu);

    List<Coffee> findByPublication(Publication publication);
}