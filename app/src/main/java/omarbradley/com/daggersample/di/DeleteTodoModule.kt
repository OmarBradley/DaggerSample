package omarbradley.com.daggersample.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import omarbradley.com.daggersample.presenter.view.DeleteTodoFragment
import omarbradley.com.daggersample.presenter.viewmodel.DeleteTodoViewModel

@Module
abstract class DeleteTodoModule {

	@ContributesAndroidInjector(modules = [ViewModelBuilder::class])
	abstract fun deleteTodoFragment(): DeleteTodoFragment

	@Binds
	@IntoMap
	@ViewModelKey(DeleteTodoViewModel::class)
	abstract fun bindViewModel(viewModel: DeleteTodoViewModel): ViewModel

}
