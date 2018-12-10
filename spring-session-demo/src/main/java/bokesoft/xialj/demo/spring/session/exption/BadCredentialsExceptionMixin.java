package bokesoft.xialj.demo.spring.session.exption;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
@JsonIgnoreProperties(ignoreUnknown = true, value = {"cause", "stackTrace"})
public class BadCredentialsExceptionMixin {
	@JsonCreator
 	BadCredentialsExceptionMixin(@JsonProperty("message") String message) {}
}
