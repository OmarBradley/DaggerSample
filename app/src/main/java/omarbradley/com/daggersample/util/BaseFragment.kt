package omarbradley.com.daggersample.util

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.navigation.fragment.findNavController

abstract class BaseFragment : Fragment(), LifecycleOwner {

	fun navigate(@IdRes navigationRes: Int, data: Bundle?) {
		findNavController().navigate(navigationRes, data)
	}

}
