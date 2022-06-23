package com.example.fampayassignment.Model.epoxy

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.example.fampayassignment.databinding.ImgCardViewBinding
import java.net.URL


@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class ImageCard @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0,
) : ConstraintLayout(context, attributeSet, defStyle) {

    private val binding: ImgCardViewBinding =
        ImgCardViewBinding.inflate(LayoutInflater.from(context), this, true)

    @ModelProp
    fun setImage(link: String) {
        val bitmap = BitmapFactory.decodeStream(URL(link).openConnection().getInputStream())
        val background = BitmapDrawable(resources, bitmap)
        binding.image.setImageDrawable(background)
    }

}