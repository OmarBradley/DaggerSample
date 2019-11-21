package omarbradley.com.daggersample.presenter.viewmodel

import androidx.lifecycle.ViewModel
import omarbradley.com.daggersample.domain.category.UpdateCategoryUseCase
import omarbradley.com.daggersample.domain.todo.InfoTodoUseCase

class InfoTodoViewModel(
	private val infoTodoUseCase: InfoTodoUseCase,
	private val updateCategoryUseCase: UpdateCategoryUseCase
) : ViewModel() {

	fun onClickDeleteTodoFragment() {

	}

	fun onClickUpdateTodoFragment() {

	}

}
