package ch.yax.rest.llm

import dev.langchain4j.service.SystemMessage

interface Assistant {
    @SystemMessage("Give a short answer to the question. If you don't know the answer, say 'I don't know'.")
    fun chat(userMessage: String): String
}