package com.example.fampayassignment.Model.epoxy

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.bumptech.glide.Glide
import com.example.fampayassignment.R
import com.example.fampayassignment.databinding.SmallArrowCardViewBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class SmallArrowCard @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0,
) : ConstraintLayout(context, attributeSet, defStyle) {

    private val binding: SmallArrowCardViewBinding =
        SmallArrowCardViewBinding.inflate(LayoutInflater.from(context), this, true)

    @ModelProp
    fun setIcon(link: String) {
        Glide.with(this)
            .load(link)
            .into(binding.img)

        binding.imgarrow.setImageResource(R.drawable.images)
    }

    @ModelProp
    fun setText(textval: String) {
        binding.text1.text = textval
    }
}
