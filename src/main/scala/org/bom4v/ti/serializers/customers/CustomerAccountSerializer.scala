package org.bom4v.ti.serializers.customers

import org.apache.spark.sql.types.{StructType,StructField,StringType,IntegerType,DoubleType}

/**
 * CustomerAccount
 */
object CustomerAccount {

  /**
    * Header:
    *  State,
    *  Account length,
    *  Area code,
    *  International plan,
    *  Voice mail plan,
    *  Number vmail messages,
    *  Total day minutes,
    *  Total day calls,
    *  Total day charge,
    *  Total eve minutes,
    *  Total eve calls,
    *  Total eve charge,
    *  Total night minutes,
    *  Total night calls,
    *  Total night charge,
    *  Total intl minutes,
    *  Total intl calls,
    *  Total intl charge,
    *  Customer service calls,
    *  Churn
    */
  val customerAccountSchema =
    StructType (
      Array (
        StructField("state", StringType, true),
        StructField("len", IntegerType, true),
        StructField("acode", StringType, true),
        StructField("intlplan", StringType, true),
        StructField("vplan", StringType, true),
        StructField("numvmail", DoubleType, true),
        StructField("tdmins", DoubleType, true),
        StructField("tdcalls", DoubleType, true),
        StructField("tdcharge", DoubleType, true),
        StructField("temins", DoubleType, true),
        StructField("tecalls", DoubleType, true),
        StructField("techarge", DoubleType, true),
        StructField("tnmins", DoubleType, true),
        StructField("tncalls", DoubleType, true),
        StructField("tncharge", DoubleType, true),
        StructField("timins", DoubleType, true),
        StructField("ticalls", DoubleType, true),
        StructField("ticharge", DoubleType, true),
        StructField("numcs", DoubleType, true),
        StructField("churn", StringType, true)
      )
    )
}
