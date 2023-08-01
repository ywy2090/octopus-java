package jmh.benchmarks;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread) // Thread: 该状态为每个线程独享。
public class HelloBenchmark {

  @Setup
  public void setup() {
    // Set up resources if needed
  }

  @TearDown
  public void tearDown() {
    // Clean up resources if needed
  }

  @Benchmark
  public int sleepAWhile() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      // ignore
    }
    return 0;
  }

  public static void main(String[] args) throws RunnerException {
    Options opt =
        new OptionsBuilder()
            .include(
                HelloBenchmark.class.getSimpleName()) // benchmark 所在的类的名字，注意这里是使用正则表达式对所有类进行匹配的
            .forks(1) // 进行 fork 的次数。如果 fork 数是2的话，则 JMH 会 fork 出两个进程来进行测试
            .warmupIterations(5) // 预热的迭代次数
            .measurementIterations(5) // 实际测量的迭代次数
            .build();

    new Runner(opt).run();
  }
}
