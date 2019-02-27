$(function() {
	var Accordion = function(el, multiple) {
		this.el = el || {};
		this.multiple = multiple || false;

		// Variables privadas
		var links = this.el.find('.link');
		// Evento
		links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown)
	}

	Accordion.prototype.dropdown = function(e) {
		var $el = e.data.el;
			$this = $(this),
			$next = $this.next();

		$next.slideToggle();
		$this.parent().toggleClass('open');

		if (!e.data.multiple) {
			$el.find('.submenu').not($next).slideUp().parent().removeClass('open');
		};
	}	

	var accordion = new Accordion($('#accordion'), false);
});

// 内容选择
	var aLi = document.querySelectorAll('.tab');
	var aLi1 = document.querySelectorAll('#tab');
	for (var i = 0; i < aLi.length; i++) {
		aLi[i].index = i;
		aLi[i].onclick = function(){
				for (var j = 0; j < aLi1.length; j++) {
					aLi[j].className = '';
					aLi1[j].className = '';
				}
				this.className="change"
				aLi1[this.index].className = "active";
		}
	}
	// $('.tab').click(function(){
	// 	alert($(this).index())
	// 	$('ol li').eq($(this).index()).addClass('active').siblings().removeClass('active');
	// })