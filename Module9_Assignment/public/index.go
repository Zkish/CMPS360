package main

import (
	"fmt"
	"net/http"
)

func main() {
	// define the header function
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(w, `
			<html>
			<head>
			<title>ABOUT PAGE</title>
			</head>
			<body>
			<h1>ABOUT ME:</h1>
			<p>Hello there how are you all doing today there mate?<p>
			<p>Add a /Hobbies to the hyperlink in order to go to hobbies page.</p>
			<img src="https://static1.srcdn.com/wordpress/wp-content/uploads/2021/06/Fallout-3--The-Pitt-World-Story-Explained.jpg" height="500" width="500">
			</body>
			</html>
		`)
	})

	http.HandleFunc("/hobbys", func(w http.ResponseWriter, r *http.Request) {
		fmt.Fprintf(w, `
			<html>
			<head>
			<title>ABOUT PAGE</title>
			</head>
			<body>
			<h1>MY HOBBIES:</h1>
			<p>Hello there how are you all doing today there mate?<p>
			<img src="data:image/jpeg;base64,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" height="500" width="500">
			</body>
			</html>
		`)
	})

	fmt.Println("Server listening on port source 8080...")
	http.ListenAndServe(":8080", nil)
}
