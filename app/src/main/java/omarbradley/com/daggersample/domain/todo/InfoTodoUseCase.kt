package omarbradley.com.daggersample.domain.todo

import omarbradley.com.daggersample.repo.todo.TodoRepo

class InfoTodoUseCase(
	private val todoUseCase: TodoRepo
)
