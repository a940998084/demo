$(function(){
    // 全部演出
    $(".nav .lei li.ashow").mouseenter(function(){
        $(".nav .lei li.ashow .submenu").fadeIn()
        });
    $(".nav .lei li.ashow").mouseleave(function(){
        $(".nav .lei li.ashow .submenu").fadeOut()
        });
    // 手机票牛
    $(".nav .right .app").mouseenter(function(){
        $(".nav .right .app .submenu1").fadeIn()
        });
    $(".nav .right .app").mouseleave(function(){
        $(".nav .right .app .submenu1").fadeOut()
        });
    //问号隐藏
    $(".type-desc .line img:eq(1)").mouseenter(function(){
        $(".info-desc").fadeIn()
        });
    $(".type-desc .line img.wen").mouseleave(function(){
        $(".info-desc").fadeOut()
        });

    $(".content .content-left .content1-nav a").click(function(){
        $(".content .content-left .content1-nav a").removeClass("active");
        $(this).addClass("active");
    })
    // 想看
    var num = 0;
    $(".wish p.text1").click(function(){
        if(num==0){
            num=1;
        $(".suc").css({"display":"block"});
        $(this).css({"background": "url(../img/1-heart.aaa0e468.png) no-repeat center 5px","backgroundSize":"19px 19px"})
        }else{
           $(".suc").css({"display":"block"}); 
           $(".suc").html("取消关注")
            $(this).css({"background": "url(../img/1-heart-thin-grey.ae0c2813.png) no-repeat center 5px","backgroundSize":"19px 19px"})
        }
        
        var wait=10;
        var timer = null;
        clearInterval(timer)
        timer=setInterval(function(){
            wait--;
            console.log(wait)
            if(wait==0){
                clearInterval(timer)
            $(".suc").fadeOut()
        }
        },1000)
        
    })
    $(".select .items>p").click(function(){
        $(".select .items>p").removeClass("selected")
        $(this).addClass("selected")
       
    })
    
     $("div.item").click(function(){
        $("div.item").removeClass("selected")
        $(this).addClass("selected")
        $(".price .sum1 span").html(parseInt($(this).html()))
        $(".price .common").html(parseInt($(this).html())+"/张")
        var number =  $(".sum1 span").html()
        console.log(number)
        number1 = number
    })
    var number =  $(".sum1 span").html()
     $("li.item").click(function(){
        $(".sum1 span").html(number*$(this).html())
     })
     $("li.item").click(function(){
        $("li.item").removeClass("selected")
        $(this).addClass("selected")
        $(".sum1 span").html(number1*$(this).html())
        // console.log($(this).html())
        // console.log($(".sum1 span").html())
    })
    $(window).on("scroll",function(){
        var scrollT = $(document).scrollTop();
        var height = $(".content .content-left .content1").offset().top;
        if(scrollT >= height){
            $(".content .content-left .btn-show").css({
                "display":"block"
            });
        }else{
            $(".content .content-left .btn-show").css({
                "display":"none"
            });
        }
    })

})