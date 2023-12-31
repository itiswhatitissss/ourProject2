<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2023-06-21
  Time: PM 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <div class="top-bar">
        <div class="container">
            <div class="search-bar">
                <input type="text" placeholder="검색어를 입력하세요">
                <button type="submit">검색</button>
            </div>
            <div class="logo">
                <img src="https://c.011st.com/img/common/v3/logoday.png" alt="11번가 로고">
            </div>
            <div class="top-nav">
                <ul>
                    <c:choose>
                        <c:when test="${id != null}">
                            <li><a href="BoardServlet?command=myInfo">나의정보</a></li>
                            <li><a href="BoardServlet?command=orderSearch">주문조회</a></li>
                            <li><a href="BoardServlet?command=cart">장바구니</a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="BoardServlet?command=login">나의정보</a></li>
                            <li><a href="BoardServlet?command=login">주문조회</a></li>
                            <li><a href="BoardServlet?command=login">장바구니</a></li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </div>
    </div>
    <nav>
        <div class="container">
            <ul>
                <li><a href="#">홈</a></li>
                <li><a href="#">카테고리</a></li>
                <li><a href="#">베스트</a></li>
                <li><a href="#">쇼킹딜</a></li>
                <li><a href="#">이벤트</a></li>
                <li><a href="#">프로모션</a></li>
                <li>
                    <pre>                                                                      </pre>
                </li>
                <c:choose>
                    <c:when test="${id != null}">
                    </c:when>
                    <c:otherwise>
                        <li><a href="#">로그인</a></li>
                        <li><a href="#">회원가입</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </nav>
    <hr>
</header>
</body>
</html>
