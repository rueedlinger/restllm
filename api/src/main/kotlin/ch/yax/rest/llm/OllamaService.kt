package ch.yax.rest.llm

import dev.langchain4j.model.chat.ChatLanguageModel
import dev.langchain4j.model.ollama.OllamaChatModel
import dev.langchain4j.service.AiServices
import jakarta.annotation.PostConstruct
import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.config.inject.ConfigProperty


@ApplicationScoped
class OllamaService {

    @ConfigProperty(name = "ollama.base-url")
    private lateinit var baseUrl: String

    @ConfigProperty(name = "ollama.model-name")
    private lateinit var modelName: String

    //private lateinit var model: ChatLanguageModel

    private lateinit var assistant: Assistant

    // init after startup
    @PostConstruct
    fun init(){
        val model = OllamaChatModel.builder()
            .baseUrl(baseUrl)
            .temperature(0.0)
            .logRequests(true)
            .logResponses(true)
            .modelName(modelName)
            .build()
        assistant = AiServices.create(Assistant::class.java, model)
    }

    fun generateResponse(prompt: String): String {
        return assistant.chat(prompt)
    }
}