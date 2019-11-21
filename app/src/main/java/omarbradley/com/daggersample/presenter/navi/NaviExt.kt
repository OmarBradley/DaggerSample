package omarbradley.com.daggersample.presenter.navi

import omarbradley.com.daggersample.R
import omarbradley.com.daggersample.util.BaseFragment

fun BaseFragment.navi_infoTodo_to_deleteTodo() {
	navigate(R.id.action_infoTodo_to_deleteTodo, null)
}

fun BaseFragment.navi_infoTodo_to_updateTodo() {
	navigate(R.id.action_infoTodo_to_updateTodo, null)
}
