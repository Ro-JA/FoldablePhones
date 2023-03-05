fun main(args: Array<String>) {
    val foldablePhone = FoldablePhone(true)
    foldablePhone.checkPhoneScreenLight()

}

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isPhoneFoldable: Boolean = false) : Phone(false) {
    override fun switchOn() {
        if (isPhoneFoldable) isScreenLightOn = true
    }

    override fun switchOff() {
        if (!isPhoneFoldable) isScreenLightOn = false
    }


}