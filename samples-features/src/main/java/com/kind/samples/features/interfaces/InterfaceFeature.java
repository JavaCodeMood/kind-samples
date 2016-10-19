package com.kind.samples.features.interfaces;

/**
 * 接口可以有默认方法实现，必须default修饰
 * Created by weiguo.liu on 2016/10/18.
 */
public class InterfaceFeature {
    public static void main(String[] args) {

    }

    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }

    static class For implements Formula {
        @Override
        public double calculate(int a) {
            return 0;
        }

        @Override
        public double sqrt(int a) {
            return 0;
        }

    }

}
