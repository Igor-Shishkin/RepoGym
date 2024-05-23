console.log("Plik JavaScript jest poprawnie podłączony do pliku index.html")

const headerElement = document.getElementById('website-header');
const goldElements = document.getElementsByClassName('gold-paragraph');
const pElements = document.getElementsByTagName('p');
const selectorElement = document.querySelector('.gold-paragraph');
const selectorElements = document.querySelectorAll('.gold-paragraph');


const father = document.querySelector("#main")
const child = document.createElement('p')
child.innerText = "Zapraszam do pozostania na mojej stronie"
father.appendChild(child)





// 2. Jak widzisz na stronie są dwa złote powitania. Usuń jedno z nich.

childForDelete = document.getElementById("forDelete")
father.removeChild(childForDelete)


// 3. Zmień treść nagłówku z "Strona Internetowa" na "Moja Strona Internetowa"

childHead = document.querySelector('h1')
childHead.innerText = "Moja Strona Internetowa"

// 1. W stopce brakuje miejsca na autora, stwórz nowy element w stopce, z treścią - "Strona zrobiona przez: <twoje imie>"
const fatherFooter = document.querySelector("footer")
const childAuthor = document.createElement('p')
childAuthor.innerText = "Author: Igor Shishkin"
fatherFooter.appendChild(childAuthor);

