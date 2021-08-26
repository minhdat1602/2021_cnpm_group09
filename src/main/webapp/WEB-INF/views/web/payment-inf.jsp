<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ page import="com.nlu.util.SecurityUtils"%>
<%-- <c:url var="searchAPI" value="/tim-kiem"/> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin thanh toán</title>
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

#loader-contain, #loader-contain-payment {
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
							<h2>Thông tin Thanh toán</h2>
							<p>Vui lòng điền đầy đủ thông tin thanh toán ở mẫu bên dưới!</p>
						</div>

						<div class="service-tab-desc text-left mt-60">
							<div class="tab-content">
								<div role="tabpanel" class="tab-pane active" id="payment">
									<div class="payment-info">
										<c:url var="bookingDoneURL" value="/booking/booking-done">
											<c:param name="orderId" value="${ orderId }"></c:param>
										</c:url>
										<form:form modelAttribute="paymentInfPayload"
											id="personalInfForm" action="${ bookingDoneURL }">
											<div class="payment-form">
												<div class="payment-form-list">
													<div class="single_form">
														<form:input path="cardHolderName" type="text"
															placeholder="Card Holder Name" />
													</div>
													<div class="single_form">
														<form:input type="text" path="cardNumber"
															placeholder="Enter Creadit Card Number" />
													</div>
													<div class="single_form">
														<form:input type="password" path="password"
															placeholder="Enter CVV/CVC" />
													</div>
													<div class="single_form">
														<label>Expired Time:</label>
														<form:input type="date" path="expriedTime"
															placeholder="Enter Expired Time" />
													</div>
												</div>
												<div class="pay-money-form mt-40">
													<div class="payment-card">
														<a href="#"><img src="images/logo/pay-card.png" alt=""></a>
													</div>
													<div class="pay-order">
														<button type="submit" onclick="submitClick()">Thanh
															toán</button>
													</div>
												</div>
											</div>
										</form:form>
										<div id="loader-contain">
											<div id="loader"></div>
											<p id="loader-content">Đang xác nhận thông tin thanh
												toán. Vui lòng đợi trong giây lát...</p>
										</div>
										<input id="bookingPayload" type="hidden"
											value="${ bookingPayload }" />
										<div id="loader-contain-payment">
											<p id="loader-content">Thanh toán thất bại. Vui lòng xác
												nhận lại</p>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="wait" class="modal">
		<!-- Place at bottom of page -->
	</div>
	<!--room booking end-->
	<script type="text/javascript">
		var spinner = $('#loader-contain');
		function submitClick() {
			spinner.show();
			$('#personalInfForm').submit();
		}
		if ($('#loader-contain-payment')) {
			alert("Thanh toán thất bại. Vui lòng thử lại")
		}
	</script>
</body>
</html>