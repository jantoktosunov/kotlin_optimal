package lession3

enum class HttpStatus(val code: Int, val description: String) {
    OK (200, "OK"),
    NOT_FOUND(404, "Not Found")
}

fun handleHttpResponse(status: HttpStatus) {
    when (status) {
        HttpStatus.OK -> println(status.description)
        HttpStatus.NOT_FOUND -> println(status.description)
    }
}

fun main() {
    val status = HttpStatus.OK
    handleHttpResponse(status)
}