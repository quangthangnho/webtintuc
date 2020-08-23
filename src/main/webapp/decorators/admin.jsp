<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<meta name="description" content="overview &amp; stats" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<title><dec:title default="Trang chủ"></dec:title></title>
<!-- bootstrap & fontawesome -->
<link href="<c:url value='/template/admin/css/bootstrap.min.css'></c:url>" rel="stylesheet">
<link href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css'></c:url>" rel="stylesheet">
<!-- text fonts -->
<link href="<c:url value='/template/admin/css/fonts.googleapis.com.css'></c:url>" rel="stylesheet">
<!-- ace styles -->
<link href="<c:url value='/template/admin/css/ace.min.css'></c:url>" rel="stylesheet" class="ace-main-stylesheet" id="main-ace-style">
<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
		<![endif]-->
<link href="<c:url value='/template/admin/css/ace-skins.min.css'></c:url>" rel="stylesheet">
<link href="<c:url value='/template/admin/css/ace-rtl.min.css'></c:url>" rel="stylesheet">
</head>
<body class="no-skin">
	<!-- header -->
	<%@ include file="/common/admin/Header.jsp"%>
	<!-- header -->

	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>
		<!-- menu -->
		<%@ include file="/common/admin/Menu.jsp"%>
		<!-- body -->

		<dec:body />

		<!-- footer -->
		<%@ include file="/common/admin/Footer.jsp"%>
		<!-- footer -->

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse display"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<script type="text/javascript" src="<c:url value='/template/admin/js/ace-extra.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery-2.1.4.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/bootstrap.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.mobile.custom.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery-ui.custom.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.ui.touch-punch.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.easypiechart.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.sparkline.index.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.flot.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.flot.pie.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/jquery.flot.resize.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/ace-elements.min.js'></c:url>"></script>
<script type="text/javascript" src="<c:url value='/template/admin/js/ace.min.js'></c:url>"></script>
</body>
</html>