package com.san.paginationdemo.service;

import com.san.paginationdemo.domain.Country;

import java.util.List;

public interface CountryService {
    List<Country> findPaginated(int pageNo, int pageSize);
}
