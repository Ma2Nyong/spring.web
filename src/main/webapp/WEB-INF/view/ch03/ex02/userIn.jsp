<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form method='post' encType='multipart/form-data'>
	<label>이름: <input type='text' name='username'/></label><br>
	<label>나이: <input type='number' name='age'/></label><br>
	<label>얼굴: <input type='file' name='face'/></label><br>
	<input type='submit'/>
</form>
<!-- encoding type이 miltipart일 경우 이 3가지 타입을 기억해아한다. -->