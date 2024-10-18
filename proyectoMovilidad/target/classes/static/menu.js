function abrirmenu() {
    const desplegable = document.getElementById("contenido")
    const Mobile = window.matchMedia("(max-width: 767px)").matches;

    if (Mobile) {

		console.log("Pepe");
        //Version de mobiles
        desplegable.classList.toggle("abierto");
        document.getElementById("overlay-bg").style.display = "block";
    } else {
        //Version de table y escritorio
        desplegable.style.width = "400px";
        document.getElementById("overlay-bg").style.display = "block"; 
    }
}

function cerrarmenu() {
    const desplegable = document.getElementById("contenido")
    const Mobile = window.matchMedia("(max-width: 767px)").matches
    if (Mobile) {
        desplegable.classList.remove("abierto");
        document.getElementById("overlay-bg").style.display = "none"; 
    } else {
        desplegable.style.width = "0";
        document.getElementById("overlay-bg").style.display = "none"; 
    }
}

// Cerrar el menú cuando se hace clic fuera del menú
document.addEventListener('click', function(event) {
    const desplegable = document.getElementById("contenido");
    const botonmenu = document.querySelector('.boton-menu');

    if (!desplegable.contains(event.target) && !botonmenu.contains(event.target)) {
        cerrarmenu();
    }
});

function irAPagina(url) {
    window.location.href = url;
  }