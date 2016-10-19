package com.kind.samples.features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by weiguo.liu on 2016/10/18.
 */
public class LambdaFeature {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("cary", "jane", "jerry");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (String name : names) {
            System.out.println("name:" + name);
        }

    }
}
