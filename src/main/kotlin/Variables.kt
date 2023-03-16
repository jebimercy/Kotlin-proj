fun main(args: Array<String>) {

    var num1 = 20
    var num2 = 30
    var answ = num1 + num2
    println(answ)

    var a = 70
    var b = 80
    var marks = (a + b)/2
    if (marks <= 40){
        print("fail")
    }
    else if (marks <= 50){
        print("Average")
    }
    else if (marks <= 70){
        print("Above average")
    }
    else{
        print("Pass")
    }
}