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
	<!--Room booking start-->
	<div class="room-booking ptb-80 white_bg">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title mb-20 text-center">
						<h2>
							Booking <span>rooms</span>
						</h2>
						<p>THÔNG TIN ĐẶT PHÒNG CHI TIẾT.</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="service-tab-desc text-left mt-60">
						<div class="tab-content">
							<div role="tabpanel" class="tab-pane active" id="done">
								<div class="booking-done">
									<div class="booking-done-description">
										<!-- <p>There are many variations of passages of Lorem Ipsum
											available, but the majority have suffered alteration in some
											form, by injected humour</p> -->
										<div class="succesfully">
											<strong>Bạn đã đặt phòng thành công !!</strong>
										</div>
									</div>
									<div class="booking-done-table table-responsive text-center">
										<table class="table">
											<tr>
												<td><p>
														Phòng ${booking.room.number} <span>${requestObj.adult}
															Người lớn & ${requestObj.children} trẻ em</span>
													</p></td>
												<td><p>
														${requestObj.price} VNĐ <span>Đêm</span>
													</p></td>
												<td><p>
														${day} <span>Đêm</span>
													</p></td>
												<td><p>${requestObj.price * day}VNĐ</p></td>
											</tr>
											<tr class="row2">
												<td><p>
														tax <span>5% tax</span>
													</p></td>
												<td></td>
												<td></td>
												<td><p>${requestObj.price * day * 0.05}VNĐ</p></td>
											</tr>
											<tr class="row3">
												<td><p>Total</p></td>
												<td></td>
												<td></td>
												<td><p>${requestObj.price * day + requestObj.price * day * 0.05}VNĐ</p></td>
											</tr>
										</table>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--Room booking end-->

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