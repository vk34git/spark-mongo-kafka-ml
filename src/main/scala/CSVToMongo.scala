// scalastyle:off println
package org.apache.spark.examples.streaming

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext

object CSVToMongo {
  def main(args: Array[String]) {
    if (args.length < 2) {
      System.err.println(s"""
        |Usage: CSVToMongo <csvfile> <mongoconn>
        |  <csvfile> is a file  of titanic data
        |  <mongoconn> is mongo server
        |
        """.stripMargin)
      System.exit(1)
    }


    val Array(csvfile, mongoconn) = args

    //set up the spark configuration and create contexts
    val sparkConf = new SparkConf().setAppName("SparkSessionZipsExample").setMaster("local")
    // your handle to SparkContext to access other context like SQLContext
    val sc = new SparkContext(sparkConf)
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val titanicDF = sqlContext.read.format("com.databricks.spark.csv").option("header","true").load("file:///c:\\SparkCourse\\titanic\\train.csv")
    titanicDF.show()

    
   object MongoInterface {
     def ReadDB() {
	import com.mongodb.spark.MongoSpark
	import com.mongodb.spark.config.{ReadConfig, WriteConfig}
	val writeConfig = WriteConfig(Map("uri"->"mongodb://localhost:27017/test.TitanicTrain"))
        MongoSpark.save(titanicDF.write.mode("overwrite"),writeConfig)
	}
    }	
    MongoInterface.ReadDB()
  }
}
