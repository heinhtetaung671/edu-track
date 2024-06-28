package com.jdc.edu.endpoints.management.impl;

import org.springframework.validation.BindingResult;

import com.jdc.edu.endpoints.management.CategoryManagementApi;
import com.jdc.edu.endpoints.output.CategoryInfo;
import com.jdc.edu.enpoints.input.CategoryForm;
import com.jdc.edu.service.dto.CategoryDto;
import com.jdc.edu.service.management.CategoryManagementService;
import com.jdc.edu.service.management.dto.CategoryEditDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategoryManagementApiImpl implements CategoryManagementApi{

	private final CategoryManagementService categoryService;
	
	@Override
	public CategoryInfo create(CategoryForm form, BindingResult result) {
		return CategoryManagementDtoUtils.categoryDtoToCategoryInfo(categoryService.create(new CategoryEditDto(form.name(), form.description())));
	}
	
	
	public static class CategoryManagementDtoUtils {
		
		public static CategoryInfo categoryDtoToCategoryInfo (CategoryDto dto) {
			return new CategoryInfo(null, null, null, 0);
		}
		
	}

}
