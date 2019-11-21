package omarbradley.com.daggersample.domain.category

import omarbradley.com.daggersample.repo.category.CategoryRepo
import omarbradley.com.daggersample.repo.todo.TodoRepo

class UpdateCategoryUseCase(
	private val todoRepo: TodoRepo, private val categoryRepo: CategoryRepo
)
