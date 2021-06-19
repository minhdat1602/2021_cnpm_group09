<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin đặt phòng</title>
</head>
<body>
	 <!--Room booking start-->
        <div class="room-booking ptb-80 white_bg">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-title mb-80 text-center">
                            <h2>Booking <span>rooms</span></h2>
                            <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered by injected humour.</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="booking-rooms-tab">
                            <ul class="nav" role="tablist">
                                <li  class="active"><a href="#booking" data-toggle="tab"><span class="tab-border">1</span><span>Booking Info</span></a></li>
                                <li><a href="#personal" data-toggle="tab"><span class="tab-border">2</span><span>Personal Info</span></a></li>
                                <li><a href="#payment" data-toggle="tab"><span class="tab-border">3</span><span>payment Info</span></a></li>
                                <li><a href="#done" data-toggle="tab"><span class="tab-border">4</span><span>Booking Done</span></a></li>
                            </ul>
                        </div>
                        <div class="service-tab-desc text-left mt-60">
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="booking">
                                    <div class="booking-info-deatils">
                                        <div class="single-room-details fix">
                                            <div class="room-img">
                                                <img src="images/room/roob-tab.jpg" alt="">
                                            </div>
                                            <div class="single-room-details pl-50">
                                                <h3 class="s_room_title">SINGLE Room</h3>
                                                <div class="room_price">
                                                    <h4>Total Price</h4>
                                                    <h5>$550 <span>/per night</span></h5>
                                                    <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="single-room-booking-form mt-60">
                                            <div class="booking_form_inner">
                                                <form action="#">
                                                    <div class="single-form-part">
                                                        <div class="date-to mb-20">
                                                            <input class="date-picker" type="text" placeholder="arrive date" value="arrive date">
                                                            <i class="mdi mdi-calendar-text"></i>
                                                        </div>
                                                        <div class="select-option">
                                                            <select>
                                                                <option value="1" selected>Room</option>
                                                                <option value="2">Room 2</option>
                                                                <option value="3">Room 3</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="single-form-part">
                                                        <div class="date-to mb-20">
                                                            <input type="text" class="date-picker" placeholder="Departure Date" value="Departure Date">
                                                            <i class="mdi mdi-calendar-text"></i>
                                                        </div>
                                                        <div class="select-option">
                                                            <select>
                                                                <option value="1" selected>Children</option>
                                                                <option value="2">Mael</option>
                                                                <option value="3">lady</option>
                                                            </select>
                                                        </div>
                                                    </div>

                                                    <div class="single-form-part">
                                                        <div class="select-option mb-20">
                                                            <select>
                                                                <option value="1" selected>Adult</option>
                                                                <option value="2">Teen</option>
                                                                <option value="3">Children</option>
                                                            </select>
                                                        </div>
                                                        <div class="submit-form">
                                                            <button type="submit">Check Availability</button>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane" id="personal">
                                    <div class="personal-info-details">
                                        <div class="booking-info-inner">
                                            <form action="#">
                                                <div class="booking-form-list">
                                                    <div class="single-form-part">
                                                        <div class="name mb-15">
                                                            <input type="text" placeholder="First Name">
                                                        </div>
                                                        <div class="select-option">
                                                            <select>
                                                                <option value="1" selected>Smoking room</option>
                                                                <option value="2">Kitchen</option>
                                                                <option value="3">Bathroom</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="single-form-part">
                                                        <div class="name mb-15">
                                                            <input type="text" placeholder="Last Name">
                                                        </div>
                                                        <div class="select-option">
                                                            <select>
                                                                <option value="1" selected>parking</option>
                                                                <option value="2">Rest house</option>
                                                                <option value="3">Gym room</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="single-form-part">
                                                        <div class="mail mb-15">
                                                            <input type="text" placeholder="Your Email" value="Your Email">
                                                            <i class="mdi mdi-calendar-text"></i>
                                                        </div>
                                                        <div class="select-option">
                                                            <select>
                                                                <option value="1" selected>With pet</option>
                                                                <option value="2">with favourit</option>
                                                                <option value="3">pet</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="request-box mt-15">
                                                    <textarea placeholder="Any Specific Request"></textarea>
                                                </div>
                                                <div class="prve-next-box mt-20">
                                                    <div class="back-link">
                                                        <a href="#">Back</a>
                                                    </div>
                                                    <button type="submit">Next</button>
                                                </div>
                                           </form>
                                        </div>
                                    </div>        
                                </div>
                                <div role="tabpanel" class="tab-pane" id="payment">
                                    <div class="payment-info">
                                        <form action="#">
                                            <div class="payment-form">
                                                <div class="payment-form-list">
                                                    <div class="single_form">
                                                        <input type="text" placeholder="Card Holder Name">
                                                    </div>
                                                    <div class="single_form">
                                                        <input type="text" placeholder="Enter Creadit Card Number">
                                                    </div>
                                                    <div class="single_form">
                                                        <div class="select-date">
                                                            <select>
                                                                <option value="1" selected>Enter Month</option>
                                                                <option value="1">January</option>
                                                                <option value="1">February</option>
                                                                <option value="1">March</option>
                                                                <option value="1">April</option>
                                                                <option value="1">May</option>
                                                                <option value="1">June</option>
                                                                <option value="1">July</option>
                                                                <option value="1">August</option>
                                                                <option value="1">September</option>
                                                                <option value="1">October</option>
                                                                <option value="1">NOvember</option>
                                                                <option value="1">December</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="single_form">
                                                        <div class="select-date">
                                                            <select>
                                                                <option value="1" selected>Enter Year</option>
                                                                <option value="1">2017</option>
                                                                <option value="1">2018</option>
                                                                <option value="1">2019</option>
                                                                <option value="1">2020</option>
                                                                <option value="1">2021</option>
                                                            </select>
                                                        </div>
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
                                        </form>
                                    </div>        
                                </div>
                                <div role="tabpanel" class="tab-pane" id="done">
                                    <div class="booking-done">
                                        <div class="booking-done-table table-responsive text-center">
                                            <table class="table">
                                                <tr>
                                                    <td><p>1 Room <span>Five Adult & 1 child</span></p></td>
                                                    <td><p>$120 <span>Rate</span></p></td>
                                                    <td><p>5 <span>night</span></p></td>
                                                    <td><p>$550</p></td>
                                                </tr>
                                                <tr class="row2">
                                                    <td><p>tax <span>20% tax</span></p></td>
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
                                            <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour</p>
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
         <!--Room booking end-->
</body>
</html>