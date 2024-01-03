#include <iostream>
#include "random.h"
using namespace std;

int main() {
    cout << "randomInteger(1, 10), result is: " << randomInteger(1, 10) << endl;
    cout << "randomReal(0, 1), result is: " << randomReal(0, 1) << endl;
    cout << "randomChance(0.5), result is: " << randomChance(0.5) << endl;
    return 0;
}
