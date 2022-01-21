package behavioral.strategy

class TravelingClient(var strategy: TransportTypeStrategy) {

    fun update(strategy: TransportTypeStrategy) {
        this.strategy = strategy
    }

    fun howToTravel(): String = "Travel by ${strategy.travelMode()}"
}