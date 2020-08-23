package com.websitetintuc.dao;

import java.util.List;

import com.websitetintuc.model.NewModel;

public interface INewDAO {
	List<NewModel> findByCategoryId(long categoryId);
}
