object Before {
    class HealthBand {

        fun accelerometerValues() = Unit

        fun spo2Value() = Unit

        fun toggleAdvertiser() = Unit

        fun acceptBond() = Unit

        val dailyStepsCount = Unit
    }
}

object After {
    class HealthBand(
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
}