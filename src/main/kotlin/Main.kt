fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")

}
//Item A is sold at 5000.
//Item B is sold at 3000.

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int) : Int {
    return bid?.amount ?: minimumPrice
}

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isPhoneFoldable: Boolean = true) : Phone() {
    override fun switchOn() {
        if (!isPhoneFoldable) isScreenLightOn = true
    }

    fun fold() {
        isPhoneFoldable = true
    }

    fun unfold() {
        isPhoneFoldable = false
    }
}

