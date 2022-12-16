<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 검색</title>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/css/search/search.css"/>'>
<c:import url="/WEB-INF/views/layout/head.jsp" />
	<link rel="stylesheet" type="text/css" href='<c:url value="/css/rental/rentalpage.css"/>'>
<script src="<c:url value='/js/jquery-3.6.1.min.js'/>"></script>
<script src="<c:url value='/js/bookSearch.js'/>"></script>
</head>
<body>
	<div id="wrap">

		<c:import url="/WEB-INF/views/layout/top.jsp" />
		<br><br><br><br><br><br><br><br><br><br><br>
		<div>
			<div>
				<h3 id="title">도서 검색</h3>
			</div>
			<div id= "Searchbox">
				<form id="bookSearchFrm">
					<select id="type" name="type">
						<option value="bookName">도서명</option>
						<option value="bookctg">카테고리</option>
					</select>
					 <input type="text" name="keyword">
					  <input type="submit" value="검색">
				</form>
			</div>
		</div>
		<br><br><br>
		<hr>
		<br>
		<div id="bookAllList">
					<c:forEach var="bk" items="${bookAllList }">
						<div id="rentalBookBox">
							<table class="bookSearchForm">
					            <tr>
					               <td rowspan="5" id="imgBox" onClick="location.href='<c:url value='/book/bookDetailView/${bk.bookId}'/>'" style="cursor:pointer;">
										<img alt="이미지가 없습니다" id="k1hvi4h" src="<c:url value='/image/${bk.bookImg}'/>" style="width:150px; height:200px;">
					               </td>
					               <th><a href="<c:url value='/book/bookDetailView/${bk.bookId}'/>">제목 :${bk.bookName }</a></th>
					            </tr>
					            
					            <tr onClick="location.href='<c:url value='/book/bookDetailView/${bk.bookId}'/>'" style="cursor:pointer;">
					                <td>저자 / 출편사 :${bk.bookAuthor } / ${bk.bookPublish }</td>             
					            </tr>
					            <tr onClick="location.href='<c:url value='/book/bookDetailView/${bk.bookId}'/>'" style="cursor:pointer;">
					                <td>원가 / 대여료 : ${bk.bookPrice } / ${bk.rentP }</td>             
					            </tr >
					            <tr onClick="location.href='<c:url value='/book/bookDetailView/${bk.bookId}'/>'" style="cursor:pointer;">
					                <td>카테고리 : ${bk.bookctg }</td>             
					            </tr>
					            <tr onClick="location.href='<c:url value='/book/bookDetailView/${bk.bookId}'/>'" style="cursor:pointer;">
					                <td>${bk.bookDis }</td>             
					            </tr>
				            </table>
			            </div>
			            <br><hr><br>
			        </c:forEach>
				
			</div>
		<!-- 검색 결과 출력  -->
		<div id="searchResultBox"></div>
		<br><br><br><br><br><br><br><br>
		<c:import url="/WEB-INF/views/layout/bottom.jsp" />
	</div>
</body>
</html>





