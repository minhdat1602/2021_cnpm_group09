<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url var="personaInflURL" value="/booking-room/thong-tin-khach-hang" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin đặt phòng</title>
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
					<div class="selcted-room">
						<div class="select-room-inner">
							<div class="select-room-title">
								<h3>Phòng đang chọn</h3>
								<p>Thông tin phòng bên dưới!</p>
							</div>
							<div class="room-rent fix mb-45">
								<div class="room-rent-img" style="width: 60%;">
									<img src="${ room.image}"
										style="width: 625px !important; height: 450px; !important"
										alt="hinh anh phong">
								</div>
								<div class="room-rent-desc" style="width: 40%;">
									<h3>
										<b>Số phòng: </b>Phòng ${ room.number }
									</h3>
									<div>
										<h4>
											<b>Giá tối đa cho:</b> ${ room.maxCapacity } người
										</h4>
										<h4>
											<b>Loại phòng:</b> ${ room.roomName }
										</h4>
										<h4>
											<b>Giá phòng:</b> ${ room.price }VND<span>/Đêm</span>
										</h4>
									</div>
								</div>
							</div>

							<div class="room-social-share mb-45">
								<h3>Các tiện nghi có sẵn</h3>
								<c:forEach items="${room.convenients}" var="convenience">
									<h5>${convenience.name}</h5>
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
								<div class="submit-form mt-25">
									<button id="bookingBtn">Bước tiếp theo</button>
								</div>
								<a id="personalInf" href="${ personalInfAPI }"></a>
							</div>
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
	<script type="text/javascript">
		var spinner = $('#loader-contain');
		$("#bookingBtn").click(function() {
			spinner.show();
			$("#personalInf")[0].click();
		});
	</script>
</body>
</html>