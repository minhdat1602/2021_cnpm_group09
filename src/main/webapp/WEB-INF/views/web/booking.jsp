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
	<!--room booking start-->
	<div class="room-booking ptb-100 white_bg">
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="booking_form">
						<div class="form-title">
							<h2>Đặt phòng</h2>
							<p>Điền đầy đủ thông tin bên dưới, chúng tối sẽ liên hệ bạn
								xác thực sớm nhất!</p>
						</div>

						<div class="room-booking-box">
							<form id="bookingForm" method="POST"
								action='<c:url value = "/dat-phong" />'>
								<div class="booking-box1 mb-15 fix">
									<div class="booking-filed">
										<input type="text" placeholder="Họ tên" value="Your name">
									</div>
									<div class="booking-filed">
										<input type="text" placeholder="Địa chỉ email"
											value="Your email"> <input type="hidden" name="price"
											value="${roomType.price}">
									</div>
								</div>
								<div class="booking-box2 mb-15 fix">
									<div class="b_date">
										<input id="dateFrom" name="startDate" value="25/06/2021"
											class="date-picker" type="text" placeholder="Ngày đến">
									</div>
									<div class="b_date">
										<input id="dateTo" name="endDate" value="26/06/2021"
											class="date-picker" type="text" placeholder="Ngày đi">
									</div>
								</div>
								<div class="booking-box3 mb-15 fix">
									<div class="select_book">
										<select id="adult" name="adult" class="">
											<option disabled>Số người lượng lớn</option>
											<option value="1">1 người lớn</option>
											<option value="2">2 người lớn</option>
											<option value="3">3 người lớn</option>
											<option value="4">4 người lớn</option>
											<option value="5">5 người lớn</option>
										</select>
									</div>
									<div class="select_book">
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
								</div>
								<div class="select-book room  mb-15 fix">
									<select name="roomId">
										<option disabled>Số phòng</option>
										<c:forEach items="${roomType.rooms}" var="room">
											<option value="${room.id}">Phòng ${room.number}</option>
										</c:forEach>
									</select>
								</div>
								<div class="booking-comment fix">
									<textarea placeholder="Ghi chú" name="notes"></textarea>
								</div>
								<div class="submit-form mt-25">
									<button id="bookingBtn" type="submit">Đặt phòng</button>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="selcted-room">
						<div class="select-room-inner">
							<div class="select-room-title">
								<h3>Phòng đang chọn</h3>
								<p>Thông tin phòng bên dưới!</p>
							</div>
							<div class="room-rent fix mb-45">
								<div class="room-rent-img">
									<img src="${roomType.image}"
										style="width: 192px !important; height: 119px; !important"
										alt="hinh anh phong">
								</div>
								<div class="room-rent-desc">
									<h3 class="roome-rent-title">${roomType.name }</h3>
									<div class="room-sub-desc">
										<h4>Giá phòng</h4>
										<h3>
											${roomType.price }<span> / Đêm</span>
										</h3>
									</div>
								</div>
							</div>
							<div class="room-social-share mb-45">
								<h3>Chia sẽ</h3>
								<p>Chia sẽ đến các mạng xã hội.</p>
								<div class="social-links">
									<a href="#"><i class="mdi mdi-facebook"></i></a> <a href="#"><i
										class="mdi mdi-rss"></i></a> <a href="#"><i
										class="mdi mdi-google-plus"></i></a> <a href="#"><i
										class="mdi mdi-instagram"></i></a>
								</div>
							</div>
							<div class="need-help">
								<h3>Bạn cần giúp đỡ?</h3>
								<h4>
									SĐT: <span>+98 98 95547 587</span>
								</h4>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--room booking end-->

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
										<button id="mc-submit" type="button">Subscribe</button>
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
<script>
	/* $(document).ready(function() {
		$('#bookingBtn').on('click', function(event) {
			event.preventDefault();
			var data = {};
			var formData = $('#bookingForm').serializeArray();
			$.each(formData, function(i, v) {
				data["" + v.name + ""] = v.value;
			});

			booking(data);
		});
		function booking(data) {
			$.ajax({
				url : 'http://localhost:8080/qlks/dat-phong',
				type : 'POST',
				contentType : 'application/json',
				data : data,
				success : function(result) {
					console.log("booking successful !")
				},
				error : function(error) {
					console.log("booking failed !");
				}
			});
		}
	}) */
</script>

</html>