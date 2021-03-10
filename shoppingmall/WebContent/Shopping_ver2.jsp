<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
<!--custom.css add-->
	<link rel="stylesheet" href=" ./css/custom.css">
<title>ShoppingTest</title>
<style>
#wrapper{
	width:100%;
	height:500px;
	background:#F8F8FF;
	position:relative;
}
#content1{
	position:absolute;
	left:512px;
	top:100px;
	opacity: 0.85;
}
#content2{
	position:absolute;
	left:1024px;
	top:100px;
	opacity: 0.85;
	background-image:url(".../res/woman.jpg");
}
.text-box {
  position: absolute;
  height: 30%;
  text-align: center;
  width: 100%;
  margin: auto;
  top: 0;
  bottom: 0;
  right: 0;
  left: 0;
  font-size: 80px;
  color:#BDB76B;
}
.dataNumber{
  margin-top: auto;
}
#navbar-container{
	margin-left:0px;
}

</style>
</head>
<body>
<div class="navbar-container fixed-top">
  <nav class="navbar navbar-expand-lg navbar-light" style="background-color:#FFF0F2; padding:4px 4px;">
    	<div class="nav-icon">
    		 <img src="./res/instagram.png" style="width:32px; height:32px; margin-left:20px">
    		 <img src="./res/facebook.png" style="width:32px; height:32px; margin-left:10px">
    		 <img src="./res/call.png" style="width:32px; height:32px; margin-left:60px; align-left:0">
    		 <font color="gray" size="2.8rem">010-4652-8608</font>
    		 <font color="gray"></font>
    	</div>
    <a class="navbar-brand" href="#"></a>
  </nav>
</div>
	<nav class="navbar navbar-expand-lg navbar-light" style="background-color:#FFF0F2;">
  <a class="navbar-brand" href="#">ShoppingTest</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
     <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Home
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">Fashion</a>
          <a class="dropdown-item" href="#">Design</a>
        </div>
      </li>
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Shop
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">Shop pages</a>
          <a class="dropdown-item" href="#">product pages</a>
          <a class="dropdown-item" href="#">Icons</a>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Docs
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">Introduction</a>
          <a class="dropdown-item" href="#">Directory structure</a>
          <a class="dropdown-item" href="#">Gulp</a>
          <a class="dropdown-item" href="#">Customizing CSS</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://d19m59y37dris4.cloudfront.net/varkala/1-2/img/photo/home-1-plain.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>First slide label</h5>
        <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="https://d19m59y37dris4.cloudfront.net/varkala/1-2/img/photo/home-2-plain.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Second slide label</h5>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="https://d19m59y37dris4.cloudfront.net/varkala/1-2/img/photo/home-3-plain.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Third slide label</h5>
        <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
      </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<div id="wrapper">
	<div id="content1">
		<img src="../res/man/jpg" style="width:400px; height:500px">
			<div class='text-box'>
   			<p class='dataNumber'> MAN </p>
			</div>
	</div>
	<div id="content2">
		<img src="./res/man/jpg" style="width:400px; height:500px">
			<div class='text-box'>
   			<p class='dataNumber'> WOMAN </p>
	</div>
</div>
</div>
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>