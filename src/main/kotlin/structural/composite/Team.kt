package structural.composite

class Team(private val name: String): Entity {

    override fun getEntityName(): String {
        return name
    }
}
