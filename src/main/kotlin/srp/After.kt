package srp

class ModifiedHealthBand(
    sensorManager: SensorManager,
    bluetoothManager: BluetoothManager
) {
    val dailyStepsCount = Unit
}

class SensorManager {

    fun accelerometerValues() = Unit

    fun spo2Value() = Unit
}

class BluetoothManager {

    fun toggleAdvertiser() = Unit

    fun acceptBond() = Unit
}