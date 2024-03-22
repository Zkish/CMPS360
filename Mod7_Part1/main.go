package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	// making questions into an array of strings to assist the for loop
	questions := []string{"What is Your Dream Job?", "Where is your perfect vacation spot?", "ever wanted to be a treasure hunter?"}
	answers := make([]string, len(questions))

	reader := bufio.NewReader(os.Stdin)
	// loop to ask the questions
	for i, question := range questions {
		fmt.Println(question)
		answer, _ := reader.ReadString('\n')
		answers[i] = answer
	}
	// loop to output the answers to questions
	fmt.Println("\nAnswers:")
	for i, answer := range answers {
		fmt.Printf("%s: %s", questions[i], answer)
	}
}
