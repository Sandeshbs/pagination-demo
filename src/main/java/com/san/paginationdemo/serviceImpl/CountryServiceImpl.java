package com.san.paginationdemo.serviceImpl;

import com.san.paginationdemo.domain.Country;
import com.san.paginationdemo.repository.CountryRepository;
import com.san.paginationdemo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Override
    public List<Country> findPaginated(int pageNo, int pageSize) {
        //Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.Direction.ASC, "name");
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Country> pageResult = countryRepository.findAll(pageable);
        System.out.println("Total Elements: "+pageResult.getTotalElements()+", Total Pages: "+pageResult.getTotalPages());
        System.out.println("Offset Value:"+pageResult.getPageable().getOffset());
        System.out.println("is Paged :"+pageResult.getPageable().isPaged());
        return pageResult.toList();
    }
}
