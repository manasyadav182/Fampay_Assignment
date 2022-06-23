package com.example.fampayassignment.Model.epoxy

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.bumptech.glide.Glide
import com.example.fampayassignment.Model.Entities
import com.example.fampayassignment.databinding.BigDisplayCardViewBinding


@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class BigDisplayCard @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0,
) : ConstraintLayout(context, attributeSet, defStyle) {

    private val binding: BigDisplayCardViewBinding =
        BigDisplayCardViewBinding.inflate(LayoutInflater.from(context), this, true)
    lateinit var link : String

    init {
        binding.cta.setOnClickListener{
            val uri: Uri =
                Uri.parse(link)

            val intent = Intent(Intent.ACTION_VIEW, uri)
            context.startActivity(intent)
        }

        binding.view.setOnLongClickListener {
            setchange()
        }
        binding.bt2.setOnClickListener{
            val newLayoutParams: LayoutParams = binding.view.getLayoutParams() as LayoutParams
            newLayoutParams.setMargins(0,0, 0, 0)
            binding.view.setLayoutParams(newLayoutParams)

            binding.bt1.visibility = GONE
            binding.bt2.visibility = GONE
        }
    }

    fun setchange(): Boolean {
        val newLayoutParams: LayoutParams = binding.view.getLayoutParams() as LayoutParams
        newLayoutParams.setMargins(500,0, -500, 0)
        binding.view.setLayoutParams(newLayoutParams)

        binding.bt1.visibility = VISIBLE
        binding.bt2.visibility = VISIBLE
        return true
    }

    @ModelProp
    fun setBackgroundImage(url : String){
        Glide.with(this)
            .load(url)
            .into(binding.imgview)
    }

    @ModelProp
    fun setTitleText1(dclass: Entities?) {
        binding.text1.text = dclass?.text
        binding.text1.setTextColor(Color.parseColor(dclass?.color))
    }

    @ModelProp
    fun setTitleText2(dclass: Entities?) {
        binding.text2.text = dclass?.text
        binding.text2.setTextColor(Color.parseColor(dclass?.color))
    }

    @ModelProp
    fun setTextDesc(dclass: Entities) {
        binding.textdesc.text = dclass?.text
        binding.textdesc.setTextColor(Color.parseColor(dclass?.color))
    }

    @ModelProp
    fun setCta(link: String) {
        this.link = link
    }
}
