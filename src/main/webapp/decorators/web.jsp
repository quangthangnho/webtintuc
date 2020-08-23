<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title><dec:title default="Trang chủ"></dec:title></title>
<!-- Bootstrap core CSS -->
<link
	href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css'></c:url>" rel="stylesheet">
<!-- Custom styles for this template  -->
<link href="<c:url value='/template/web/css/Style.css'></c:url>" rel="stylesheet">
</head>
<body>
	<!-- header -->
	<%@include file="/common/web/Header.jsp"%>
	<!-- body -->
	<div class="container">
		<dec:body></dec:body>
	</div>
	<!-- footer -->
	<%@include file="/common/web/Footer.jsp"%>
	<!-- Bootstrap core JavaScript -->
	<script type="text/javascript" src="<c:url value='/template/web/jquery/jquery.min.js'></c:url>"></script>
	<script type="text/javascript" src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js'></c:url>"></script>
</body>
</html>