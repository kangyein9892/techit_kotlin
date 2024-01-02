// 1부터 1씩 증가시키는 값 중 3의 배수이거나 7의 배수인 숫자를 누적한다.
// 누적값이 10000이상이 됬을 때의 숫자가 몇인지 출력한다.

// step1) 기능 정리
// 1. 1부터 1씩 증가시키면서 3의 배수이거나 7의 배수인 숫자를 누적한다.
// 이때 누적값이 10000이상이 되었을 때의 숫자를 반환한다.
// 2. 반환된 숫자를 출력한다.

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.


fun main(){
    /* // findNumber 함수 테스트
    val a1 = findNumber()
    println("a1 : $a1")

    // printResult 함수 테스트
    printResult(100) */

    // 누적값이 10000 이상이 될 때의 숫자를 찾는다.
    val number = findNumber()
    // 출력한다.
    printResult(number)
}

// 1. 1부터 1씩 증가시키면서 3의 배수이거나 7의 배수인 숫자를 누적한다. 이때 누적값이 10000이상이 되었을 때의 숫자를 반환한다.
fun findNumber(): Int{
    // 1부터 1씩 증가되는 값을 담을 변수
    var number = 0
    // 누적값을 담을 변수
    var total = 0

    // 누적값이 10000보다 작으면 반복한다
    while(total < 10000){
        // 숫자를 1 증가시킨다.
        number++
        // 3의 배수이거나 7의 배수라면 누적한다.
        if(number % 3 == 0 || number % 7 == 0){
            total += number
        }
    }
    return number
}

// 2. 반환된 숫자를 출력한다.
fun printResult(number:Int){
    println("찾은 숫자는 ${number}입니다")
}