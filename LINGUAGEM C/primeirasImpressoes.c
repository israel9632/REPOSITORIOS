/*
Variáveis 1

Toda variavel possui nome, tipo, tamanho e valor.

Memoria "RAM", é temporaria, programa fechado ou pc desligado tudo é perdido,
valores voláveis e caso seja atribuido um novo valor a variável o valor antigo é
perdido

TIPOS DE VARIAVEIS:
char - 1 Byte 8 bits,
int 2 Bytes em maq de -32768 + 32767,
float 4 Bytes,
void - vazio,
double - 8 Bytes ,até 15 casas decimais.

*/

#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int num;
  float f = 2.2;
  scanf("%d", &num);
  printf("%i\n", num);
  printf("%f", f);

  return 0;
}