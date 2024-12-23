package scaler.lld3.parkinglot.repositories;

import scaler.lld3.parkinglot.models.Gate;
import scaler.lld3.parkinglot.models.ParkingLot;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {

    private Map<Long, ParkingLot> parkingLotMap = new TreeMap<>();

    public Optional<ParkingLot> findByGate(Gate gate) {
        return parkingLotMap.values()
                .stream()
                .filter(parkingLot -> parkingLot.getGates().contains(gate))
                .findFirst();
    }
}
