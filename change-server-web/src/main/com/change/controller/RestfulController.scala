package change.controller

import collection.JavaConversions._
import change.service.HttpApiRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, ResponseBody}

@Controller
@RequestMapping(Array("/rest"))
class RestfulController @Autowired()(private val httpApiRepository: HttpApiRepository) {

  @RequestMapping(value = Array("getData"), method = Array(RequestMethod.GET))
  @ResponseBody
  def getData() : java.util.Map[String, String] = {
     Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
  }

}