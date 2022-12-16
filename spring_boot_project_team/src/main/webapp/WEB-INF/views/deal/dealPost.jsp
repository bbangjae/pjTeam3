<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>책 거래내역</title>
		<c:import url="/WEB-INF/views/layout/head.jsp" />
		<link rel="stylesheet" type="text/css" href='<c:url value="/css/deal/table.css"/>'>
	</head>
	<body>
		<div id="wrap">

			
			<c:import url="/WEB-INF/views/layout/top.jsp" />
				
				<table id="dealtable" >
					
					<tr><th class="profile">
						<div style="width:800px; height:30px; text-align:left;">
						 <span style="font-family:GmarketSans; font-size:20px;">도서 리스트</span>
						</div>
						<div>
							<img src="<c:url value='/image/홍길동.png'/>">
						</div>
						<div>
							<span style="font-weight:bold; font-size:20px;">${mv.memNick}</span><br>
							<span style="font-family:Georfia;">등급: ${mv.levels}</span>
						</div>
						
						<div>
							포인트<br><br>
							${mv.points}
							
							
						</div>
						<div>
							적립금<br><br>
							${mv.coin}
						</div>
						<div>
							<a href="<c:url value='/deal/dealpost' />">빌렸던책</a><br><br>
							3
						</div>
					</th></tr>
					<tr><th id="nav">이렇게나 많이 읽었나?</th></tr>
					<c:forEach var="bL" items="${borrowList}">
					<tr>
						<td>
							<div>
								<a href="<c:url value='/book/bookDetailView/${bL.bookId}' />" ><img src="<c:url value='/image/${bL.bookImg}'/>"></a>
							</div>
							<div>
								<span style="font-weight:bolder; line-height:2.5; ">상태:${bL.bookState}</span><br>
							 	<span style="font-weight:lighter; color:gray">책이름:${bL.bookName} </span><br>
					 			<span style="font-weight:lighter; color:gray">저자:${bL.bookAuthor}</span><br>
					 			<span style="font-weight:lighter; color:gray">출판사:${bL.bookPublish }</span><br>
					 		</div>
							<div>
								
				
								<button>거래 완료</button>
									 				
				</div>
				
					</td>
						
					</tr>
					</c:forEach>
					<tr><th id="lastdiv">
					<div>${mv.lastWrite }</div>
					</th></tr>
				</table>
			 	
			<!--  bottom -->         
        <c:import url="/WEB-INF/views/layout/bottom.jsp" />
		</div>
	</body>
</html>