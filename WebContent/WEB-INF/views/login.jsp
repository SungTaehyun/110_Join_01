<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>CodePen - Flat HTML5/CSS3 Login Form</title>
  <link rel="stylesheet"
   href="${pageContext.request.contextPath}/resources/css/style.css" >
   <script type="text/javascript">
	//컨트롤러에서 보낸 메세지가 있을 경우
	window.onload = function(e) {//'${resultMsg}' jstl식 표현법
		var resultMsg = '${resultMsg}';
	    // '${resultMsg}'와 '${resultCode}'는 JSTL 표현법을 사용하여 서버에서 받은 값으로 대체됩니다.
		// resultMsg의 길이가 0보다 크면 (한 글자라도 있으면) 출력합니다.
		
		if (resultMsg.length > 0) {
		    alert(resultMsg); // resultMsg를 경고창으로 출력합니다.
		}
	}
	
	</script>
</head>

<body>
<div class="login-page">
  <div class="form">
    <!-- 회원가입 양식 : action 속성은 회원가입 요청을 처리할 URL을 지정 -->
    <form class="register-form" action="<c:url value='/join.do'/>" method="post"> <!-- MemberController에서 join.do  -->
      <!-- 사용자가 회원가입 정보를 입력하는 부분 -->
      <input type="text" name="memberId" placeholder="id" required/> <!-- 사용자 아이디 입력 필드 -->
      <input type="password" name="passwd" placeholder="password" required/> <!-- 사용자 비밀번호 입력 필드 -->
      <input type="password" placeholder="confirm password" required/> <!-- 비밀번호 확인 입력 필드 -->
      <input type="text" name="email" placeholder="email address" required/> <!-- 이메일 주소 입력 필드 -->
      <input type="text" name="memberName" placeholder="name" required/> <!-- 사용자 이름 입력 필드 -->
      <input type="text" name="nickname" placeholder="nickname" required/> <!-- 사용자 닉네임 입력 필드 -->
      <button type="submit">create</button> <!-- 회원가입 버튼 -->
      <p class="message">Already registered? <a href="#">Sign In</a></p> <!-- 이미 가입한 경우 로그인 링크 -->
    </form>
    
    <!-- 로그인 양식 -->
    <form class="login-form">
      <!-- 사용자가 로그인 정보를 입력하는 부분 -->
      <input type="text" name="memberId" placeholder="id"/> <!-- 사용자 아이디 입력 필드 -->
      <input type="password" name="passwd" placeholder="password"/> <!-- 사용자 비밀번호 입력 필드 -->
      <button>login</button> <!-- 로그인 버튼 -->
      <p class="message">Not registered? <a href="#">Create an account</a></p> <!-- 아직 가입하지 않은 경우 회원가입 링크 -->
    </form>
  </div> <!-- 양식 래핑 div -->
</div> <!-- 로그인 페이지 래핑 div -->

</div>
<script src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script  src="${pageContext.request.contextPath}/resources/js/script.js"></script>
<!-- 
    <%-- <%= request.getContextPath() %> --%>
    위의 ${pageContext.request.contextPath}와 같은 기능
-->


</body>
</html>
