package omarbradley.com.daggersample.presenter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import omarbradley.com.daggersample.domain.todo.DeleteTodoUseCase
import javax.inject.Inject

class DeleteTodoViewModel @Inject constructor(
	private val deleteTodoUseCase: DeleteTodoUseCase
) : ViewModel() {

	init {
		viewModelScope.launch {




		}
	}

}
