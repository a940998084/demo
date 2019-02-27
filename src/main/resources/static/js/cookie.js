// 设置cookie
function setCookie(name,value,iDay){
	if(iDay){
		var oDate = new Date();
		oDate.setDate(oDate.getDate()+iDay);
		document.cookie=name+'='+value+';path=/;expires='+oDate;
	}else{
		document.cookie=name+'='+value+';path=/';
	}
}


// 获取cookie
function getCookie(name){
	var arr = document.cookie.split('; ');
	for(var i=0; i<arr.length; i++){
		var tmp = arr[i].split('=');
		if(name == tmp[0]){
			return tmp[1];
		}
	}
}

// 删除cookie
function removeCookie(name){
	setCookie(name,'',-1);
}