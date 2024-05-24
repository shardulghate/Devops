package com.test.demo

def filePath = "C:\\Devops\\Groovy\\Sample_Demo\\Data1.txt"

// Read the file
def file = new File(filePath)
if (file.exists()) {
	def content = file.text
	println 'File Content:'
	println content
} else {
	println "File not found: $filePath"
}