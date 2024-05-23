console.log("Plik JavaScript jest poprawnie podłączony do pliku index.html")

// 1. Stwórz funkcję która będzie sprwadzać czy użytkownik jest pełnoletni. 
// Funkcja przyjmuje wiek użytkwonika i zwraca prawdę jeśli użytkonik jest pełnoletni, lub fałsz.
// Jak to powinno działać: po wywołaniu funkacji checkAdult(20), zostanie zwrócone true

const age = 10;
if (age < 0) {
    console.log("wrong value")
} else if (age < 17) {
    console.log(false)
} else {
    console.log(true)
}



// 2. Stwórz funkcję która będzie sprawdzać czy użytkwonik jest rocznikowo pełnoletni, na podstawie jego daty urodzenia.
// Funkcja przyjmuje date urodzenia użytkownika, obecny rok i zwraca prawdę jeśli użytkonik jest pełnoletni, lub fałsz.
// Jak to powinno działać: po wywołaniu funkacji checkAdult(1990, 2023), zostanie zwrócone true


var yearsOfBirth = 2010
var currentYear = 2023
function ifAdultWithCurrentYear(a, b) {
    const age = b - a
    if (age < 0) {
        return "wrong value"
    } else if (age < 17) {
        return false
    } else {
        return true
    }
}
console.log("date of birth: ", yearsOfBirth, "          is adult: ", ifAdultWithCurrentYear(yearsOfBirth, currentYear))


// *3. Stwórz funkcję która będzie sprawdzać czy użytkonik jest rocznikowo pełnoletni, bez konieczności podawania obecnego roku.
// Jak to powinno działać: po wywołaniu funkacji checkAdult(1990), w konsoli pojawi się komunikat "użytkownik jest pełnoletni"


function ifAdult(a) {
    var today = new Date();
    const age = today.getFullYear - a
    console.log(today.getFullYear)
    if (age < 0) {
        return "wrong value"
    } else if (age < 17) {
        return false
    } else {
        return true
    }
}

console. log("date of birth: ", yearsOfBirth, "          is adult: ", ifAdult(yearsOfBirth));

console.log("er4t50")
console.log(sumOfIntegersInString("er4t50"))

function sumOfIntegersInString(s){
  
    let sum = 0
    let currentTextNumber = ""
    console.log(s.length)
    for (let i = 0; i < s.length; i++) {
        console.log("symbol: ", s[i])
      if (s[i] >= '0' && s[i] <= '9') {
        console.log(s[i])
        currentTextNumber += s[i]
        console.log("curNumb = " , currentTextNumber)
      } else {
        if (currentTextNumber.length > 0) {
          sum += Number(currentTextNumber);
          console.log("sum = ", sum)

          currentTextNumber = ""
        }
      }
    }
    if (s.length > 0) {
        sum += Number(currentTextNumber);
    }
    return sum
  }
