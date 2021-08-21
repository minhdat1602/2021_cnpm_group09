<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách phòng</title>
</head>
<body>
	<!-- search bar Start -->
	<div class="search-bar animated slideOutUp">
		<div class="table">
			<div class="table-cell">
				<div class="container">
					<div class="row">
						<div class="col-sm-8 col-sm-offset-2">
							<div class="search-form-wrap">
								<button class="close-search">
									<i class="mdi mdi-close"></i>
								</button>
								<form action="tim-kiem" method="GET">
									<input type="text" name="key" placeholder="Từ khóa tìm kiếm..." />
									<button class="search-button" type="submit">
										<i class="fa fa-search"></i>
									</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- search bar End -->
	<!--Room Section Title start-->
	<div class="room-section text-center ptb-80 white_bg">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title mb-75">
						<h2>
							Our <span>room</span>
						</h2>
						<p>There are many variations of passages of Lorem Ipsum
							available, but the majority have suffered by injected humour.</p>
					</div>
				</div>
			</div>
			<input type="hidden" id="locate" name="locate"
				value="<c:url value = "/dat-phong?id="/>">
			<div class="our-room-show">
				<div class="row">
					<div class="our-room-list owl-pagination">
						<div class="single-room-sapce" id="list">

							<c:forEach items="${listRoom}" var="room">

								<div class="col-md-4 hidden-sm col-xs-12">
									<div class="single-room">
										<div class="room-img">
											<a class="typeid"
												href="<c:url value = "booking/booking-inf?roomId=${room.id}"/> "><img
												src="${room.image}" alt=""></a>
										</div>
										<div class="room-desc">
											<div class="room-name">
												<h3>
													<a href="#">${room.name}</a>
												</h3>
											</div>
											<div class="">
												<h5>
													${room.price} VNĐ <span>/ Đêm</span>
												</h5>
											</div>
											<div class="room-book">
												<a
													href="<c:url value = "booking/booking-inf?roomId=${room.id}"/> ">Đặt
													ngay</a>
											</div>
										</div>
									</div>
								</div>

							</c:forEach>

							<!-- <div class="col-md-4 col-sm-6 col-xs-12 col-sm-6 col-xs-12">

								<div class="single-room mb-80">
									<div class="room-img">
										<a href="#"><img src="images/room/room1.jpg" alt=""></a>
									</div>
									<div class="room-desc">
										<div class="room-name">
											<h3>
												<a href="#">Delux room</a>
											</h3>
										</div>
										<div class="room-rent">
											<h5>
												€ 200 / <span>Night</span>
											</h5>
										</div>
										<div class="room-book">
											<a href="#">Book now</a>
										</div>
									</div>
								</div>
							</div> -->


							<%-- <input id="len" name="len" value="2" type="hidden">
							<c:forEach begin="0" end="${len}" varStatus="loop">
								<div class="col-md-4 col-sm-6 col-xs-12">
									<div class="single-room mb-80">
										<div class="room-img">
											<a href="#"><img id="room_type_img${loop.index}" src=""
												alt="room type image"></a>
										</div>
										<div class="room-desc">
											<div class="room-name">
												<h3>
													<a id="room_type_name${loop.index}" href="#"></a>
												</h3>
											</div>
											<div class="room-rent">
												<h5>
													<span id="room_type_price${loop.index}"></span> / <span>Night</span>
												</h5>
											</div>
											<div class="room-book">
												<a href="#">Book now</a>
											</div>
										</div>
									</div>
								</div>
							</c:forEach> --%>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--Room Section end-->
	<!--hotel team start-->
	<div class="hotel-team white_bg">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="newsletter">
						<div class="row">
							<div class="col-md-6">
								<div class="newsletter-title">
									<h2>SUBSCRIBE TO OUR NEWSLETTER</h2>
								</div>
							</div>
							<div class="col-md-6">
								<div class="newsletter-form">
									<form id="mc-form" class="mc-form">
										<input id="mc-email" type="email" autocomplete="off"
											placeholder="Enter Address..." />
										<button id="mc-submit" type="submit">Subscribe</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!--hotel team end-->
</body>

</html>