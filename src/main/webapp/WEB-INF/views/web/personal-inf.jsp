<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url var="paymentInfUrl"
	value="/booking/payment-inf?roomId=${ roomId }"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin khách hàng</title>
<style type="text/css">
#loader {
	position: fixed;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	width: 100%;
	background: rgba(0, 0, 0, 0.75)
		url('http://i.stack.imgur.com/FhHRx.gif') no-repeat center center;
	z-index: 10000;
}

#loader-content {
	position: fixed;
	top: 90px;
	left: 0;
	right: 0;
	bottom: 0;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	z-index: 10000;
	color: white;
}

#loader-contain {
	display: none;
}
</style>
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
							<form:form id="bookingForm" modelAttribute="personalInfPayload"
								action="${ paymentInfUrl }">
								<div class="booking-box1 mb-15 fix">
									<div class="booking-filed">
										<form:input path="name" placeholder="Họ và tên" />
									</div>
									<div class="booking-filed">
										<form:input path="email" placeholder="Email" />
									</div>
								</div>
								<div class="booking-box1 mb-15 fix">
									<div class="booking-filed">
										<form:input path="cmnd" placeholder="Chứng minh nhân dân" />
									</div>
									<div class="booking-filed">
										<form:input path="phomeNumber" placeholder="Số điện thoại" />
									</div>
								</div>
								<div class="booking-box2 mb-15 fix">
									<div class="b_date">
										<form:input id="arrivalDate" path="arrivalDate" type="date"
											placeholder="Ngày đến" />
									</div>
									<div class="b_date">
										<form:input id="departureDate" path="departureDate"
											type="date" placeholder="Ngày đi" />
									</div>
								</div>
								<div class="booking-box1 mb-15 fix">
									<div class="booking-filed">
										<form:select path="roomNumber">
											<form:option value="${ personalInfPayload.roomNumber }">Phòng số ${ personalInfPayload.roomNumber }</form:option>
										</form:select>
									</div>
									<div class="booking-filed">
										<form:select id="adult" path="maxCapacity">
											<form:option value="0" disabled="true">Số lượng người</form:option>
											<c:forEach var="i" begin="1"
												end="${ personalInfPayload.maxCapacity }">
												<form:option value="${ i }">${ i } người</form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="booking-comment fix">
									<form:textarea placeholder="Ghi chú" path="note"></form:textarea>
								</div>
								<div class="submit-form mt-25">
									<button id="bookingBtn" onclick="submitClick()">Đặt
										phòng</button>
								</div>
							</form:form>
							<div id="loader-contain">
								<div id="loader"></div>
								<p id="loader-content">Vui lòng đợi trong giây lát...</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<!--room booking end-->
	<script>
		var today = new Date();
		var dd = today.getDate();
		var mm = today.getMonth() + 1; //January is 0 so need to add 1 to make it 1!
		var yyyy = today.getFullYear();
		if (dd < 10) {
			dd = '0' + dd
		}
		if (mm < 10) {
			mm = '0' + mm
		}
		document.getElementById("arrivalDate").setAttribute("min",
				yyyy + '-' + mm + '-' + dd);
		document.getElementById("departureDate").setAttribute("min",
				yyyy + '-' + mm + '-' + (dd + 1));

		var spinner = $('#loader-contain');
		function submitClick() {
			spinner.show();
			$('#bookingForm').submit();
		}
	</script>
</body>
</html>