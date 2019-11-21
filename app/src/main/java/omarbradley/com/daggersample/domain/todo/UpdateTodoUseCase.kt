package omarbradley.com.daggersample.domain.todo

import omarbradley.com.daggersample.repo.todo.TodoRepo

class UpdateTodoUseCase(
	private val todoRepo: TodoRepo
)
