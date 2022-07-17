package dip

interface Database {
    fun insert()
    fun delete()
    fun update()
    fun fetch()
}

class AmendSqlDatabase : Database {

    override fun insert() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun fetch() {
        TODO("Not yet implemented")
    }
}

class NoSqlDatabase : Database {

    override fun insert() {
        TODO("Not yet implemented")
    }

    override fun delete() {
        TODO("Not yet implemented")
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun fetch() {
        TODO("Not yet implemented")
    }
}

class AmendSuperApp(private val database: Database) {

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
