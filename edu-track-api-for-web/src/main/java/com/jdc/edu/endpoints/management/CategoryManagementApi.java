package com.jdc.edu.endpoints.management;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.edu.endpoints.output.CategoryInfo;
import com.jdc.edu.enpoints.input.CategoryForm;

@RestController
@RequestMapping("api/management/category")
public interface CategoryManagementApi {

	CategoryInfo create(@RequestBody @Validated CategoryForm form, BindingResult result);	
}
