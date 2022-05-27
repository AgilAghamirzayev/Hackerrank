package main

import (
	"fmt"
	_ "io"
	"strconv"
	_ "strings"
)

func main() {
	fmt.Println(timeConversion("12:45:54PM"))
}

func timeConversion(s string) string {
	// Write your code here
	var amOrPm = s[len(s)-2:]

	if amOrPm == "AM" && s[:2] == "12" {
		return "00" + s[2:len(s)-2]
	}

	if amOrPm == "AM" {
		return s[:len(s)-2]
	}

	if amOrPm == "PM" && s[:2] == "12" {
		return s[:len(s)-2]
	}

	ans, _ := strconv.Atoi(s[:2])
	ans += 12

	result := strconv.Itoa(ans)
	result += s[2:8]
	return result
}
