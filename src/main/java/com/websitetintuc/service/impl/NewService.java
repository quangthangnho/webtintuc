package com.websitetintuc.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.websitetintuc.dao.INewDAO;
import com.websitetintuc.model.NewModel;
import com.websitetintuc.service.INewService;

public class NewService implements INewService{

	@Inject
	private INewDAO newDAO ;
	
	@Override
	public List<NewModel> findByCategoryId(long categoryId) {
		// TODO Auto-generated method stub
		return newDAO.findByCategoryId(categoryId);
	}

}
