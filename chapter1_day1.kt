fun main() {
    println("Hello, Android ATC")
    
    //creating const val
    val x = 1
    val y = 3
    
    println(x) //1
    
    val z = x+y
    println(z) //4
    
    
   //constant vs variable
   //const val, once declared cannot changed
   val name = "Nursyazwan"
    //name = "syazwan hensem"
   println(name)
   
   //Variable var, Once declared , can changed
   var fullName = "Syazwan Hensem"
    fullName = "Muhammad Nursyazwan"
    println(fullName)
    
    //of type (:)
    val address:String = "Hulu Langat"
    println(address)
    
    var jantina:Char = 'L'
    println(jantina)
    
    //operation + 
    val message = "My name is " + name
    println(message)
    
    //string interpolation , $
    val anotherMessage = "My full name is $fullName and I from $address"
    println(anotherMessage)
    
    //Number
    var num1:Int = 10
    var num2:Int = 3
    
    var sum:Int = num1+num2
    println(sum)
    
    var num3:Double = 10.6
    var num4:Int = 4
    
    var sum1 = num3+num4
    println(sum1)
    
    //operation
    var minus = num1 - num2
    var product = num1 * num2
    var division = num1 / num2 // salah satu num kena Double untuk dpt double division
    var modulo = num1 % num2 // %ganjil genap, num % 2 == 0 (genap), num % 2 == 1 (ganjil)
    
    println("The answer, $num1 and $num2 for minus is $minus")
    println("The answer, $num1 and $num2 for product is $product")
    println("The answer, $num1 and $num2 for division is $division")
    println("The answer, $num1 and $num2 for modulo is $modulo")
    
    //boolean (true or false)
    var eaten = true;
    var tired:Boolean= false;
    
    //boolean operation : && (AND), || (OR), ! (REVERSE)
    println(eaten && tired) // both must true 
    println(eaten || tired) // either one is true
    println(!eaten) // reverse true is false, vice versa
    
    
    //nullable
    //null (no value)
    var profession = null
    // to declare a variable as nullable the data type needs to be added with ?
    
    var newProfession:String?= null // Question means it can be null or it can be a value
    println(newProfession)
    println(profession)
    
    //assign profession
    newProfession = "Superman"
    println("my new profession is $newProfession")
    
    //array
    //is a data type to store a collection of repeated items
    var score = arrayOf(70,90,100,80,85,60)
    println(score[0])// first item
    println(score.size)//how many item in the array
    
    
}
