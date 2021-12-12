package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.Map;

public class Exercise003 {

    public Map<String, Integer> getIcecreamMap(){
        Map<String,Integer> iceCreamMap = new HashMap<String,Integer>();
        iceCreamMap.put("Pistachio",0);
        iceCreamMap.put("Raspberry Ripple",1);
        iceCreamMap.put("Vanilla",2);
        iceCreamMap.put("Mint Chocolate Chip",3);
        iceCreamMap.put("Chocolate",4);
        iceCreamMap.put("Mango Sorbet",5);
        return iceCreamMap;

    }
    int getIceCreamCode(String iceCreamFlavour) {
        Map<String,Integer> icecreamflavour = getIcecreamMap();
        return icecreamflavour.get(iceCreamFlavour);
    }
    String[] iceCreamFlavours() {
        Map<String,Integer> iceCreamMap = getIcecreamMap();
        String[] iceCreamFlavourName = new String[6];

        for (String name:iceCreamMap.keySet()) {
            iceCreamFlavourName[iceCreamMap.get(name)] = name;

        }
        return iceCreamFlavourName;
    }

}
