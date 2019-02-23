$('#gb').click(function(){
	$('#ygb').css({'display':'none','z-index':'2'})
	$('.zz').css({'display':'none'})
})
$('#dk').click(function(){
	$('#ygb').css({'display':'block','z-index':'2'})
	$('.zz').css({'display':'block'})
})
$('.pop_up_content  .wkf2-6,button').click(function(){
	$('#ygb').css({'display':'none','z-index':'2'})
	$('.zz').css({'display':'none'})
})
var Gid  = document.getElementById ;
var showArea = function(){
	Gid('show').innerHTML = "<h3>省" + Gid('s_province').value + " - 市" + 	
	Gid('s_city').value + " - 县/区" + 
	Gid('s_county').value + "</h3>"
}
// Gid('s_county').setAttribute('onchange','showArea()');