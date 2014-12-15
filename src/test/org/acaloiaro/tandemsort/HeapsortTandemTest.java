package org.acaloiaro.tandemsort;

import java.util.Random;


public class HeapsortTandemTest {
  final int N = 1000000;
  Random r = new Random(20141215L);

  public void testHeapsortDescending() {
    int i = 0;
    final double[] values = new double[N];
    final int[] valuesOrder = new int[N];

    for (; i < N; i++) {
      values[i] = r.nextDouble();
      valuesOrder[i] = i;
    }

    HeapsortTandem.heapsortDescending(values, valuesOrder, N);

    // Ensure the values are in descending order
    for (i = 0; i < N - 1; i++) {
      assert(values[i] >= values[i + 1]);
    }
  }

  public void testHeapsortAscending() {
    int i = 0;
    final double[] values = new double[N];
    final int[] valuesOrder = new int[N];

    for (; i < N; i++) {
      values[i] = r.nextDouble();
      valuesOrder[i] = i;
    }

    HeapsortTandem.heapsortAscending(values, valuesOrder, N);

    // Ensure the values are in descending order
    for (i = 0; i < N - 1; i++) {
      assert(values[i] <= values[i + 1]);
    }
  }

}
