package structural.composite

/**
 * You use the Composite pattern when you want to represent a tree-like structure consisting of uniform objects.
 * A Composite pattern can have two types of objects: composite and leaf. A composite object can have further objects,
 * whereas a leaf object is the last object.
 */

fun main() {
    val alexComposite = Raywenderlich("Alex")
    val nellyComposite = Raywenderlich("Nelly")
    val firstTeam = Team("FirstTeam")
    val secondTeam = Team("SecondTeam")

    nellyComposite.addTeamMember(firstTeam)
    nellyComposite.addTeamMember(secondTeam)

    alexComposite.addTeamMember(nellyComposite)

    print(alexComposite.getEntityName())
}
