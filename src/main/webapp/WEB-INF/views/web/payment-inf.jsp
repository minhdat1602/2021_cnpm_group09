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
										<c:url var="orderDetail" value="/booking/booking-done">
											<c:param name="orderId" value="${ orderId }"></c:param>
										</c:url>
										<form:form modelAttribute="paymentInfPayload"
											id="paymentInfPayload" action="${ orderDetail }">
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
														<input type="password" placeholder="Enter CVV/CVC" />
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
														<button type="submit">Thanh toán</button>
													</div>
												</div>
											</div>
										</form:form>

										<input id="bookingPayload" type="hidden"
											value="${ bookingPayload }" />
									</div>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!--room booking end-->
	<script type="text/javascript">
		/* 	$("#CLICK").click(function(e) {
				e.preventDefault(); // avoid to execute the actual submit of the form.
				var personalInf = $('#bookingPayload').val();
				var myData = {
					email : "vale1"
				};
				$.ajax({
					url : '${orderDetail}',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(myData),
					dataType : 'json',
					success : function(result) {
						console.log(result);
						console.log(myData);
						console.log(personalInf);
					},
					error : function(error) {
						alert(personalInf);
						console.log(error);
						console.log(personalInf);
						console.log(myData);
						console.log(myData);
					}
				})
			}); */
	</script>
</body>
</html>