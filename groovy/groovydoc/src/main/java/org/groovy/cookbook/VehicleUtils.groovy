package org.groovy.cookbook

/**
 * Created by sfit0450 on 2014/10/27.
 */
class VehicleUtils {
/**
 * Returns average fuel consumption per 100 km.
 * More information about involved calculations
 * can be found in the
 * <a
 * href="http://en.wikipedia.org/wiki/Fuel_efficiency"
 * >respected source</a>.
 *
 * * @param distance
 * the distance driven by the vehicle.
 * @param liters
 * the amount of fuel spent in liters.
 *
 * @return calculated fuel consumption.
 *
 */
    static fuelConsumptionPer100Km(distance, liters) {
        (liters * 100) / distance
    }
}
