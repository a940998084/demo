// 头部

$('.title-login').click(function(){
	
	$('.title2').removeClass('title-login')
    $('.title2').addClass('title-quick-login')
 
    $('.title1').removeClass('title-quick-login')
    $('.title1').addClass('title-login')
	$(".form-login").css({'display':'block'})
	$('.form-quick-login').css({'display':'none'})
})
$('.title-quick-login').click(function(){
	
	$('.title2').removeClass('title-quick-login')
    $('.title2').addClass('title-login')
 
    $('.title1').removeClass('title-login')
    $('.title1').addClass('title-quick-login')
	$(".form-login").css({'display':'none'})
	$('.form-quick-login').css({'display':'block'})
})
$('.close').click(function(){
		$('.cover-login').fadeOut()
})
$('.cover').click(function(){
		$('.cover-login').fadeOut()
})
$('.login-icon').click(function(){
	$('.cover-login').css({'display':'block'})
})
$('.app-icon,.app--icon').mouseenter(function(){
	$('.apptwo').css({'display':'block'})
})
$('.app-icon,.app--icon').mouseleave(function(){
	$('.apptwo').css({'display':'none'})
})

$('.apptwo').mouseenter(function(){
	$('.apptwo').css({'display':'block'})
})
$('.apptwo').mouseleave(function(){
	$('.apptwo').css({'display':'none'})
})
// 城市选择器
var oTj = $("#J").offset().top
$("#j").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTj-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});



$("#a").click(function() {
	
$(".hot-cities").animate({
scrollTop: $("#A").offset().top-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});



var oTb =  $("#B").offset().top

$("#b").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTb -$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTc = $("#C").offset().top
$("#c").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTc -$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTd = $("#D").offset().top

$("#d").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTd-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTf = $("#F").offset().top

$("#f").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTf - $('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTg = $("#G").offset().top

$("#g").click(function() {
	
$(".hot-cities").animate({
scrollTop:oTg -$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTh = $("#H").offset().top

$("#h").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTh-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTk = $("#K").offset().top

$("#k").click(function() {
	
$(".hot-cities").animate({
scrollTop:oTk -$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTl = $("#L").offset().top
$("#l").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTl-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTm = $("#M").offset().top
$("#m").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTm-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTn = $("#N").offset().top

$("#n").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTn-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTp = $("#P").offset().top
$("#p").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTp-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});



var oTq = $("#Q").offset().top
$("#q").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTq-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTr = $("#R").offset().top
$("#r").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTr-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTs = $("#S").offset().top
$("#s").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTs-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTt = $("#T").offset().top
$("#t").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTt-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTw = $("#W").offset().top
$("#w").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTw-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


var oTx = $("#X").offset().top
$("#x").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTx-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTy = $("#Y").offset().top
$("#y").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTy-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});

var oTz = $("#Z").offset().top
$("#z").click(function() {
	
$(".hot-cities").animate({
scrollTop: oTz-$('.hot-cities').offset().top }, {duration: 500,easing: "swing"});
return false;
});


$('.citylist').css({'display':'none'})



var num = 0

$('.city-name').click(function(){
	if (num == 0) {
		num=1
	$('.citylist').css({'display':'block'})
   }else{
   	num = 0
   	$('.citylist').css({'display':'none'})
   }
})





$('.asdf>li').click(function(){
	$('.selected').html($(this).html()) 
	$('.city-name').html($(this).html())
	$('.citylist').css({'display':'none'})      
})

