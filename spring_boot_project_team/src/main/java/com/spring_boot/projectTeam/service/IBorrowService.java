package com.spring_boot.projectTeam.service;

import java.util.ArrayList;

import com.spring_boot.projectTeam.model.BorrowVO_b;
import com.spring_boot.projectTeam.model.MemInfoVO;

public interface IBorrowService {
	public ArrayList<BorrowVO_b> borrowList(String memId); // 현재 도서목록 반환
	public ArrayList<BorrowVO_b> postList(String memId); // 현재 도서목록 반환
	public MemInfoVO memViewList(String memId);
}
	
