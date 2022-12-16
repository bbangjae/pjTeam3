package com.spring_boot.projectTeam.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_boot.projectTeam.dao.IBorrowDAO;
import com.spring_boot.projectTeam.model.BorrowVO_b;
import com.spring_boot.projectTeam.model.MemInfoVO;
@Service
public class BorrowService implements IBorrowService {
	
	@Autowired
	@Qualifier("IBorrowDAO")
	IBorrowDAO dao;
	
	
	@Override
	public ArrayList<BorrowVO_b> borrowList(String memId) {
		
		return dao.borrowList(memId);
	}


	@Override
	public MemInfoVO memViewList(String memId) {
		// TODO Auto-generated method stub
		return dao.memViewList(memId);
	}


	@Override
	public ArrayList<BorrowVO_b> postList(String memId) {
		// TODO Auto-generated method stub
		return dao.postList(memId);
	}

}
