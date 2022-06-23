package com.example.fampayassignment.Model.epoxy

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.bumptech.glide.Glide
import com.example.fampayassignment.Model.Cards
import com.example.fampayassignment.databinding.ScrollableMultipleCardBinding


@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class SmallDisplayCardScrollable @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0,
) : ConstraintLayout(context, attributeSet, defStyle) {

    private val binding: ScrollableMultipleCardBinding =
        ScrollableMultipleCardBinding.inflate(LayoutInflater.from(context), this, true)

    @ModelProp
    fun setIcon1(link: String) {
        Glide.with(this)
            .load(link)
            .into(binding.image1)
    }

    @ModelProp
    fun setIcon2(link: String) {
        Glide.with(this)
            .load(link)
            .into(binding.image2)
    }

    @ModelProp
    fun setText1(textval: String) {
        binding.text1.text = textval
    }

    @ModelProp
    fun setText2(textval: String) {
        binding.text2.text = textval
    }

    @ModelProp
    fun setText3(cards: Cards) {
        binding.text3.text = cards.formattedDescription?.entities?.get(0)?.text
        binding.layout2.setBackgroundColor(Color.parseColor(cards.bgColor))
    }


}
