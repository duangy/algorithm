#ifndef RANDOM_H
#define RANDOM_H

int randomInteger(int low, int high);

double randomReal(double low, double high);

bool randomChance(double p);

void setRandomSeed(int seed);

#endif