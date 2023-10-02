/*
ALUNO: Carlos Kauan Brito Monteiro
TURMA: ADS 2º A
MATRICULA: 01625686

Usando modulo synchro-prompt
    npm install sychron-prompt
OBS: Tive problemas com o modulo prompt-sync
*/ 
const prompt = require("synchro-prompt");

function som(num1, num2){
  return num1 + num2;
}

function sub(num1, num2){
  return num1 - num2;
}

function mult(num1, num2){
  return num1 * num2;
}

function div(num1, num2){
  return num1 / num2;
}

let numero1 = Number(prompt("Digite o primeiro nuemero.\n>> "));
console.clear();

let operacao = prompt(`\nQual operação você deseja realizar\n
A - Adição
S - Subtração
M - Multiplicação
D - Divisão
>> `).toUpperCase();
console.clear();

let numero2 = Number(prompt("\nDigite o segundo numero.\n>> "));
console.clear();

let resultado;

if(operacao === "A"){
  resultado = som(numero1, numero2);
}else if(operacao === "S"){
  resultado = sub(numero1, numero2);
}else if(operacao === "M"){
  resultado = mult(numero1, numero2);
}else{
  resultado = div(numero1, numero2);
}

console.log("\nO resultado da operação é", resultado);