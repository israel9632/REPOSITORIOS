/*  
EXERCICIO DE IMC AULA 24/08/2022
IMC = peso / (altura x altura).
*/
var peso = 60;
var altura = 1.89;
var cImc = peso / (altura * altura);
if (cImc <= 18) {
    console.log("Magreza");
}
if (cImc <= 24) {
        console.log("Normal");
}
if (cImc <= 29) {
    console.log("Sobrepeso");
}
if (cImc > 29) {
    console.log("Obeso");
}
        