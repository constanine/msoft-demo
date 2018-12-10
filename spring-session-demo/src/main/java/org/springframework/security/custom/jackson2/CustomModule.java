package org.springframework.security.custom.jackson2;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.jackson2.SecurityJackson2Modules;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import bokesoft.xialj.demo.spring.session.exption.BadCredentialsExceptionMixin;

public class CustomModule extends SimpleModule{

	/**
	 * 
	 */
	private static final long serialVersionUID = 20181204001L;

	public CustomModule() {
		super(CustomModule.class.getName(), new Version(1, 0, 0, null, null, null));
	}

	@Override
	public void setupModule(SetupContext context) {
		SecurityJackson2Modules.enableDefaultTyping((ObjectMapper) context.getOwner());
		context.setMixInAnnotations(BadCredentialsException.class, BadCredentialsExceptionMixin.class);
	}
}
