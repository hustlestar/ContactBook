<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <link rel="icon" href="../../favicon.ico">

    <title>Narrow Jumbotron Template for Bootstrap</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          crossorigin="anonymous">

    <link href="../css/cover.css" rel="stylesheet">

    <!-- Latest compiled and minified JavaScript -->
</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">Personal contact book</h3>
                    <nav>
                        <ul class="nav masthead-nav">
                            <li id="home" class="active"><a href="#">Home</a></li>
                            <li id="features"><a href="#">Features</a></li>
                            <li id="about"><a href="#">About</a></li>
                        </ul>
                    </nav>
                </div>
            </div>


            <div class="inner cover">
                <h1 class="cover-heading">Cover your page.</h1>
                <p class="lead">Cover is a one-page template for building simple and beautiful home pages. Download,
                    edit the text, and add your own fullscreen background photo to make it your own.</p>
                <p class="lead">
                    <a href="/login" class="btn btn-lg btn-default">Log me in</a>
                </p>
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>Cover template for <a href="http://getbootstrap.com">Bootstrap</a>, by <a
                            href="https://twitter.com/mdo">@mdo</a>.</p>
                </div>
            </div>

        </div>

    </div>

</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" crossorigin="anonymous"></script>
<script type="javascript">
    $(document).ready(function () {
        $("#home").click(function () {
            $("#home").addClass("active");
            $("#features").removeClass("active");
            $("#about").removeClass("active");
        });
        $("#features").click(function () {
            $("#home").removeClass("active");
            $("#features").addClass("active");
            $("#about").removeClass("active");
        });
        $("#about").click(function () {
            $("#home").removeClass("active");
            $("#features").removeClass("active");
            $("#about").addClass("active");
        });
    });
</script>
</body>
</html>

