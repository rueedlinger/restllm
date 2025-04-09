package ch.yax.rest.llm

import jakarta.validation.constraints.NotBlank

data class LLMInput(
    @field:NotBlank
    val prompt: String
)