package com.websitetintuc.dao;

import java.util.List;

import com.websitetintuc.model.Category;

public interface ICategoryDAO {
	List<Category> findAll();
}
