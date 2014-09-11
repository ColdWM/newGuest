<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guest book to Suchan</title>
<link rel="stylesheet" href="/guest2/resources/css/bootstrap.min.css">
</head>
<body>
	<div class="col-md-5 col-md-offset-4" >
	<form:form action="/guest2/insert" method="post">
			<div class="control-group">
				<!-- NAME -->
				<label class="control-label" for="username">NAME</label>
				<div class="controls">
					<input type="text" id="guestName" name="guestName" ng-model="text" required class="input-xlarge">
					<br>
				</div>
			</div>
			<div class="control-group">
				<!-- Password-->
				<label class="control-label" for="password">Password</label>
				<div class="controls">
					<input type="password" id="guestPassword" name="guestPassword" placeholder="password" class="input-xlarge">
				</div>
			</div>
			<br>
			<textarea class="form-control" rows="8" id="guestText" name="guestText" placeholder="내용을 입력하세요."></textarea>
			<br> 
			<input type="submit" role="button" class="btn btn-inverse" value="방명록쓰기">
			</form:form>
			<br>
		<c:forEach items="${guestsList}" var="guest">
			<div class="well">
			<form:form action="/guest2/update" method="post">
				<p>NAME : ${guest.guestName}</p>
				<input type="hidden" name="guestName" value="${guest.guestName}">
				<input type="hidden" name="guestId" value="${guest.guestId}">
				<a onclick="update(${guest.guestId})">수정시작</a><br>
				<a href="/guest2/delete?guestId=${guest.guestId}">삭제하기</a>				
				<textarea class="form-control ${guest.guestId}" name="guestText" rows="8" readonly="readonly">${guest.guestText}</textarea>
				<input type="submit" role="button" class="btn btn-inverse" value="수정완료">
			</form:form>
			</div>
		</c:forEach>
	</div>
	<script src="/guest2/resources/js/jquery-1.10.1.min.js"></script>
	<script src="/guest2/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	function update(cmo) {
		$('.'+cmo).attr('readonly', false);
	}
	</script>

</body>
</html>
