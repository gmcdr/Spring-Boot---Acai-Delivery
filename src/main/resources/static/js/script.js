const sr = ScrollReveal({
    origin: 'top',
    distance: '30px',
    duration: 2000,
    reset: true
});

sr.reveal(`.home, .home__img,
            .sobre, .products,
            .card, .servicos,
            .testimonial,
            .contact__data, .contact__button,
            .footer__content`, {
    interval: 200
})

function sucess() {
    alert("Compra realizada com sucesso !")
}