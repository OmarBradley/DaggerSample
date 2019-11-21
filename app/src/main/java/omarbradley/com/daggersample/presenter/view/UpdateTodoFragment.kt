package omarbradley.com.daggersample.presenter.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import omarbradley.com.daggersample.R

class UpdateTodoFragment : Fragment() {

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
	): View = inflater.inflate(R.layout.fragment_update_todo, container, false)

}
