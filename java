let name = "mimmie";

function greet(name) {
  console.log ('Hej ' + name);
}
greet ('Du som rättar detta');

greet ('IT-Högskolan!');

var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2000); // Change image every 4 seconds
}


/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(e) {
  if (!e.target.matches('.dropbtn')) {
  var myDropdown = document.getElementById("myDropdown");
    if (myDropdown.classList.contains('show')) {
      myDropdown.classList.remove('show');
    }
  }
}
//klocka//
<!-- Göm
function startaKlockan()
{
var tidenNu=new Date();
var timmeNu=tidenNu.getHours();
var minutNu=tidenNu.getMinutes();
var sekundNu=tidenNu.getSeconds();
  if (timmeNu<10)
    timmeNu="0"+timmeNu;
  if (minutNu<10)
    minutNu="0"+minutNu;
  if (sekundNu<10)
    sekundNu="0"+sekundNu;
document.klockForm.startPlats.value="Klockan är " + timmeNu +":"+ minutNu +":"+ sekundNu;
setTimeout('startaKlockan()',1000);
}
// Sluta gömma klockan -->
