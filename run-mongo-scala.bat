%SPARK_HOME%\bin\spark-submit --master local[2] ^
--packages org.apache.spark:spark-sql_2.10:1.6.1,org.slf4j:slf4j-api:1.7.19,^
com.databricks:spark-csv_2.10:1.3.0,^
org.mongodb.spark:mongo-spark-connector_2.10:1.0.0,^
org.xerial.snappy:snappy-java:1.1.2.2,^
net.jpountz.lz4:lz4:1.3.0^
 --class org.apache.spark.examples.streaming.CSVToMongo ^
target\scala-2.10\direct-kafka-wordcount_2.10-1.0.jar  csvfile test 

