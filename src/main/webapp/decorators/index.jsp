<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ page import="com.nlu.util.SecurityUtils"%>
<c:url var="searchAPI" value="/tim-kiem" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title></dec:title></title>
<link href="<c:url value='/template/web/images/apple-touch-icon.png'/>"
	type="images/x-icon" rel="shortcut icon">
<!-- Place favicon.ico in the root directory -->

<!-- All css files are included here. -->
<!-- Bootstrap fremwork main css -->
<link rel="stylesheet"
	href="<c:url value='/template/web/css/bootstrap.min.css'/>">
<!-- This core.css file contents all plugings css file. -->
<link rel="stylesheet"
	href="<c:url value='/template/web/css/core.css'/>">
<link rel="stylesheet"
	href="<c:url value='/template/web/css/custom.css'/>">
<!-- Theme shortcodes/elements style -->
<link rel="stylesheet"
	href="<c:url value='/template/web/css/shortcode/shortcodes.css'/>">
<!-- Theme main style -->
<link rel="stylesheet" href="<c:url value='/template/web/style.css'/>">
<!-- Responsive css -->
<link rel="stylesheet"
	href="<c:url value='/template/web/css/responsive.css'/>">
<!-- customizer style css -->
<link rel="stylesheet"
	href="<c:url value='/template/web/css/style-customizer.css'/>">

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"
	integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/js-cookie/2.2.1/js.cookie.min.js"
	integrity="sha512-Meww2sXqNHxI1+5Dyh/9KAtvI9RZSA4c1K2k5iL02oiPO/RH3Q30L3M1albtqMg50u4gRTYdV4EXOQqXEI336A=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<!-- Modernizr JS -->
<script
	src="<c:url value='/template/web/js/vendor/jquery-1.12.0.min.js'/>"></script>
<script src="<c:url value='/template/web/js/vendor/jquery.min.js'/>"></script>
<script
	src="<c:url value='/template/web/js/vendor/modernizr-2.8.3.min.js'/>"></script>



</head>
<body>
	<div class="preloader">
		<div class="loading-center">
			<div class="loading-center-absolute">
				<div class="object object_one"></div>
				<div class="object object_two"></div>
				<div class="object object_three"></div>
			</div>
		</div>
	</div>

	<div class="wrapper">
		<div class="header-section">
			<div class="bg-opacity"></div>
			<div class="top-header sticky-header">
				<div class="top-header-inner">
					<div class="container">
						<div class="mgea-full-width">
							<div class="row">

								<c:url value='/template/web/images/about.jpg' />

								<div class="col-md-2 col-sm-2 col-xs-12">
									<div class="logo mt-15">
										<a href="index.html"><img
											src="<c:url value ='/template/web/images/logo/logo.png'/>"
											alt=""></a>
									</div>
								</div>
								<div class="col-md-10 col-sm-10 hidden-xs">
									<div class="header-top ptb-10">
										<div class="adresses">
											<div class="phone">
												<p>
													call <span>+012 345 678 102 </span>
												</p>
											</div>
											<div class="email">
												<p>
													Email: <span>info@example.com</span>
												</p>
											</div>
										</div>
										<div class="social-links">
											<security:authorize access="isAnonymous()">
												<a href="<c:url value='/dang-ky'/>">Đăng ký</a>
												<a href="<c:url value='/dang-nhap'/>">Đăng nhập</a>
											</security:authorize>
											<security:authorize access="isAuthenticated()">
												<a id="infor" href=""> <%=SecurityUtils.getPrincipal().getFullname()%>
													<div id="infor-panel">
														<a href="<c:url value='/thoat'/>">Xem thông tin</a>
														<c:url value="/thay-doi-thong-tin" var="updateURL">
															<c:param name="id"
																value="<%=SecurityUtils.getPrincipal().getId()%>" />
														</c:url>
														<a href="${updateURL}"> Thay đổi thông tin</a> <a
															href="<c:url value='/thoat'/>">Đổi mật khẩu</a>
													</div>
												</a>
												<a href="<c:url value='/thoat'/>">Thoát</a>
											</security:authorize>



										</div>
									</div>
									<div class="menu mt-25">
										<div class="menu-list hidden-sm hidden-xs">
											<nav>
												<ul>
													<li><a href="index.html">home</a></li>
													<li><a href="about-us.html">About</a></li>
													<li><a href="gallery.html">Gallery</a></li>
													<li><a href="#">pages<i class="fa fa-angle-down"></i></a>
														<ul class="dropdown_menu">
															<li><a href="404.html">404</a></li>
															<li><a href="booking-information.html">Booking
																	Information</a></li>
															<li><a href="personal-information.html">Personal
																	Information</a></li>
															<li><a href="payment-information.html">Parment
																	Information</a></li>
															<li><a href="booking-done.html">Booking Done</a></li>
															<li><a href="room-booking.html">Room booking</a></li>
															<li><a href="news.html">News</a></li>
															<li><a href="gallery.html">Gallery</a></li>
															<li><a href="staff.html">Staff</a></li>
															<li><a href="our-room.html">Room</a></li>
														</ul></li>
													<li><a href="contact-us.html">Contact</a></li>
												</ul>
											</nav>
										</div>
										<div class="search-bar-icon">
											<a class="search-open" href="#"><i class="fa fa-search"></i></a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- Mobile menu start -->
				<div class="mobile-menu-area hidden-lg hidden-md">
					<div class="container">
						<div class="col-md-12">
							<nav id="dropdown">
								<ul>
									<li><a href="index.html">home</a></li>
									<li><a href="about-us.html">About</a></li>
									<li><a href="gallery.html">Gallery</a></li>
									<li><a href="#">pages</a>
										<ul>
											<li><a href="404.html">404</a></li>
											<li><a href="booking-information.html">Booking
													Information</a></li>
											<li><a href="personal-information.html">Personal
													Information</a></li>
											<li><a href="payment-information.html">Parment
													Information</a></li>
											<li><a href="booking-done.html">Booking Done</a></li>
											<li><a href="room-booking.html">Room booking</a></li>
											<li><a href="news.html">News</a></li>
											<li><a href="gallery.html">Gallery</a></li>
											<li><a href="staff.html">Staff</a></li>
											<li><a href="our-room.html">Room</a></li>
										</ul></li>
									<li><a href="contact-us.html">contact</a></li>
								</ul>
							</nav>
						</div>
					</div>
				</div>
				<!-- Mobile menu end -->
			</div>

			<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
			<%@ page import="java.util.Date" %>
			<jsp:useBean id="now" class="java.util.Date" />
			<c:set var="tomorrow" value="<%=new Date(new Date().getTime() + 60*60*24*1000)%>"/>

			<div class="welcome-section">
				<div class="container">
					<div class="row">
						<div class="col-md-4 col-sm-5">
							<div class="booking-box">
								<div class="booking-form">
									<form id="filterForm">
										<div class="b-date arrive mb-15">
											<input id="dateFrom" name="startDate"
												value="<fmt:formatDate value="${now}" pattern="dd/MM/yyyy" />"
												class="date-picker" type="text" placeholder="Ngày đến">
										</div>
										<div class="b-date departure mb-15">
											<input id="dateTo" name="endDate"
												value="<fmt:formatDate value="${tomorrow}" pattern="dd/MM/yyyy" />"
												class="date-picker" type="text" placeholder="Ngày đi">
										</div>
										<div class="mb-15">
											<select id="adult" name="adult" class="">
												<option disabled>Số người lượng lớn</option>
												<option value="1">1 người lớn</option>
												<option value="2">2 người lớn</option>
												<option value="3">3 người lớn</option>
												<option value="4">4 người lớn</option>
												<option value="5">5 người lớn</option>
											</select>
										</div>
										<div class="mb-15">
											<select id="children" name="children" class="">
												<option disabled>Số lượng trẻ em</option>
												<option value="0">0 trẻ em</option>
												<option value="1">1 trẻ em</option>
												<option value="2">2 trẻ em</option>
												<option value="3">3 trẻ em</option>
												<option value="4">4 trẻ em</option>
												<option value="5">5 trẻ em</option>
											</select>
										</div>
										<div class="mb-15">
											<select id="roomCount" name="roomNum" class="">
												<option disabled>Số lượng phòng</option>
												<option value="1">1 phòng</option>
												<option value="2">2 phòng</option>
												<option value="3">3 phòng</option>
												<option value="4">4 phòng</option>
												<option value="5">5 phòng</option>
											</select>
										</div>
										<!-- <div class="mb-15">
                                            <select id="location" name="location" class="">
                                                <option value="1" disabled>Địa điểm</option>                                          
                                                <option value="Vũng Tàu" selected>Vũng Tàu</option>     
                                                  <option value="1" >Đà Lạt</option>                                      
                                            </select>
                                        </div> -->
										<div class="submit-form">
											<button id="searchRoom">Tìm phòng trống</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-md-8 col-sm-7">
							<div class="welcome-text">
								<h2>
									<span>CHONDO</span> <span class="coloring">CHÀO MỪNG QUÝ
										KHÁCH</span>
								</h2>
								<h1 class="cd-headline clip">
									<span>TRẢI NGHIỆM</span> <span
										class="cd-words-wrapper coloring"> <b
										class="is-visible"> SANG TRỌNG</b> <b> YÊN TĨNH</b> <b>
											NHIỀU TIỆN ÍCH</b>
									</span>
								</h1>
								<p class="welcome-desc">Tận hưởng những giây phút thoải mái
									cùng không gian nghỉ dưỡng CHONDO, với những dịch vụ đẳng cấp
									sẽ mang đến cho quý khách trải nghiệm không thể quên.</p>
								<div class="explore">
									<a href="#">Khám phá ngay</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<input type="hidden" id="xmxx" value="<c:url value = "/search" />" />
			<input type="hidden" id="xxx"
				value="<c:url value = "/phong-trong" />" />
		</div>
		<!-- Header section end -->

		<%@ include file="/common/web/search.jsp"%>
		<dec:body />
		<%@ include file="/common/web/footer.jsp"%>
	</div>




	<script>
		/* import Cookies from 'js-cookie' */
		$(document).ready(
				function() {
					$('#searchRoom').on('click', function(event) {
						event.preventDefault();
						var data = {};
						var formData = $('#filterForm').serializeArray();
						$.each(formData, function(i, v) {
							data["" + v.name + ""] = v.value;
						});
						console.log(data["roomNum"]);
						console.log(data["children"]);
						console.log(data["adult"]);
						console.log(data["startDate"]);
						console.log(data["endDate"]);
						search(data);
					});
					function search(data) {
						$.ajax({
							url : "" + $("#xmxx").val(),
							type : 'GET',
							contentType : 'application/json',
							data : {
								"adult" : data['adult'],
								"children" : data["children"],
								"roomNum" : data["roomNum"],
								"startDate" : data["startDate"],
								"endDate" : data["endDate"]
							},
							dataType : 'json',

							success : function(result) {
								sessionStorage.setItem("listRoomType", JSON
										.stringify(result.listRoomType));
								window.location.href = $("#xxx").val();
							},
							error : function(error) {
								alert("Thất bại");
								alert($("#xmxx").val());
								alert(error);
							}
						});
					}

					$('#infor').hover(function() {
						$('#infor-panel').css('display', 'block');
					}, function() {
						$('#infor-panel').css('display', 'none');
					});
					$('#infor-panel').hover(function() {
						$('#infor-panel').css('display', 'block');
					}, function() {
						$('#infor-panel').css('display', 'none');
					});
				})
	</script>
	<script
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
	<!-- Bootstrap framework js -->
	<script src="<c:url value='/template/web/js/vendor/bootstrap.min.js'/>"></script>
	<!--counter up js-->
	<script src="<c:url value='/template/web/js/waypoints.min.js'/>"></script>
	<script src="<c:url value='/template/web/js/jquery.counterup.min.js'/>"></script>
	<!-- Video player js -->
	<script src="<c:url value='/template/web/js/video-player.js'/>"></script>
	<!-- headlines js -->
	<script src="<c:url value='/template/web/js/animated-headlines.js'/>"></script>
	<!-- Ajax mail js -->
	<script src="<c:url value='/template/web/js/mailchimp.js'/>"></script>
	<!-- Ajax mail js -->
	<script src="<c:url value='/template/web/js/ajax-mail.js'/>"></script>
	<!-- parallax js -->
	<script src="<c:url value='/template/web/js/parallax.js'/>"></script>
	<!-- textilate js -->
	<script src="<c:url value='/template/web/js/textilate.js'/>"></script>
	<script src="<c:url value='/template/web/js/lettering.js'/>"></script>
	<!--isotope js-->
	<script src="<c:url value='/template/web/js/isotope.pkgd.min.js'/>"></script>
	<script
		src="<c:url value='/template/web/js/packery-mode.pkgd.min.js'/>"></script>
	<!-- Style Customizer Js  -->
	<script src="<c:url value='/template/web/js/style-customizer.js'/>"></script>
	<!-- Owl carousel Js -->
	<script src="<c:url value='/template/web/js/owl.carousel.min.js'/>"></script>
	<!--Magnificant js-->
	<script
		src="<c:url value='/template/web/js/jquery.magnific-popup.js'/>"></script>
	<!-- All js plugins included in this file. -->
	<script src="<c:url value='/template/web/js/plugins.js'/>"></script>
	<!-- Main js file that contents all jQuery plugins activation. -->
	<script src="<c:url value='/template/web/js/main.js'/>"></script>
</body>
</html>