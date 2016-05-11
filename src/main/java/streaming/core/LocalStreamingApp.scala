package streaming.core

import java.util.{List => JList, Map => JMap}

import net.csdn.ServiceFramwork
import net.csdn.bootstrap.Application


object LocalStreamingApp {


  def main(args: Array[String]): Unit = {
    StreamingApp.main(Array(
      "-streaming.master", "local[2]",
      "-streaming.duration", "20",
      "-streaming.name", "god",
      "-streaming.rest", "true"
      //"-streaming.testinputstream.offsetPath", "/tmp/localstreampingapp"
    ))
  }

}

object AM {


  def main(args: Array[String]): Unit = {
    ServiceFramwork.scanService.setLoader(classOf[StreamingApp])
    Application.main(Array())
  }

}
