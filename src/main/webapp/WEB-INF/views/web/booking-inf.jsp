<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="personaInflURL" value="/booking-room/thong-tin-khach-hang" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin đặt phòng</title>

</head>
<body>

	<!--room booking start-->
	<div class="room-booking ptb-100 white_bg">
		<div class="container">
			<div class="row">
				<div class="col-md-12">


					<div class="selcted-room">
						<div class="select-room-inner">
							<div class="select-room-title">
								<h3>Phòng đang chọn</h3>
								<p>Thông tin phòng bên dưới!</p>
							</div>
							<div class="room-rent fix mb-45">
								<div class="room-rent-img">
									<img src="${ room.image}"
										style="width: 192px !important; height: 119px; !important"
										alt="hinh anh phong">
								</div>
								<div class="room-rent-desc">
									<h3 class="roome-rent-title">Phòng ${ room.number }</h3>
									<div class="room-sub-desc">
										<h4>Giá tối đa cho: người lớn</h4>
										<h4>Loại phòng: ${ room.roomName }</h4>
										<h4>Giá phòng</h4>
										<h3>
											${ room.price }VND<span>/Đêm</span>
										</h3>
									</div>
								</div>
							</div>

							<div class="room-social-share mb-45">
								<h3>Các tiện nghi có sẵn</h3>
								<c:forEach items="${room.convenients}" var="convenience">
									<h4>${convenience.name}</h4>
								</c:forEach>
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
							<div class="submit-form mt-25">
								<c:url var="personalInfAPI" value="/booking/personal-inf">
									<c:param name="roomId" value="${ room.id }" />
								</c:url>
								<a id="bookingBtn" type="button" href="${ personalInfAPI }">Bước
									tiếp theo</a>
							</div>


						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html>