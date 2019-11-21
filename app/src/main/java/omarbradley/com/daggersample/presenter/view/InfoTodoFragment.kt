package omarbradley.com.daggersample.presenter.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import omarbradley.com.daggersample.R

class InfoTodoFragment : DaggerFragment() {

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
	): View = inflater.inflate(R.layout.fragment_info_todo, container, false)

}
