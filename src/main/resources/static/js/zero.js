$('.active a').click(function(){
		$('.active a').css({'border-left':'none','background':'#f7f8fa'});
		$(this).css({'border-left':'4px solid #ffa9b6','background':'#fff','box-sizing':'border-box'});	
	}
)

$('.xka2 span').click(function(){
	$('.xka2 span').css({'border-bottom':'none','color':'#333'});
	$(this).css({'border-bottom':'2px solid #ff2661','color':'#ff2661'});	
})
$('.xka2-1>span').click(function(){
	$(this).parent().remove();
})