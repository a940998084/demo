// 手机登陆
$('.foor-zi3').mouseover(function(){
	$('.hcl-foou').show();
})
$('.hcl-foou').mouseout(function(){
	$('.hcl-foou').hide();
})
// 密码登陆
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
$('.foor-zi1').click(function(){
		$('.cover-login').fadeOut()
})
$('.cover').click(function(){
		$('.cover-login').fadeOut()
})
$('.foor-zi1').click(function(){
	$('.cover-login').css({'display':'block'})
})
$('.close').click(function(){
		$('.cover-login').fadeOut()
})
// 底部
$('.hot-find').mouseenter(function(){
	$('.hot-search').css({'display':'block'})
})
$('.hot-find').mouseleave(function(){
	$('.hot-search').css({'display':'none'})
})
$('.hot-search').mouseenter(function(){
	$('.hot-search').css({'display':'block'})
})
$('.hot-search').mouseleave(function(){
	$('.hot-search').css({'display':'none'})
})
	

	function getPos(obj){
		var l = 0;
		var t = 0;
		while(obj){
			l+=obj.offsetLeft;
			t+=obj.offsetTop;
			obj = obj.offsetParent;
		}

		return {left:l,top:t};
	}


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
