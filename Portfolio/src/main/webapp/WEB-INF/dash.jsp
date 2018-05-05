<!DOCTYPE html>
<html>
  <head>
<title>Kendra S Ramirez</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="/css/dash.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  <!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-113072203-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-113072203-1');
</script>
</head>
<body>
  <style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif;}
body, html {
    height: 100%;
    color: #4F728E;
    background-color: #253F5B;
    line-height: 1.8;
}

/* Create a Parallax Effect */
.bgimg-1, .bgimg-2, .bgimg-3 {
    background-attachment: fixed;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

/* First image (Logo. Full height) */
.bgimg-1 {
    background-image: url('/images/waterveins.jpg');
    min-height: 90%;
}

/* Second image (Portfolio) */
.bgimg-2 {
    background-image: url("/images/mtbaker.jpg");
    min-height: 400px;
}

/* Third image (Contact) */
.bgimg-3 {
    background-image: url("/images/port.jpg");
    min-height: 400px;
}

.wide {letter-spacing: 10px;}
.hover-opacity {cursor: pointer;}

/* Turn off parallax scrolling for tablets and phones */
@media only screen and (max-device-width: 1024px) {
    .bgimg-1, .bgimg-2, .bgimg-3 {
        background-attachment: scroll;
    }
}
</style>

<!-- Navbar (sit on top) -->
<div class="top">
  <div class="bar" id="myNavbar">
    <a class="bar-item button hover-black hide-medium hide-large right" href="javascript:void(0);" onclick="toggleFunction()" title="Toggle Navigation Menu">
      <i class="fa fa-bars"></i>
    </a>
    <a href="#home" class="bar-item button">HOME</a>
    <a href="#about" class="bar-item button hide-small"><i class="fa fa-user"></i> ABOUT</a>
    <a href="#portfolio" class="bar-item button hide-small"><i class="fa fa-th"></i> RESUME</a>
    <a href="#contact" class="bar-item button hide-small"><i class="fa fa-envelope"></i> CONTACT</a>
    <a href="#" class="bar-item button hide-small right hover-red">
      <i class="fa fa-search"></i>
    </a>
  </div>

  <!-- Navbar on small screens -->
  <div id="navDemo" class="bar-block white hide hide-large hide-medium">
    <a href="#about" class="bar-item button" onclick="toggleFunction()">ABOUT</a>
    <a href="#portfolio" class="bar-item button" onclick="toggleFunction()">PORTFOLIO</a>
    <a href="#contact" class="bar-item button" onclick="toggleFunction()">CONTACT</a>
    <a href="#" class="bar-item button">SEARCH</a>
  </div>
</div>

<!-- First Parallax Image with Logo Text -->
<div class="bgimg-1 display-container opacity-min" id="home">
  <div class="display-middle" style="white-space:nowrap;">
    <span class="center padding-large black xlarge wide animate-opacity">Kendra <span class="hide-small">S</span> Ramirez</span>
  </div>
</div>

<!-- Container (About Section) -->
<div class="content container padding-64" id="about">
  <h3 class="center">ABOUT ME</h3>
  <p class="center"><em>I love to code.</em></p>
  <p style="text-align:center;">Welcome to my website.</p>
  <p style="text-align:center;"> I am a Junior Software Developer excited to work in a dynamic team environment. I hope to implement my grit work ethic and learn from Senior Software Developers.
  </p>
  <div class="row">
    <div class="col m6 center padding-large">
      <p><b><i class="fa fa-user margin-right"></i>Kendra Ramirez</b></p><br>
      <img src="/images/photo.jpg" class="round image opacity hover-opacity-off" alt="Photo of Me" width="500" height="333">
    </div>

    <!-- Hide this text on small devices -->
    <div class="col m6 hide-small padding-large">
      <p>I am a Software Developer. My love for computers and technology began at the age of 10. At age 12 I was building websites in my Computer class. By age 15 I was the go to tech mind for family, peers, and mentors. I am passionate about Geography, Software Development, efficiency, and teamwork. I worked for FedEx as a Courier for five years and was always determined to make the most efficient stops to ensure on-time delivery. The best part of that job was that everyday was a new challenge. When I was a student at The University of Washington I could put my desire for dynamic movement into action in a researchable way using data analysis and geographic methods. There I became enamored with data and analysis, and even more so with my internship with NationBuilder/RunForOffice.org. In that position I found myself merging my education and my job experience to be the best GIS (Geographic Information Systems) Analyst Intern for NationBuilder. After graduating in 2017, I took it upon myself to turn a 10 year itch for Software Development to the next level by attending Coding Dojo, where I became fluent in three languages, two databases, and backend development. Java/Spring, Python/Django, and MEAN (Mongoose, Express, Angular, and Node). I know that I could positively contribute my experience and education to the company that I will work for.
      </p>
    </div>
  </div>
  <p class="large center padding-16">I'm really good at:</p>
  <p class="wide"><i class="fa fa-laptop"></i>Web Design { Java/Spring, Python/Django, and MEAN }</p>
  <div class="light-grey">
    <div class="container padding-small dark-grey center" style="width:90%">90%</div>
  </div>
  <p class="wide"><i class="fa fa-wrench"></i>Troubleshooting</p>
  <div class="light-grey">
    <div class="container padding-small dark-grey center" style="width:85%">85%</div>
  </div>
  <p class="wide"><i class="fa fa-industry"></i>Data Analysis</p>
  <div class="light-grey">
    <div class="container padding-small dark-grey center" style="width:75%">75%</div>
  </div>
</div>

<div class="row center dark-grey padding-16">
  <div class="half section">
    <span class="xlarge">10+ Years</span><br>
    Industry Experience
  </div>
  <div class="half section">
    <span class="xlarge">AA, BA, Full-Stack Web Design Certificate</span><br>
    Relevant Accolades
  </div>
</div>

<!-- Second Parallax Image with Portfolio Text -->
<div class="bgimg-2 display-container opacity-min">
  <div class="display-middle">
    <span class="xxlarge text-white wide">PORTFOLIO</span>
  </div>
</div>

<!-- Container (Portfolio Section) -->
<div class="content container padding-64" id="portfolio">
  <h3 class="center">My Resume</h3>
  <p class="center"><em></em></p><br>

  <div class="container">
      <div class="row">
      <div class="col-md-12">
        <div class="page-header">
          <h1>Work and Education History</h1>
        </div>
        <div style="display:inline-block;width:100%;overflow-y:auto;">
        <ul class="timeline timeline-horizontal">
          <li class="timeline-item">
            <div class="timeline-badge edu"><i class="glyphicon glyphicon-check"></i></div>
            <div class="timeline-panel">
              <div class="timeline-heading">
                <h5 class="timeline-title">Coding Dojo</h5>
                <p>
                  <small class="text-muted">
                  <i class="glyphicon glyphicon-time"></i> Certificate of Completion</small></p>

                <p>1 year 2017     <i class="fa fa-mortar-board"></i></p>
              </div>
              <div class="timeline-body">
              </div>
            </div>
          </li>
          <li class="timeline-item">
            <div class="timeline-badge edu"><i class="glyphicon glyphicon-check"></i></div>
            <div class="timeline-panel">
              <div class="timeline-heading">
                <h6 class="timeline-title">The University of Washington</h6>
              </div>
              <div class="timeline-body">
                <p>
                  <small class="text-muted">
                  <i class="glyphicon glyphicon-time"></i> BA Geography - GIS</small></p>

                <p>2 years 2016-2017     <i class="fa fa-mortar-board"></i></p>
              </div>
            </div>
          </li>
          <li class="timeline-item">
            <div class="timeline-badge job"><i class="glyphicon glyphicon-check"></i></div>
            <div class="timeline-panel">
              <div class="timeline-heading">
                <h5 class="timeline-title">Apple</h5>
                <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> AHA - Technical Consultant</small></p>
                <p>1 year 2015-2016     <i class="fa fa-laptop"></i></p>
              </div>
              <div class="timeline-body">
                <%-- <p>Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis.</p> --%>
              </div>
            </div>
          </li>
          <li class="timeline-item">
            <div class="timeline-badge job"><i class="glyphicon glyphicon-check"></i></div>
            <div class="timeline-panel">
              <div class="timeline-heading">
                <h5 class="timeline-title">Comcast</h5>
                <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> Technical Consultant</small></p>
                <p>1 year 2015    <i class="fa fa-laptop"></i></p>
              </div>
              <div class="timeline-body">
                <%-- <p>Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis.</p> --%>
              </div>
            </div>
          </li>
          <li class="timeline-item">
            <div class="timeline-badge edu"><i class="glyphicon glyphicon-check"></i></div>
            <div class="timeline-panel">
              <div class="timeline-heading">
                <h5 class="timeline-title">NSCC</h5>
                <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> Associate of Arts</small></p>
                <p>2 years 2014-2015    <i class="fa fa-mortar-board"></i></p>
              </div>
              <div class="timeline-body">
                <%-- <p>Mussum ipsum cacilds, vidis litro abertis. Consetis adipisci. Mé faiz elementum girarzis, nisi eros gostis.</p> --%>
              </div>
            </div>
          </li>
          <li class="timeline-item">
            <div class="timeline-badge job"><i class="glyphicon glyphicon-check"></i></div>
            <div class="timeline-panel">
              <div class="timeline-heading">
                <h5 class="timeline-title">Federal Express</h5>
                <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> Swing Courier (DOT)</small></p>
                <p>5 years 2010-2015    <i class="fa fa-truck"></i></p>
              </div>
              <div class="timeline-body">
                <%-- <p>Mussum ipsum cacilds, vidis faiz elementum girarzis, nisi eros gostis.</p> --%>
              </div>
            </div>
          </li>

        </ul>
      </div>
      </div>
    </div>
  </div>
</div>

<!-- Modal for full size images on click-->
<div id="modal01" class="modal black" onclick="this.style.display='none'">
  <span class="button large black display-topright" title="Close Modal Image"><i class="fa fa-remove"></i></span>
  <div class="modal-content animate-zoom center transparent padding-64">
    <img id="img01" class="image">
    <p id="caption" class="opacity large"></p>
  </div>
</div>

<!-- Third Parallax Image with Portfolio Text -->
<div class="bgimg-3 display-container opacity-min">
  <div class="display-middle">
     <span class="xxlarge text-white wide">CONTACT</span>
  </div>
</div>

<!-- Container (Contact Section) -->
<div class="content container padding-64" id="contact">
  <%-- <h3 class="center">WHERE I WORK</h3> --%>
  <p class="center"><em>I'd love your feedback!</em></p>

  <div class="row padding-32 section">
    <div class="col m4 container">
      <!-- Add Google Maps -->
      <%-- <div id="googleMap" class="round-large greyscale" style="width:100%;height:400px;"></div> --%>
    </div>
    <div class="col m8 panel">
      <div class="large margin-bottom">
        <i class="fa fa-map-marker fa-fw hover-text-black xlarge margin-right"></i> Seattle, WA<br>
        <i class="fa fa-phone fa-fw hover-text-black xlarge margin-right"></i> Phone: (206) 877-3503<br>
        <i class="fa fa-envelope fa-fw hover-text-black xlarge margin-right"></i> Email: RamirezSKendra@gmail.com<br>
        <i class="fa fa-github fa-fw hover-text-black xlarge margin-right"> <a href="https://github.com/krosebear"></i>My github</a>
      <br>
      <i class="fa fa-linkedin fa-fw hover-text-black xlarge margin-right"> <a href="https://www.linkedin.com/in/kendrasramirez/"></i>My LinkedIn</a>

      </div>
    </div>
  </div>
</div>

<!-- Footer -->
<footer class="center black padding-64 opacity hover-opacity-off">
  <a href="#home" class="button light-grey"><i class="fa fa-arrow-up margin-right"></i>To the top</a>
  <div class="xlarge section">
    <i class="fa fa-github hover-opacity"> <a href="https://github.com/krosebear"></a>
    </i>
    <i class="fa fa-linkedin hover-opacity"> <a href="https://www.linkedin.com/in/kendrasramirez/"></a>
    </i>
  </div>
</footer>
<script>

// Modal Image Gallery
function onClick(element) {
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
  var captionText = document.getElementById("caption");
  captionText.innerHTML = element.alt;
}

// Change style of navbar on scroll
window.onscroll = function() {myFunction()};
function myFunction() {
    var navbar = document.getElementById("myNavbar");
    if (document.body.scrollTop > 100 || document.documentElement.scrollTop > 100) {
        navbar.className = "bar" + " card" + " animate-top" + " white";
    } else {
        navbar.className = navbar.className.replace(" card animate-top white", "");
    }
}

// Used to toggle the menu on small screens when clicking on the menu button
function toggleFunction() {
    var x = document.getElementById("navDemo");
    if (x.className.indexOf("show") == -1) {
        x.className += " show";
    } else {
        x.className = x.className.replace(" show", "");
    }
}
</script>

</body>
</html>
