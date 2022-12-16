package com.spring_boot.projectTeam.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.spring_boot.projectTeam.model.BorrowVO;
import com.spring_boot.projectTeam.model.BorrowVO_b;
import com.spring_boot.projectTeam.model.MemInfoVO;
import com.spring_boot.projectTeam.service.BorrowService;

@Controller
public class BorrowController {

	@Autowired
	BorrowService service;

	@RequestMapping("/deal/dealList")
	public String dealList(HttpSession session, Model model, BorrowVO borrow) {

		String memId = (String) session.getAttribute("sid");

		MemInfoVO mv = service.memViewList(memId);

		ArrayList<BorrowVO_b> borrowList = service.borrowList(memId);
		
		for(int i=0; i<borrowList.size();i++) {
			if((Integer.parseInt(borrowList.get(i).getBookState())==1)) {
				borrowList.get(i).setBookState("거래중");
				borrowList.get(i).setRentB("책 주기 완료");
			}else if((Integer.parseInt(borrowList.get(i).getBookState())==2)) {
				borrowList.get(i).setBookState("거래중");
				borrowList.get(i).setRentB("책 받기 완료");
			}
			
		}
		if(borrowList.size()==0){
			mv.setLastWrite("책좀 읽으셔야겠따");
		}
		model.addAttribute("borrowList", borrowList);
		model.addAttribute("mv", mv);
		return "deal/dealListView";
	}
	@RequestMapping("/deal/dealpost")
	public String dpostList(HttpSession session, Model model, BorrowVO borrow) {
		
		String memId = (String) session.getAttribute("sid");

		MemInfoVO mv = service.memViewList(memId);

		ArrayList<BorrowVO_b> postList = service.postList(memId);
		
		for(int i=0; i<postList.size();i++) {
			if((Integer.parseInt(postList.get(i).getBookState())==3)) {
				postList.get(i).setBookState("거래완료");
				
			}
		}
		if(postList.size()==0){
			mv.setLastWrite("책좀 읽으셔야겠따");
		}

		model.addAttribute("borrowList", postList);
		model.addAttribute("mv", mv);
		return "deal/dealPost";
	}
	/*
	 * @RequestMapping("/product/insertCart") public String insertCart(BorrowVO_b
	 * bb, HttpSession session) { // memId에 저장 // 로그인 성공 시 설정한 세션 sid 값 가져와서 사용
	 * String memId = (String)session.getAttribute("sid"); bb.setMemId(memId); //
	 * vo의 memId 값 설정
	 * 
	 * // (1) 동일 상품이 존재하는지 확인 : 동일 상품 개수 반환 int count =
	 * service.checkPrdInCart(vo.getPrdNo(), memId);
	 * 
	 * // (2) 동일 상품이 존재하지 않으면(count == 0) 장바구니에 추가 if(count == 0) {
	 * service.insertCart(vo); //데이터 베이스 저장 } else { // (3) 동일 상품이 존재하면 주문수량 변경
	 * service.updateQtyInCart(vo); }
	 * 
	 * 
	 * 
	 * 
	 * return "redirect:/deal/dealList"; }
	 */
}
