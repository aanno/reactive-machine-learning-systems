# Spark

* https://spark.apache.org/

## Setup and first steps

1. Download spark distribution from the spark site (including hadoop).
2. Untar distribution.
3. Unsure to use Java 8, use JAVA_HOME environment variable if unsure.
4. In (another) terminal, run `/opt/spark-2.3.0-bin-hadoop2.7/bin/spark-shell`
   ```
2018-03-09 16:50:26 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Setting default log level to "WARN".
To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
Spark context Web UI available at http://redsnapper.fritz.box:4040
Spark context available as 'sc' (master = local[*], app id = local-1520610637202).
Spark session available as 'spark'.
Welcome to
      ____              __
     / __/__  ___ _____/ /__
    _\ \/ _ \/ _ `/ __/  '_/
   /___/ .__/\_,_/_/ /_/\_\   version 2.3.0
      /_/

Using Scala version 2.11.8 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_162)
Type in expressions to have them evaluated.
Type :help for more information.

scala>
   ```
5. You can use the browser at http://localhost
6. Your session setup should read
   ```
   val session = SparkSession.builder.master("local").appName("Simple ModelExample").getOrCreate()
   ```
   You probably want to set the memory as well. See
   * https://stackoverflow.com/questions/38008330/spark-error-a-master-url-must-be-set-in-your-configuration-when-submitting-a
   * https://stackoverflow.com/questions/42032169/error-initializing-sparkcontext-a-master-url-must-be-set-in-your-configuration

### Online resources

* https://github.com/deanwampler/spark-scala-tutorial
* https://www.analyticsvidhya.com/blog/2016/09/comprehensive-introduction-to-apache-spark-rdds-dataframes-using-pyspark/ (spark setup)
* https://www.analyticsvidhya.com/blog/2017/01/scala/

### Tip and tricks

#### Scala >2.11

Spark does NOT support scala 2.12+:

* https://stackoverflow.com/questions/42887359/using-scala-2-12-with-spark-2-1
* https://issues.apache.org/jira/browse/SPARK-14220
* https://mvnrepository.com/artifact/org.apache.spark/spark-core


#### Hadoop “Unable to load native-hadoop library for your platform” warning

* https://stackoverflow.com/questions/40015416/spark-unable-to-load-native-hadoop-library-for-your-platform
* https://stackoverflow.com/questions/19943766/hadoop-unable-to-load-native-hadoop-library-for-your-platform-warning

## Documentation

### API

* https://spark.apache.org/docs/2.3.0/api/scala/index.html
