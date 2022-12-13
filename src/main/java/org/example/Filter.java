package org.example;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer el : source) {
            boolean isFits = el > treshold;
            if (isFits) {
                result.add(el);
            }
            String msg = String.format("Элемент \"%s\" %s", el, isFits ? "проходит" : "не проходит");
            logger.log(msg);
        }
        return result;
    }
}