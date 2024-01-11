#include <iostream>

int main(int argc, char *argv[])
{
	int score = 0;
	while (true) {
	    std::string input;
    	std::cout << "Your Score: " << score << std::endl;
	    std::cout << "Press Enter to Gain Score!";
	    std::getline(std::cin, input);
	    score += 1;
	}
	return 0;
}