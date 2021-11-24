package ru.tms.viewbindingtest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object Router {
    fun navigate(
        fragmentManager: FragmentManager,
        fragment: Fragment,
        container: Int,
        addToBackStack: Boolean = true
    ) {
        fragmentManager
            .beginTransaction()
            .replace(container, fragment, fragment.tag)
            .apply { if (addToBackStack) addToBackStack(fragment.tag) }
            .commit()
    }
}