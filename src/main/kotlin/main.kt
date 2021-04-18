fun main() {

    println("==프로그램 시작==")

    var numArr = IntArray(3){0}

    for(i in numArr.indices){
        print("숫자입력 : ")
        numArr[i] = readLine()?.trim()?.toInt()?:0
    }
    println("입력한 숫자 : ")
    for(arr in numArr){
        println(arr)
    }


    println("==프로그램 끝==")



//    val person1 = Person(1,"K", 30, "korea");
//    println(person1.sayHi())
//    println(person1)
//
//
//    val person2 = Person(2, "Joel", 32, "china");
//    println(person2.sayHi())
//    println(person2)


}

class Person(
    var id : Int,
    var name : String,
    var age : Int,
    var home : String
){
    // 코드가 한줄일때는 inline 메서드로 작성 가능, 필수는 아님.
    fun sayHi() : String = "안녕하세요. $age 살 $name 입니다."

    override fun toString() : String {
        return "id : $id, name : $name, age : $age, home : $home"
    }
}