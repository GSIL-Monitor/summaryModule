<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar" id="menu">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="../static/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>邓盛余</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
            </div>
        </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">导航</li>

            <#--一级菜单-->
            <#list menu as menuOne>
                <#if (menuOne?size>0) && menuOne.pid==1>
                    <#--<li class="active treeview">-->
                    <li class="treeview">
                        <#--有二级菜单的添加下拉箭头-->
                            <#assign num = 0>
                            <#list menu as menuArrow>
                                <#if (menuArrow?size>0) && menuArrow.pid==menuOne.id>
                                    <#assign num = 0+1>
                                </#if>
                            </#list>
                            <#if (num>0)>
                            <a href="#">
                                <span class="nav-label">${menuOne.name}</span>
                                <span class="pull-right-container">
                                        <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <#else >
                                <a href="${basePath}${menuOne.url}">
                                    <span class="nav-label">${menuOne.name}</span>
                                    <span class="pull-right-container">
                                    </span>
                                </a>
                            </#if>
                        <#--二级菜单-->
                        <ul class="treeview-menu">
                            <#list menu as menuTow>
                                <#if (menuTow?size>0) && menuTow.pid==menuOne.id>
                                        <li class="active">
                                            <a href="index.html"><i class="fa fa-circle-o"></i>${menuTow.name}</a>
                                        </li>
                                </#if>
                            </#list>
                        </ul>
                    </li>
                </#if>
            </#list>

            <li class="header">标签重要性</li>
            <li><a href="#"><i class="fa fa-circle-o text-red"></i> <span>重要</span></a></li>
            <li><a href="#"><i class="fa fa-circle-o text-yellow"></i> <span>警告</span></a></li>
            <li><a href="#"><i class="fa fa-circle-o text-aqua"></i> <span>信息</span></a></li>
        </ul>

    </section>
    <!-- /.sidebar -->
    <script>
        $(document).ready(function(){

        })
    </script>
</aside>