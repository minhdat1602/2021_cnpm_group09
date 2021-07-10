<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin khách hàng</title>
</head>
<body>

	<!--room booking start-->
	<div class="room-booking ptb-100 white_bg">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="booking_form">
						<div class="form-title">
							<h2>Thông tin khách hàng</h2>
							<p>Điền đầy đủ thông tin bên dưới, chúng tối sẽ liên hệ bạn
								xác thực sớm nhất!</p>
						</div>


						<div class="room-booking-box">
							<form:form id="bookingForm"
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
									<input type="text" disabled value="Phòng số ${ room.number }">
								</div>
								<div class="booking-comment fix">
									<textarea placeholder="Ghi chú" name="notes"></textarea>
								</div>
								<div class="submit-form mt-25">
									<button id="bookingBtn" type="submit">Đặt phòng</button>
								</div>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--room booking end-->

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