class Person {
    var vorname: String
    var nachname: String
    var alter: Int

    // Primärer Konstruktor mit drei Parametern
    constructor(vorname: String, nachname: String, alter: Int) {
        this.vorname = vorname
        this.nachname = nachname
        this.alter = alter
    }

    // Sekundärer Konstruktor mit zwei Parametern
    constructor(vorname: String, nachname: String) {
        this.vorname = vorname
        this.nachname = nachname
        this.alter = 0  // Standardalter, da kein Alter angegeben wurde
    }
}

fun main() {

}