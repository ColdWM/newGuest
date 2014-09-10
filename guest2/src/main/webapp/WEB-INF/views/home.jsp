<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guest book to Suchan</title>
</head>
<body>
			<div class="control-group">
				<!-- Email -->
				<label class="control-label" for="username">E mail</label>
				<div class="controls">
					<input type="text" id="guestName" name="guestName" ng-model="text"
						required class="input-xlarge">
					<br />
				</div>
			</div>

			<div class="control-group">
				<!-- Password-->
				<label class="control-label" for="password">Password</label>
				<div class="controls">
					<input type="password" id="password" name="guestPassword"
						placeholder="password" class="input-xlarge">
				</div>
			</div>
			<br>
			<textarea class="span8" rows="8" id="guestText" name="guestText" placeholder="내용을 입력하세요."></textarea>
			<br> 
			<input type="submit" role="button" class="btn btn-inverse" value="방명록쓰기">
			</td>
		<c:forEach items="${guestsList}" var="guest">
			<div class="well">
				<a value="${guest.guestId}">수정하기</a><br>
				<textarea class="span8" rows="8" readonly="readonly">${guest.guestText}</textarea>
			</div>


		</c:forEach>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript">
		
	</script>

</body>
</html>
