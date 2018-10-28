<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<p>
	<font color="green">${success} </font>
</p>
welcome!! ${username}
<br>
<br>
Now , you can manage your
<a href="/list-todos">todos</a>
<%@include file="common/footer.jspf"%>