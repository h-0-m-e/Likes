fun main() {
    val likes = 1
    var peopleLikedPhraseVersion = if (likes%10 === 1 || likes === 1) "человеку" else "людям"

    println("Понравилось $likes $peopleLikedPhraseVersion")
}