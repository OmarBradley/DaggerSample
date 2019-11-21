package omarbradley.com.daggersample

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import omarbradley.com.daggersample.di.DaggerAppComponent

class DaggerSampleApp : DaggerApplication() {

	override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
		DaggerAppComponent.factory().create(applicationContext)

}
