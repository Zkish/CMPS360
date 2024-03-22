package main

import (
	""
)

// // sestting up API
// func main() {
// 	http.HandleFunc("/", Handler)
// 	http.ListenAndServe(":3000", nil)
// }

// func Handler(w http.ResponseWriter, r *http.Request) {
// 	f, _ := os.Open("./brewery.txt")
// 	io.Copy(w, f)
// }

// func main() {
// 	// Get User Input
// 	fmt.Println("what is your favorite brewery")
// 	in := bufio.NewReader(os.Stdin)
// 	s, _ := in.ReadString('\n')
// 	s = strings.TrimSpace(s)
// 	s = strings.ToUpper(s)
// 	fmt.Println(s + "!")
// }

//	var vehicle string = "Pontiac"
//	fmt.Println("my favorite car is: " + vehicle)
//
//	var costOfVehicle int = 5000
//	fmt.Println(costOfVehicle)
//
//	d := 4.565
//	fmt.Println(d)
