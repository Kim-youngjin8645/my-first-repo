package com.likelion.todo.todo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateTodoRequest(
		@NotBlank @Size(max = 255) String title
) {
}
