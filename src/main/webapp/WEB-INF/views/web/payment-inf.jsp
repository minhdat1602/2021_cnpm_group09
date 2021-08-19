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
										<c:url var="orderDetail"
											value="/booking/booking-done?roomId=${ roomId }"></c:url>
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
														<input type="text" placeholder="Enter CVV/CVC" />
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
														<button type="submit">Pay now</button>
													</div>
												</div>
											</div>
										</form:form>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane" id="done">
									<div class="booking-done">
										<div class="booking-done-table table-responsive text-center">
											<table class="table">
												<tr>
													<td><p>
															1 Room <span>Five Adult & 1 child</span>
														</p></td>
													<td><p>
															$120 <span>Rate</span>
														</p></td>
													<td><p>
															5 <span>night</span>
														</p></td>
													<td><p>$550</p></td>
												</tr>
												<tr class="row2">
													<td><p>
															tax <span>20% tax</span>
														</p></td>
													<td></td>
													<td></td>
													<td><p>$90</p></td>
												</tr>
												<tr class="row3">
													<td><p>Total</p></td>
													<td></td>
													<td></td>
													<td><p>$640</p></td>
												</tr>
											</table>
										</div>
										<div class="booking-done-description">
											<p>There are many variations of passages of Lorem Ipsum
												available, but the majority have suffered alteration in some
												form, by injected humour</p>
											<div class="succesfully">
												<strong>Your reservation was succefully submited!!</strong>
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
	</div>
	<!--room booking end-->
	<script type="text/javascript">
		$("#CLICK").click(function(e) {
			e.preventDefault(); // avoid to execute the actual submit of the form.
			/* var personalInf = $
			{
				bookingPayload
			} */
			var form = $(this);
			var url = form.attr('action');
			var myData = {
				"email" : "che607@yahoo.com"
			}
			$.ajax({
				url : '/phong-trong',
				type : 'GET',
				contentType : 'application/json',
				data : JSON.stringify(myData),
				dataType : 'json',
				success : function(result) {
					alert(result)
				}
			});
		});
	</script>
</body>
</html>