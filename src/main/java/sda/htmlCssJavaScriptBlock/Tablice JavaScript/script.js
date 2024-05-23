console.log("Plik JavaScript jest poprawnie podłączony do pliku index.html")


// 1. To jest lista uczniów w jednej ze szkół:
const studentsList = ["Maciek", "Barbara", "Zofia", "Jacek"]
console.log("old studentsList: ", studentsList)
const newPupils = ["Tomek", "Gosia"]
const newStudentList = studentsList.concat(newPupils)
console.log("new studentsList: ", newStudentList)
console.log("")
// Do szkoły dołączyło dwóch uniów, Tomek i Gosia. Dodaj ich do listy uczniów.


// 2. To jest lista zwierzaków pewnej rodziny.
const animalsList = ["dog", "cow", "cat"]
const isContains = animalsList.includes("cat")
console.log("zwięrzęta: ", animalsList)
console.log("Czy mamy kota: ", isContains)

animalsList.forEach(element => {
    console.log("czy ", element, "jest kotem?", element == "cat")
});
console.log("")
//Sprawdź czy jest w niej kot (cat)


// 3. To jest lista cen pewnym produktów w pewnym sklepie.
const pricesList = [2, 8, 20]
console.log("old prices: ", pricesList)
console.log("new prices: ", pricesList.map(val => val*2))
console.log("")
// Niestety wszystkie ceny wzrosły podwójnie, dlatego trzeba stworzyć nową listę newPricesList
