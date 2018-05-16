<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>首页</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <#include "./common/commonScript.ftl">
    </head>
<#--header-->
<#include "./common/commonHeader.ftl">
<!-- Left side column. contains the logo and sidebar -->
<#include "./common/commonLeft.ftl">

<!-- Control Sidebar -->
<#include "./common/commonControlSidebar.ftl">
</html>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                首页
                <small>Control panel</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active">Dashboard</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Small boxes (Stat box) &ndash;&gt;-->
            <div class="row">
                <div class="col-lg-3 col-xs-6" style="font-size: 40px">
                   index
                </div>
            </div>
            <!-- /.row (main row) &ndash;&gt;-->
        </section>
    </div>

</div>

<!-- ./wrapper -->
</body>


<!-- page bottom -->
<#include "./common/commonBottom.ftl">
