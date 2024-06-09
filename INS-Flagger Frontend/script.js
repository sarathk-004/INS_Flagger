function toggleHome() {
  var aboutSection = document.getElementById("about");
  var liveMapSection = document.getElementById("livemap");
  var loginSection = document.getElementById("login");
  var signupSection = document.getElementById("signup");
  var contactSection = document.getElementById("contact");
  var homeSection = document.getElementById("home")

  homeSection.classList.add("home-show");
  aboutSection.classList.remove("about-show");
  liveMapSection.classList.remove("map-cont-show");
  loginSection.classList.remove("login-show");
  signupSection.classList.remove("signup-show");
  contactSection.classList.remove("contact-show");


  setTimeout(function () {
    aboutSection.scrollIntoView({ behavior: "smooth", block: "start" });
  }, 500);
}



function toggleAbout() {
  var aboutSection = document.getElementById("about");
  var liveMapSection = document.getElementById("livemap");
  var loginSection = document.getElementById("login");
  var signupSection = document.getElementById("signup");
  var contactSection = document.getElementById("contact");
  var homeSection = document.getElementById("home")

  aboutSection.classList.add("about-show");
  liveMapSection.classList.remove("map-cont-show");
  loginSection.classList.remove("login-show");
  signupSection.classList.remove("signup-show");
  contactSection.classList.remove("contact-show");
  

  setTimeout(function () {
    aboutSection.scrollIntoView({ behavior: "smooth", block: "start" });
  }, 500);
}

function toggleLogin() {
  var aboutSection = document.getElementById("about");
  var loginSection = document.getElementById("login");
  var signupSection = document.getElementById("signup");
  var contactSection = document.getElementById("contact");

  aboutSection.classList.remove("about-show");
  loginSection.classList.add("login-show");
  signupSection.classList.remove("signup-show");
  contactSection.classList.remove("contact-show")

  setTimeout(function () {
    loginSection.scrollIntoView({ behavior: "smooth", block: "start" });
  }, 500);
}

function toggleSignUp() {
  var aboutSection = document.getElementById("about");
  var loginSection = document.getElementById("login");
  var signupSection = document.getElementById("signup");
  var contactSection = document.getElementById("contact");

  aboutSection.classList.remove("about-show");
  loginSection.classList.remove("login-show");
  signupSection.classList.add("signup-show");
  contactSection.classList.remove("contact-show")
  
  setTimeout(function () {
    signupSection.scrollIntoView({ behavior: "smooth", block: "start" });
  }, 500);
}

function toggleContact() {
  var aboutSection = document.getElementById("about");
  var loginSection = document.getElementById("login");
  var signupSection = document.getElementById("signup");
  var contactSection = document.getElementById("contact");

  aboutSection.classList.remove("about-show");
  loginSection.classList.remove("login-show");
  signupSection.classList.remove("signup-show");
  contactSection.classList.add("contact-show");

  setTimeout(function () {
    signupSection.scrollIntoView({ behavior: "smooth", block: "start" });
  }, 500);
}



