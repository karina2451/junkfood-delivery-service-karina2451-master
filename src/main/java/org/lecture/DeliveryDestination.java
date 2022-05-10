/**
 * @author: Karina Medwenitsch
 * @since: May 2022
 * This class provides all possible options for delivery destinations, incl. their distance in kilometers.
 */

package org.lecture;

public enum DeliveryDestination {
    VIENNA("Vienna", 40),
    EISENSTADT("Eisenstadt", 20),
    PINKAFELD("Pinkafeld", 100);

    String cityName;
    int kilometers;

    DeliveryDestination(String s, int i) {
        this.cityName = s;
        this.kilometers = i;
    }

    /**
     * advanced toString() method
     * @return String of city name and distance
     */
    public String toString() {
        return cityName + ", distance: " + kilometers + " kilometers";
    }

    /**
     * provides access to distance of a destination
     * @return number of kilometers
     */
    public int getKilometers() {
        return kilometers;
    }


}
