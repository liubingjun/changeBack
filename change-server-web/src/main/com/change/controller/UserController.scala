package change.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UserController {

  @RequestMapping(Array("/login"))
  def login: String = { "/login" }

}