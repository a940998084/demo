

// 返回顶部
var oL = document.getElementById('lin');
		$('#lin').click(function(){
			$('html,body').animate({'scrollTop':'0'},500)
		})
window.onscroll = window.onresize = function(ev){
		var oEvent = ev ||event;
		var scrollTop = document.documentElement.scrollTop;
		
		if (scrollTop>500){
			oL.style.display='block'
		}
		if (scrollTop<100) {
			oL.style.display="none"
		}
	}

// 隐藏热门搜索
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
		$('.light-login').fadeOut()
		$('.cover').fadeOut()
})
$('.cover').click(function(){
		$('.light-login').fadeOut()
		$('.cover').fadeOut()
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

$('#text').click(function(){
		$('.light-login').show()
		$('.cover').show()
})



// 二维码
var oYc = document.getElementById('yc');
	var oYx = document.getElementById('yx');
	oYx.onmouseover = function(){
		oYc.style.display = 'block';
	}
	oYx.onmouseout = function(){
		oYc.style.display = 'none';
	}
	oYc.onmouseover = function(){
		oYc.style.display = 'block';
	}
	oYc.onmouseout = function(){
		oYc.style.display = 'none';
	}
