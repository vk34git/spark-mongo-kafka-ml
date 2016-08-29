%SPARK_HOME%\bin\spark-submit --master local[2] ^
--packages org.apache.spark:spark-streaming_2.10:1.6.1,^
org.apache.spark:spark-streaming-kafka_2.10:1.6.1,^
org.apache.kafka:kafka-clients:0.9.0.1,org.slf4j:slf4j-api:1.7.19,^
org.xerial.snappy:snappy-java:1.1.2.2,^
net.jpountz.lz4:lz4:1.3.0^
 --class org.apache.spark.examples.streaming.DirectKafkaWordCount ^
target\scala-2.10\direct-kafka-wordcount_2.10-1.0.jar localhost:9092 test 

