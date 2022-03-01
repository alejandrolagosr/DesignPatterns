package structural.composite

class Raywenderlich(private val name: String): Entity {

    private val teamList = arrayListOf<Entity>()

    override fun getEntityName(): String {
        return name + ", " + teamList.joinToString(", ") { it.getEntityName() }
    }

    fun addTeamMember(member: Entity) {
        teamList.add(member)
    }
}