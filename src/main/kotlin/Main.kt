fun main() {
    val foldablePhone = FoldablePhone()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

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