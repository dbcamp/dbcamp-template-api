package br.tec.db.dbcampweatherapi.business.services;

import br.tec.db.dbcampweatherapi.data.entity.City;

import java.util.List;

public interface CityService {

    List<City> findAll();

    List<City> findAllNameByStateIgnoreCase(String state);
}
