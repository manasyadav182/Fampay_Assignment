package com.example.fampayassignment.Model.epoxy

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.bumptech.glide.Glide
import com.example.fampayassignment.databinding.ImgCardViewBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
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
//        var background : BitmapDrawable? = null
//        GlobalScope.launch {
//            val bitmap = BitmapFactory.decodeStream(URL(link).openConnection().getInputStream())
//            background = BitmapDrawable(resources, bitmap)
//        }
        Glide.with(this)
            .load(link)
            .into(binding.image)
    }

}