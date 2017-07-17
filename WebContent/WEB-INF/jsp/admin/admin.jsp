<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<link rel="shortcut icon" href="favicon.ico">

<link rel="stylesheet" href="resources/libs/bootstrap/css/bootstrap.min.css" >
<link rel="stylesheet" href="resources/libs/ionicons/css/ionicons.min.css">
<link rel="stylesheet" href="resources/libs/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="resources/libs/admin-lte2/css/AdminLTE.min.css">
<link rel="stylesheet" href="resources/libs/admin-lte2/css/skins/skin-green.min.css">


<script src="resources/libs/bootstrap/js/jquery-3.2.1.min.js" ></script>
<script src="resources/libs/bootstrap/js/bootstrap.min.js" ></script>
<script src="resources/libs/admin-lte2/js/app.js"></script>
<style >

</style>
<title>Hello JSP</title>
</head>
<body class="hold-transition skin-green sidebar-mini">
<div class="wrapper">

  <header class="main-header">

    <!-- Logo -->
    <a href="index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>T</b>MZ</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>TIRMI</b>ZEE</span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
     
          <!-- User Account: style can be found in dropdown.less -->
          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <img src="resources/libs/admin-lte2/img/admin.png" class="user-image" alt="User Image">
              <span class="hidden-xs">${sessionScope.user.firstName} ${sessionScope.user.lastName}</span>
            </a>
            <ul class="dropdown-menu">

              <!-- User image -->
              <li class="user-header">
                <img src="resources/libs/admin-lte2/img/admin.png" class="img-circle" alt="User Image">

                <p>
                  ${sessionScope.user.firstName} ${sessionScope.user.lastName} - Web Developer
                  <small>software engineer</small>
                </p>
              </li> <!--end User image -->
           
             
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                  <a href="Logout" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li><!-- end Menu Footer-->
            </ul>
          </li> <!--end User Account: style can be found in dropdown.less -->
          
          
        </ul>
      </div>  <!--end Navbar Right Menu -->

    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="resources/libs/admin-lte2/img/admin.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>${sessionScope.user.firstName} ${sessionScope.user.lastName}</p>
          <a href="">${sessionScope.user.roleName}</a>
        </div>
      </div>
     
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        
       
        <li class="active treeview" >
          <a href="#">
            <i class="fa fa-briefcase" style="height: 20px;"></i>
            <span>Role Management</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right" ></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="fa fa-circle-o"></i> permission </a></li>
           
          </ul>
        </li>
       
       
        <li>
          <a href="#">
            <i class="fa fa-calendar" style="height: 20px;"></i> <span>Calendar</span>
            <span class="pull-right-container">
              <small class="label pull-right bg-red">1</small>
              
            </span>
          </a>
        </li>
       
       
         </ul>
       
         
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Dashboard
        <small>Version 0.1</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Dashboard</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
     
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Tirmizee Version</b> ${initParam['AppVersion']}
    </div>
    <strong>Copyright &copy; 2017 </strong> All rights
    reserved.
  </footer>


  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>

</div>
<!-- ./wrapper -->


<script>

</script>
</body>
</html>