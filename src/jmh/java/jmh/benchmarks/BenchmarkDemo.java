package jmh.benchmarks;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@Threads(2)
public class BenchmarkDemo {
    @Benchmark
    public long shift() {
        long t = 455565655225562L;
        long a = 0;
        for (int i = 0; i < 1000; i++) {
            a = t >> 30;
        }
        return a;
    }

    @Benchmark
    public long div() {
        long t = 455565655225562L;
        long a = 0;
        for (int i = 0; i < 1000; i++) {
            a = t / 1024 / 1024 / 1024;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        Options opts =
                new OptionsBuilder()
                        .include(BenchmarkDemo.class.getSimpleName())
                        .resultFormat(
                                ResultFormatType.JSON) // 将结果图形化，支持：TEXT, CSV, SCSV, JSON, LATEX,
                        .build();
        new Runner(opts).run();
    }
}

/**
 * @Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS) @Warmup(iterations = 3, time
 * = 1, timeUnit = TimeUnit.SECONDS) timeUnit ：时间的单位，默认的单位是秒。 iterations ：预热阶段的迭代数。 time ：每次预热的时间。
 * batchSize ：批处理大小，指定了每次操作调用几次方法。 @BenchmarkMode Throughput：整体吞吐量，比如QPS，单位时间内的调用量等。
 * AverageTime：平均耗时，指的是每次执行的平均时间。 SampleTime： 随机 取样。 SingleShotTime：仅测试一次，可以用来测试冷启动。
 * All：所有的指标，都算一遍。 @Setup和@TearDown @Setup用于基准测试前的初始化动作， @TearDown 用于基准测试后的动作，来做一些全局的配置。
 * 这两个注解，有一个Level值，标明了方法运行的时机： Trial：默认的级别。也就是Benchmark级别。 Iteration：每次迭代都会运行。
 * Invocation：每次方法调用都会运行，这个是粒度最细的。
 *
 * <p>结果图形界面化： 指定resultFormat：// 将结果图形化，支持：TEXT, CSV, SCSV, JSON, LATEX, CSV直接导入excel表，生成图表 JSON导入
 * http://deepoove.com/jmh-visual-chart/
 */
