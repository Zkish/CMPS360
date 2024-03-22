package main

import (
	"io"
	"net/http"
	"os"
)

// sestting up API
func main() {
	http.HandleFunc("/", Handler)
	http.ListenAndServe(":3000", nil)
}

func Handler(w http.ResponseWriter, r *http.Request) {
	f, _ := os.Open("./Vacations.txt")
	io.Copy(w, f)
}
