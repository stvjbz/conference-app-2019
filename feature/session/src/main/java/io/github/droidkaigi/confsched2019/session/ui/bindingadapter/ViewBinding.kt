package io.github.droidkaigi.confsched2019.session.ui.bindingadapter

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["app:visibleGone"])
fun showHide(view: View, show: Boolean) {
    view.visibility = if (show) View.VISIBLE else View.GONE
}
