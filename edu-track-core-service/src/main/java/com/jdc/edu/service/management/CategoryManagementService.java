package com.jdc.edu.service.management;

import org.springframework.stereotype.Service;

import com.jdc.edu.service.dto.CategoryDto;
import com.jdc.edu.service.management.dto.CategoryEditDto;

@Service
public interface CategoryManagementService {

	CategoryDto create(CategoryEditDto dto);
	
}
