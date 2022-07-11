package lsp

open class AmendedMobilePhone

open class BluetoothSupportedMobilePhone : AmendedMobilePhone() {

    private var bluetoothState = false

    open fun toggleBluetoothState() {
        bluetoothState = !bluetoothState
    }
}

class AmendedNokia6060 : AmendedMobilePhone()

class AmendedSonyEricssonK510i : BluetoothSupportedMobilePhone() {

    override fun toggleBluetoothState() {
        super.toggleBluetoothState()
    }
}
