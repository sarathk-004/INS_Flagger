function toggleMap() {
  var liveMapSection = document.getElementById("livemap");
  liveMapSection.classList.add("map-cont-show");

  setTimeout(function () {
    liveMapSection.scrollIntoView({ behavior: "smooth", block: "start" });
  }, 500);
}