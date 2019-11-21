package omarbradley.com.daggersample.domain.todo

import omarbradley.com.daggersample.repo.category.CategoryRepo
import omarbradley.com.daggersample.repo.todo.TodoRepo

class DeleteTodoUseCase(
	private val todoRepo: TodoRepo, private val categoryRepo: CategoryRepo
)
