package omarbradley.com.daggersample.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import omarbradley.com.daggersample.domain.category.UpdateCategoryUseCase
import omarbradley.com.daggersample.domain.todo.DeleteTodoUseCase
import omarbradley.com.daggersample.domain.todo.InfoTodoUseCase
import omarbradley.com.daggersample.domain.todo.UpdateTodoUseCase
import omarbradley.com.daggersample.repo.category.CategoryRepo
import omarbradley.com.daggersample.repo.category.remote.CategoryRoomRepo
import omarbradley.com.daggersample.repo.todo.TodoRepo
import omarbradley.com.daggersample.repo.todo.local.TodoRoomRepo
import javax.inject.Singleton

@Module(includes = [ApplicationModuleBinds::class])
class AppModule {

	@Provides
	@Singleton
	fun provideUpdateCategoryUseCase(todoRepo: TodoRepo, categoryRepo: CategoryRepo) =
		UpdateCategoryUseCase(todoRepo, categoryRepo)

	@Provides
	@Singleton
	fun provideUpdateTodoUseCase(todoRepo: TodoRepo) = UpdateTodoUseCase(todoRepo)

	@Provides
	@Singleton
	fun provideInfoTodoUseCase(todoRepo: TodoRepo) = InfoTodoUseCase(todoRepo)

	@Provides
	@Singleton
	fun provideDeleteTodoUseCase(todoRepo: TodoRepo, categoryRepo: CategoryRepo) =
		DeleteTodoUseCase(todoRepo, categoryRepo)

}

@Module
abstract class ApplicationModuleBinds {

	@Singleton
	@Binds
	abstract fun bindTodoRepo(repo: TodoRoomRepo): TodoRepo

	@Singleton
	@Binds
	abstract fun bindCategoryRepo(repo: CategoryRoomRepo): CategoryRepo

}

