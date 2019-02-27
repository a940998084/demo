
$('#hy p').click(function(){
	$('#hy p').css({'border-bottom':'0px solid #ff2661','color':'#000'})
	$(this).css({'border-bottom':'2px solid #ff2661','color': '#ff2661'})
})
$('#dh').click(function(){
	$('#xs,#zz').css({'display':'block'});
})
$('#xx').click(function(){
	$('#xs,#zz').css({'display':'none'})
})
$('#hy p').eq(1).click(function(){
	$('.yhj').css({'display':'none'})
})
$('#hy p').eq(0).click(function(){
	$('.yhj').css({'display':'flex'})
})