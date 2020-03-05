package com.vishal
import org.apache.hadoop.hive.ql.exec.UDF

class testudf extends  UDF{

  def evaluate(Str: String):String = {
    if(Str == null)
    return null

    val retstr = Str.substring(0,3)
    return retstr
  }

}
