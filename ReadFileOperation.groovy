package com.test.demo

//How to read files as String
//How to read files as List
//How to read files as Array
//How to read file line by line
//How to delete file



//Reading files

String fileptah="C:\\Devops\\Groovy\\Sample_Demo\\Data1.txt"

File myFile=new File(fileptah)

//Reading entire content as string

println myFile.text //text is function to read the lines of file in string format


//Collect lines into list

def list=myFile.collect { it } //collect the content from the file into the list
println list

println "list : $list"

//store file content in am array

def array=myFile as String[] // This is nothing but array of string
println "array : $array"


//read file into list of string
def lines=myFile.readLines() // Store the entire content into list of string
println lines

//read file line by line
//each line is method to read the contents from the file line by line
myFile.eachLine { line ->
	println "line : $line"
}

//read the file line by line with line no
myFile.eachLine { line,lineNo->
	println "$lineNo : $line"					
}

def lineNoRange =2..4
def lineList=[]
myFile.eachLine { line, lineNo ->
	if(lineNoRange.contains(lineNo)) {
		lineList.add(line)
	}
}
println "lineList : $lineList"


//read the reader
//In java we have buffer reader class same in groovy withReader()
myFile.withReader { reader->
	reader.readLine()
}

//reading with new reader    need to check
 def outputFile ="data3.txt"
 def reader=myFile.newReader()
 new File(outputFile).append(reader)
 reader.close()
 
 
 // Standared Groovy file Size of the file 
  def size= myFile.size()
  println "The size of the file is :" +size
  
  
  //Length of the file
  
  def length=myFile.length()
  println "The length of the file is :" +length
  
  
  //Check if the file or directory
  
 println  myFile.isFile()
 println  myFile.isDirectory()
 
 
 //get the list of files from directories
 
 new File("C:\\Devops").eachFile { 
	 files->println files.getAbsolutePath()
 }
 
 //Recursively display all files in a directory and its subdirectories
 
 new File("C:\\Devops").eachFileRecurse { 
	 file->println file.getAbsolutePath()
 }
 
 //copy file data into another file
 
 def newFile=new File("data4.txt")
 newFile << myFile.text
 
 
 //Delete File
 
 newFile.delete()
 
 
  
 



