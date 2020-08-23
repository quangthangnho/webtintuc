package com.websitetintuc.service;

import java.util.List;

import com.websitetintuc.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(long categoryId);
}
