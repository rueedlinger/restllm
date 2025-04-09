package ch.yax.rest.llm

import jakarta.inject.Inject
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/api/llm")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class LLMController {

    @Inject
    lateinit var ollamaService: OllamaService

    @POST
    @Path("/input")
    fun handleLLMInput(input: LLMInput): Response {
        // Process the input (e.g., send it to an LLM service)
        val prompt = input.prompt
        val response = ollamaService.generateResponse(prompt)
        return Response.ok(mapOf("response" to response)).build()
    }
}