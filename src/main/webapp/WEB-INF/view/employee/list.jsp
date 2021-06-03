<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원목록</title>
<link rel="stylesheet" href="spring5_rest_study/css/style.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		var contextPath = "${contextPath}";
		$.get(contextPath + "/api/employees", function(json) {
			var dataLength = json.length;
			console.log(json[0].manager.empNo)
			if (dataLength >= 1) {
				var sCont = "";
				for (i = 0; i < dataLength; i++) {
					sCont += "<tr>";
					sCont += "<td>" + json[i].empNo + "</td>";
					sCont += "<td>" + json[i].empName + "</a></td>";
					sCont += "<td>" + json[i].title.titleName + "</td>";
					if (json[i].manager == null) {
						sCont += "<td></td>";
					} else {
						sCont += "<td>" + json[i].manager.empNo + "</td>";
					}

					sCont += "<td>" + json[i].salary + "</td>";
					sCont += "<td>" + json[i].dept.deptno + "</td>";
					sCont += "</tr>";
				}
				$("#load:last-child").append(sCont);
			}
		});
	});
</script>
</head>
<body>
	<h2>
		<spring:message code="employee" />
		<spring:message code="list" />
	</h2>

	<table border="1">
		<thead>
			<tr>
				<td><spring:message code="eno" /></td>
				<td><spring:message code="ename" /></td>
				<td><spring:message code="title" /></td>
				<td><spring:message code="manager" /></td>
				<td><spring:message code="salary" /></td>
				<td><spring:message code="dept" /></td>
			</tr>
		</thead>
		<tbody id="load">
		</tbody>
	</table>
</body>
</html>