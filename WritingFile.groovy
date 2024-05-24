package com.test.demo

def filePath = "C:\\Devops\\Groovy\\Sample_Demo\\Data1.txt"
def file = new File(filePath)
file.text = 'This is the content written to the file.'
println "Content written to $filePath"
//file << '\nThis line is appended to the file.'

//println "Additional content appended to $filePath"