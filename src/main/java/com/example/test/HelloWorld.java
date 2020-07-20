package com.example.test;

import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.model.ServiceException;

public class HelloWorld {

	static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	static final String FUNCTION_NAME = "serverless-hello";

	public static void main(String... args) {
		invokeLambda();
	}

	public static void invokeLambda() {

		final AWSLambda awsLambda = AWSLambdaClientBuilder.defaultClient();
		InvokeResult invokeResult = null;

		try {

			InvokeRequest invokeRequest = new InvokeRequest().withFunctionName(FUNCTION_NAME)
					.withPayload("{\n\"path\": \"my/path\",\n\"key2\": \"value2\",\n\"key3\": \"value3\"\n}");

			invokeResult = awsLambda.invoke(invokeRequest);

			String ans = new String(invokeResult.getPayload().array(), StandardCharsets.UTF_8);

			// write out the return value
			logger.info(ans);

		} catch (ServiceException e) {
			logger.error("Error while executing " + FUNCTION_NAME, e);
		} finally {
			awsLambda.shutdown();
		}
		String s = Optional.ofNullable(invokeResult)
				.map(InvokeResult::getStatusCode)
				.map(String::valueOf)
				.orElse("null");
		
		logger.info("Status {}", s);

	}
}
