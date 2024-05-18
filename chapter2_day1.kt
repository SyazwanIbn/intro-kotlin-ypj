fun main() {
    
    //control flow
    // if else
    /*var myAge = 30
    
    if (myAge < 18){
       	println("You are underage") 
    }
    else{
       println("you are adult") 
    }
   
   // if,else if,else
   if(myAge<13){
       println("you cannot watch the movie")
   }
   else if(myAge < 18){
       println("watch movie with your parent")
   }
   else{
       println("you can watch the movie")
   }*/
   
   //bawah 13 tahun tak boleh
   //13 tahun ke atas kena ada parent
   //18 tahun ke atas boleh
   
   /*var childAge = 19
   var parent = true
    
    if(childAge < 13){
        println("you cannot watch the movie")
    }
    else if(childAge < 18 && parent == true){
        println("you cannot watch the movie")
    }
    else if(childAge < 18 && parent == false){
        println("you can watch the movie")
    }
    else{
        println("you can watch the movue")
    }
    
    //ataupun to make it simple
    
    if (childAge < 13 || childAge < 18 && parent == false){
        println("you cannot watch the movie")
    }
    else{
        println("you can watch the movie")
    }
    
    //When (a.k.a Switch case)
    var size = 1
    var price = 0
	
    when (size) {
        1->price = 5
        2->price = 7
        3->price = 10
        else->println("we dont support other size")
    }
    println(price)*/
    
    //for loop(berkerja dngn index)
    /*for(i in 0..5){
        println("i = $i ini menaik")//Dari 0 hingga 5,keluarkan nilai i
    }
    
    for (i in 5 downTo 0){
        println("i = $i ini menurun guna downTo")//Dari 5 hingga 0,keluarkan nilai i
    }
    
    for (i in 1..5 step 2){
        println("i = $i naik 2 number")//Dari 1 hingga 5, naik 2 step
    }
    
    for (i in 5 downTo 1 step 2){
        println("i = $i turun downTo 2 number")//Dari 1 hingga 5, naik 2 step
    }
    
    //For item in array(bekerja dngn collection)
    var language = arrayOf("Ruby","Python","Kotlin","Java")
    
    for (item in language){
        println(item)
    }
    
    //${} -> Interpolation kalau ada function
    for (i in 0 .. language.size-1){
        println("Item at index $i is ${language[i]}")
    }
    */
    
   //While
   /*var x1 = 1
    while (x1<5){
        println("x1 = $x1")
        x1++ // selagi nilai x1 kurang dari 5, keluarkan nilai x1 dan tambah 1 setiap kali
    }
    
    //Do While
    //Do while akan execute at least 1
    var x2 = 1
    do {
        println("x2 = $x2")    //keluarkan nilai x2
        x2++                  //tambahkan x2 kepada 1
    }
    while(x2<=5)       // ulang selagi x2 kurang drpd 5
    
    //break
	var x3 = 1
    do{
        println("x3 = $x3")
        x3++
        if(x3 == 3) break //keluar dari do while
    }
    while (x3<=5)
    
    //continue - abaikan senario ini tetapi teruskan
    var x4 = 0
    do{
        x4++
        if (x4 == 3) continue
        println("x4 = $x4")  
    }
    while(x4<=5)*/
    
    sayHello() // FUNCTION INVOKATION / PANGGIL FUNCTION
    sayGoodbye("Syazwan")
    println(calculateBMI(172.0,90.0))
    
}

 //Function is a group expression that can be reusable in our CODE   
 fun sayHello(){
     println("Hellow World") // DECLARING A FUNCTION
 }
 
 //Function with parameter argument / parameter
 fun sayGoodbye(name:String){
     println("Goodbye $name")
 }
 
 //Function with return
 
 fun calculateBMI(height:Double, weight:Double):Double{
	return weight / ((height/100)*(height/100))
 }
