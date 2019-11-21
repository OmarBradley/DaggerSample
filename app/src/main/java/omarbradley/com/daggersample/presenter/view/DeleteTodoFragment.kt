package omarbradley.com.daggersample.presenter.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import omarbradley.com.daggersample.R
import omarbradley.com.daggersample.presenter.viewmodel.DeleteTodoViewModel
import javax.inject.Inject

class DeleteTodoFragment : DaggerFragment() {

	@Inject
	lateinit var viewModelFactory: ViewModelProvider.Factory
	private val viewModel by viewModels<DeleteTodoViewModel> { viewModelFactory }

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
	): View = inflater.inflate(R.layout.fragment_delete_todo, container, false)

}
