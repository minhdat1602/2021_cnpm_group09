<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>



<head>
<meta charset="UTF-8">
<title>Kết thúc đặt phòng</title>
</head>
<body>
	<!--room booking start-->
	<div class="room-booking ptb-100 white_bg">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<div class="row">
						<div class="col-md-12">
							<div class="room-booking-box">
								<div class="tab-content">
									<div role="tabpanel" class="tab-pane active" id="done">
										<div class="booking-done">
											<div class="booking-done-table table-responsive text-center"
												style="width: 110%;">
												<table class="table">
													<tr>
														<td><p>
																1 Phòng <span>${ orderInf.capacity } người</span>
															</p></td>
														<td><p>
																${ orderInf.price }VND<span>Giá chỉ định</span>
															</p></td>
														<td><p>
																${ orderInf.stayNumber } <span>đêm</span>
															</p></td>
														<td><p>${ orderInf.subTotal }VND</p></td>
													</tr>
													<tr class="row2">
														<td><p>
																Thuế <span>${ orderInf.taxPercent }%</span>
															</p></td>
														<td></td>
														<td></td>
														<td><p>${ orderInf.taxPrice }VND</p></td>
													</tr>
													<tr class="row3">
														<td><p>Tổng tiền</p></td>
														<td></td>
														<td></td>
														<td><p>${ orderInf.totalPrice }VND</p></td>
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
				<div class="col-md-6">
					<div class="row">
						<div class="col-md-12">
							<div class="form-title">
								<h2>Đặt phòng kết thúc</h2>
								<p>Thông tin đã đặt phòng bên dưới!</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="booking-done-description">
								<p style="width: 575px">Hoá đơn đã dược tạo. Đặt phòng thành
									công. Quý khách vui lòng đến nhận phòng đúng thời hạn.Nếu có
									vấn đề gì quý khách vui lòng liên hệ số HOTLINE: 19001256</p>
								<div class="succesfully" style="width: 320px;">
									<strong style="font-size: 19px">Đặt phòng thành công.
										Chúc quý khách một ngày tốt lành!!</strong>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>