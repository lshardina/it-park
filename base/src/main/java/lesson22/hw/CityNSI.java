package lesson22.hw;

import java.util.LinkedHashMap;
import java.util.Map;

public class CityNSI {
    Map<String, String> region = new LinkedHashMap<>();

    public void fillRegion() {
        region.put("59", "Perm");
        region.put("77", "Moscow");
        region.put("37", "Ivanovo");
        region.put("5", "Makhachkala");
        region.put("63", "Samara");
        region.put("43", "Kirov");
        region.put("55", "Omsk");
        region.put("23", "Krasnodar");
        region.put("24", "Krasnoyarsk");
        region.put("36", "Voronezh");
        region.put("49", "Magadan");
        region.put("14", "Yakutsk");
        region.put("92", "Sevastopol");
        region.put("39", "Kaliningrad");
        region.put("66", "Yekaterinburg");
        region.put("62", "Ryazan");
        region.put("20", "Groznyy");
        region.put("16", "Kazan");
        System.out.println(region);

    }

    public String getCity(String cod) {
        return region.get(cod);
    }
}
