<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Infinity - Bootstrap Admin Template</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
	<meta name="description" content="Admin, Dashboard, Bootstrap" />
	<link rel="shortcut icon" sizes="196x196" href="../../UnipointWeb/resources/assets/images/logo.png">
	
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/material-design-iconic-font/dist/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/libs/bower/animate.css/animate.min.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/assets/css/bootstrap.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/assets/css/core.css">
	<link rel="stylesheet" href="../../UnipointWeb/resources/assets/css/misc-pages.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:400,500,600,700,800,900,300">
</head>
<body class="simple-page">
	<div id="back-to-home">
		
	</div>
	<div class="simple-page-wrap">
		<div class="simple-page-logo animated swing">
			<a href="login.html">
				<span><i class="fa fa-gg"></i></span>
				<span>Unipoint</span>
			</a>
		</div><!-- logo -->
		<div class="simple-page-form animated flipInY" id="login-form">
	<h4 class="form-title m-b-xl text-center">Sign In With Your Unipoint Account</h4>
	<form action="login" method="POST">
		<div class="form-group">
			<input id="sign-in-email" type="name" name="uname" class="form-control" placeholder="username" required="required">
		</div>

		<div class="form-group">
			<input id="sign-in-password" type="password" name="pass" class="form-control" placeholder="Password" required="required">
		</div>

		<div class="form-group m-b-xl">
			<div class="checkbox checkbox-primary">
				<input type="checkbox" id="keep_me_logged_in"/>
				<label for="keep_me_logged_in">Keep me signed in</label>
			</div>
		</div>
		<input type="submit" class="btn btn-primary" value="SIGN IN">
	</form>
</div><!-- #login-form -->

<div class="simple-page-footer">
	<p><a href="password-forget.html">FORGOT YOUR PASSWORD ?</a></p>
	<p>
		<small>Don't have an account ?</small>
		<a href="<%=request.getContextPath()%>/SignUp">CREATE AN ACCOUNT</a>SignUp
	</p>
</div><!-- .simple-page-footer --> 


	</div><!-- .simple-page-wrap -->
</body>
</html>