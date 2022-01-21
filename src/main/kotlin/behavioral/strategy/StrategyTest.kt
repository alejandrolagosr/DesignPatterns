package behavioral.strategy

fun main() {
    println("--- Strategy Example ---")

    // Assigning Aeroplane behavioral.strategy to client.
    val travelClient = TravelingClient(Aeroplane())
    println(travelClient.howToTravel())

    // Change behavioral.strategy to Ship
    travelClient.update(Ship())
    println(travelClient.howToTravel())

    // Change behavioral.strategy to Car
    travelClient.update(Car())
    println(travelClient.howToTravel())

    println("--- --- ---")
}