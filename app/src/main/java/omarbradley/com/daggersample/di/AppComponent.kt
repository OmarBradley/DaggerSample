package omarbradley.com.daggersample.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import omarbradley.com.daggersample.DaggerSampleApp
import javax.inject.Singleton

@Singleton
@Component(
	modules = [AppModule::class, AndroidSupportInjectionModule::class, DeleteTodoModule::class]
)
interface AppComponent : AndroidInjector<DaggerSampleApp> {

	@Component.Factory
	interface Factory {
		fun create(@BindsInstance applicationContext: Context): AppComponent
	}

}
