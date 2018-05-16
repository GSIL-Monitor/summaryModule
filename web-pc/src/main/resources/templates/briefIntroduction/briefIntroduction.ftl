<#assign basePath=request.contextPath>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>News Theme</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="../../static/bower_components/bootstrap/dist/css/bootstrap.min.css">

    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700|Old+Standard+TT" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Old+Standard+TT:400,500,700" rel="stylesheet">
    <!--    <link rel="stylesheet" type="text/css" href="css/animate.css" /> -->
    <link rel="stylesheet" type="text/css" href="../../static/css/prettyPhoto.css" />
    <link href="../../static/css/jquery.bsPhotoGallery.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../../static/css/style.css">
</head>

<body>
<header style="height: 280px">
    <div class="container">
        <div class="singnature">
            <#--<img src="images/signature.png" alt="sign">-->
        </div>
        <div class="share-sec">

        </div>
        <a href="javaScript:" onclick="prompt('开发者处于在职状态，简历正在丰满')" class="download-sec right">下载开发者简历</a>
        <div class="profile-img">
            <img src="../../static/img/logo.png" width="360px" height="360px">
        </div>
    </div>
</header>
<div class="banner-sec">
    <div class="container">
        <div class="menu-bar">
            <ul>
                <li class="active">
                    <a href="javascript:" id="synopsis">简介</a>
                </li>
                <li>
                    <a href="${basePath}/login/index">返回首页</a>
                </li>
                <li>
                    <a href="javaScript:" onclick="prompt('帅气的开发者正在加紧制作app')">app下载 </a>
                </li>
                <li>
                    <a href="javaScript:" onclick="prompt('开发者qq号:2686151092')">调戏开发者小哥哥 </a>
                </li>

            </ul>
        </div>
        <h2>
            只要我们敢梦想，我们就能去实现！
        </h2>
    </div>
</div>
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-12 col-sm-12" style="align-content: center">
                <h6 class="right copy-right"  style="align-content: center">(C) 2017. All Rights. Mr.dengshengyu.Thanks</h6>
            </div
        </div>
    </div>
</footer>
<script src="../../static/bower_components/jquery/dist/jquery.min.js"></script>
<script src="../../static/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<script src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
<script src="../../static/js/jquery.mixitup.min.js"></script>
<script type="text/javascript" src="../../static/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="../../static/js/jquery.isotope.js"></script>
<script src="../../static/js/jquery.bsPhotoGallery.js"></script>
<script type="text/javascript" src="../../static/js/main.js"></script>

<script  src="../../static/layer/layer.js"></script>
<script>
    $(document).ready(function() {
        $('ul.first').bsPhotoGallery({
            "classes": "col-md-3 col-sm-4 col-2 ",
            "hasModal": true,
            // "fullHeight" : false
        });
    });

    var prompt = function(msg){
        layer.msg(msg);
    }

    $("#synopsis").click(function(){

        layer.msg("<div style='padding: 50px 130px 50px 130px;'>" +
                "<div style='font-size: 30px;'>简介</div>" +
                "<div style='padding-top: 30px;'>欢迎光临小站</div>" +
                "<div>本站致力于提供稳定实惠的服务</div>" +
                "<div>祝您使用愉快</div>" +
                "<div style='padding-top: 30px;padding-bottom: 20px'>您对小站的服务是否满意?<div>" +
                "</div>",
                    {time: 0,//不自动关闭
                     btn: ['必须啊', '很不满'],
                     yes: function(index,layero){
                        layer.close(index);
                        layer.msg("您可为小站打赏支持小站的运行");
                     },
                     btn2: function (index,layero) {
                         layer.close(index);
                        layer.msg("请问您对小站有什么建议");
                     },
                     btnAlign: 'c',//按钮排列
                     area: ['600px', '400px'],
                     anim: 1//弹出动画从上掉落
                    },
        );

    })



</script>
</body>

</html>