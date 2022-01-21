package behavioral.strategy

class Ship: TransportTypeStrategy {

    override fun travelMode(): String {
        return "Sea"
    }
}