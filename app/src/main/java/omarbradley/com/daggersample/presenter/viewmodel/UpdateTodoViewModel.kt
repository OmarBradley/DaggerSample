package omarbradley.com.daggersample.presenter.viewmodel

import androidx.lifecycle.ViewModel
import omarbradley.com.daggersample.domain.category.UpdateCategoryUseCase
import omarbradley.com.daggersample.domain.todo.UpdateTodoUseCase

class UpdateTodoViewModel(
	private val updateTodoUseCase: UpdateTodoUseCase,
	private val updateCategoryUseCase: UpdateCategoryUseCase
) : ViewModel()
