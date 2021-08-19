<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
							<c:url var="orderDetail" value="/booking/payment-inf"></c:url>
							<form:form id="bookingForm" modelAttribute="bookingPayload"
								action="${ orderDetail }">
								<div class="booking-box1 mb-15 fix">
									<div class="booking-filed">
										<form:input path="name" placeholder="Họ và tên" />
									</div>
									<div class="booking-filed">
										<form:input path="email" placeholder="Email" />
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
											<form:option value="${ bookingPayload.roomNumber }">Phòng số ${ bookingPayload.roomNumber }</form:option>
										</form:select>
									</div>
									<div class="booking-filed">
										<form:select id="adult" path="maxCapacity">
											<form:option value="0" disabled="true">Số lượng người</form:option>
											<c:forEach var="i" begin="1"
												end="${ bookingPayload.maxCapacity }">
												<form:option value="${ i }">${ i } người</form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="booking-comment fix">
									<form:textarea placeholder="Ghi chú" path="note"></form:textarea>
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

		today = yyyy + '-' + mm + '-' + dd;
		document.getElementById("arrivalDate").setAttribute("min", today);
		document.getElementById("departureDate").setAttribute("min", today);
	</script>
</body>
</html>