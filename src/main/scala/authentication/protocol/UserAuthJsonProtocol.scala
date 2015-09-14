package authentication.protocol

import authentication.{UserLoginRequest, UserRegistrationRequest}
import spray.json.DefaultJsonProtocol

/**
 * Created by piobab on 14.09.15.
 */
object UserAuthJsonProtocol extends DefaultJsonProtocol {
  implicit val userRegistrationRequestFormat = jsonFormat2(UserRegistrationRequest)
  implicit val userLoginRequestFormat = jsonFormat2(UserLoginRequest)
}
