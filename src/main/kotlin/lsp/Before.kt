package lsp

open class MobilePhone {

    private var bluetoothState = false

    open fun toggleBluetoothState() {
        bluetoothState = !bluetoothState
    }
}

class Nokia6060 : MobilePhone() {

    override fun toggleBluetoothState() {
        throw UnsupportedOperationException()
    }
}

class SonyEricssonK510i : MobilePhone() {

    override fun toggleBluetoothState() {
        super.toggleBluetoothState()
    }
}
