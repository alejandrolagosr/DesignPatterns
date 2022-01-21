package strategy

fun main() {
    println("--- Strategy Example ---")

    // Assigning Aeroplane strategy to client.
    val travelClient = TravelingClient(Aeroplane())
    println(travelClient.howToTravel())

    // Change strategy to Ship
    travelClient.update(Ship())
    println(travelClient.howToTravel())

    // Change strategy to Car
    travelClient.update(Car())
    println(travelClient.howToTravel())

    println("--- --- ---")
}