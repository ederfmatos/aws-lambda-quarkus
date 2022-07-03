package com.ederfmatos.lambda.handler

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class FirstHandler: RequestHandler<Any, String> {
    override fun handleRequest(input: Any, context: Context?): String {
        println("[FirstHandler] - input = $input | context = $context")
        return "OK"
    }
}