<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 검색 결과</title>
	</head>
	<body>
		<div id="wrap">
			<table border="1">
					<c:choose>
						<c:when test="${empty bookList}">
							<tr align="center">
								<td colspan="5">찾는 상품이 없습니다</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="bk" items="${bookList }">
						<div id="rentalBookBox">
							<table class="bookSearchForm">
					            <tr>
					               <td rowspan="5" id="imgBox">
										<img alt="이미지가 없습니다" src="<c:url value='/image/${bk.bookImg}'/>" style="width:150px; height:200px;">
					               </td>
					               <td><a href="<c:url value='/book/bookDetailView/${bk.bookId}'/>">제목 :${bk.bookName }</a></td>
					            </tr>
					            <tr>
					                <td>저자 / 출편사 :${bk.bookAuthor } / ${bk.bookPublish }</td>             
					            </tr>
					            <tr>
					                <td>원가 / 대여료 : ${bk.bookPrice } / ${bk.rentP }</td>             
					            </tr>
					            <tr>
					                <td>카테고리 : ${bk.bookctg }</td>             
					            </tr>
					            <tr>
					                <td>${bk.bookDis }</td>             
					            </tr>
				            </table>
			            </div>
			            <br><hr><br>
			        </c:forEach>
						</c:otherwise>
					</c:choose>
				</table><br><br>
				
				<a href="<c:url value='/'/>">메인 화면으로 이동</a>
			</div>
	</body>
</html>








