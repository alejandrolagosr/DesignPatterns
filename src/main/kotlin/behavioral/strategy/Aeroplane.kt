package behavioral.strategy

class Aeroplane: TransportTypeStrategy {

    override fun travelMode(): String {
        return "Air"
    }
}