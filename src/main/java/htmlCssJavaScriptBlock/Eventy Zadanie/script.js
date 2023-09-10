console.log("Plik JavaScript jest poprawnie podłączony do pliku index.html")
function showModal() {
    const warning = document.querySelector('#warning').classList
    warning.remove("hidden")
}
const warningBtn = document.querySelector("#modal-btn")
warningBtn.addEventListener("click", showModal)
// 1.
// Stwórz funkcję która będzie chować modal, analogicznie jak w omawianym przykładzie.
// Następnie dodaj do przycisku ukrywania, listener który odpali funkcje chowania modala
function hideModal() {
    const warning = document.querySelector('#warning').classList;
    warning.add("hidden")
}
const warningBtn2 = document.querySelector('#modal-btn2');
warningBtn2.addEventListener('click', hideModal)
// * Spraw żeby przycisk zmieniający kolor tła strony, zmienił tło strony
// function changeBg() {
//     const newBg = document.querySelector('body')
//     newBg.style.backgroundColor = "darkslateblue";
// }
// const changeBgBtn = document.querySelector("#bg-btn")
// changeBgBtn.addEventListener("click", changeBg)
// ** Niech przycisk który zmienia tło strony, sprawia że tło będzie za każdym razem inne (losowo).
// Wykorzystaj do tego tą zmienną:
// let randomColor = Math.floor(Math.random()*16777215).toString(16);
function randomBg() {
    // umieszczamy randomColor w funkcji, żeby losował się od nowa za każdym razem gdy odpalamy funkacje
    let randomColor = Math.floor(Math.random()*16777215).toString(16);
    // Wrzucamy randomColor do consol loga, widzimy że zwraca nam kod hex bez #, trzeba będzie ją dodać
    console.log(randomColor)
    document.querySelector('body').style.backgroundColor = "#" + randomColor;
}
const randomBgBtn= document.querySelector('#bg-btn');
randomBgBtn.addEventListener('click', randomBg)