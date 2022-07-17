package dip

class SqlDatabase {

    fun insert() = Unit

    fun delete() = Unit

    fun update() = Unit

    fun fetch() = Unit
}

class SuperApp(private val database: SqlDatabase) {

    fun increaseWalletBalance() {
        database.insert()
    }

    fun clearOrderHistory() {
        database.delete()
    }

    fun updateProfile() {
        database.update()
    }

    fun fetchLastNews() {
        database.fetch()
    }
}
