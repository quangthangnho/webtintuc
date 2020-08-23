package com.websitetintuc.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.websitetintuc.dao.ICategoryDAO;
import com.websitetintuc.model.Category;
import com.websitetintuc.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
	@Inject
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryDAO.findAll();
	}

}
