name := "Spark Mongo Kafka "
resolvers += "Local Maven Repository" at "file:///c:\\users\\vkoda\\.m2\\repository"

version := "1.0"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }
libraryDependencies ++= Seq (
 "org.mongodb.spark" % "mongo-spark-connector_2.10" % "1.0.0",
"org.apache.spark" %% "spark-sql" % "1.6.1",
"org.apache.hbase" % "hbase-hadoop2-compat" % "1.2.1",
"org.apache.hbase" % "hbase-protocol" % "1.2.1",
"org.apache.hbase" % "hbase-common" % "1.2.1",
"org.apache.hbase" % "hbase-client" % "1.2.1",
"org.apache.hadoop" % "hadoop-mapreduce-client-core" % "2.7.2",
"org.apache.hbase" % "hbase" % "1.2.1" pomOnly(),
"org.apache.hbase" % "hbase-server" % "1.2.1",
"org.apache.spark" % "spark-sql_2.10" % "1.6.1"
)
